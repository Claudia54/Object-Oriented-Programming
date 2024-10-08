package Loaders;
import model.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Stream;

public class Loadlog {
        
        public boolean load(String path,EquipaList equipa, JogoList jogo){

            try {
                Files.lines(Paths.get(path))
                        .forEach(fields -> parse(equipa,fields,jogo));
                return true;
            } catch (IOException e){
                e.printStackTrace();
                return false;
            }
        }
    

       
        
        public void parse (EquipaList equipaList, String s, JogoList jogoList) {
            
            String[] sDividida = s.split(":|,|->");  //.split(",");
            
                if (sDividida[0].equals("Equipa")){
                    
                    equipaList.criaEquipa(sDividida[1]);  
                }else if(sDividida[0].equals("Jogo")){
                    
                Equipa casaInfo = equipaList.verEquipa(sDividida[1]);
                Equipa foraInfo = equipaList.verEquipa(sDividida[2]);
                
                ArrayList<Jogador> titularesCasa = new ArrayList<>();
                for(int i = 6;i < 17; i++){

                titularesCasa.add(casaInfo.getJogador(Integer.parseInt( sDividida[i])));
                    System.out.println(sDividida[i]);
                }
                ArrayList<Jogador> titularesFora = new ArrayList<>();
                for(int i = 23;i < 34; i++)
                titularesFora.add(foraInfo.getJogador(Integer.parseInt( sDividida[i])));

                ArrayList<Jogador> suplentesCasa = new ArrayList<>();
                ArrayList<Jogador> suplentesFora = new ArrayList<>();

                ArrayList<SimpleEntry<Integer,Integer>> supCasa = new ArrayList<>();
                ArrayList<SimpleEntry<Integer,Integer>> supFora = new ArrayList<>();

                EquipaJogo casa = new EquipaJogo(sDividida[1], 
                                                 Integer.parseInt( sDividida[3]),
                                                                   Estado.NEUTRO,
                                                                   titularesCasa,
                                                                   suplentesCasa);
                
                for(int i = 17;i < 23; i=i+2){

                    casa.substituir(casaInfo.getJogador(Integer.parseInt( sDividida[i+1])), 
                    casaInfo.getJogador(Integer.parseInt( sDividida[i])));
                    supCasa.add(new SimpleEntry<Integer,Integer>( 
                        Integer.parseInt( sDividida[i+1]),
                        Integer.parseInt( sDividida[i])));
                    
                }

                EquipaJogo fora = new EquipaJogo( sDividida[2],
                                                  Integer.parseInt( sDividida[4]),
                                                                    Estado.NEUTRO, 
                                                                    titularesFora, 
                                                                    suplentesFora);

                
                for(int i = 34;i < 40; i=i+2){

                     casa.substituir(casaInfo.getJogador(Integer.parseInt( sDividida[i+1])), 
                    casaInfo.getJogador(Integer.parseInt( sDividida[i])));
                    supFora.add(new SimpleEntry<Integer,Integer>( 
                        Integer.parseInt( sDividida[i+1]),
                        Integer.parseInt( sDividida[i])));
                }
                String[] sDivididaAux = sDividida[5].split("-");
                Jogo jogo = new Jogo(LocalDate.of(Integer.parseInt( sDivididaAux[0]), 
                                                  Integer.parseInt( sDivididaAux[1]), 
                                                  Integer.parseInt( sDivididaAux[2])),
                                                  casa,
                                                  fora,
                                                  3,
                                                  3);

                                                
                jogoList.addJogo(jogo);
                }else{
                    
                    Jogador jogador = new Jogador(sDividida[1], //nome
                                                    Integer.parseInt(sDividida[3]), //velocidade
                                                    Integer.parseInt(sDividida[4]), // destreza
                                                    Integer.parseInt(sDividida[5]), // res
                                                    Integer.parseInt(sDividida[6]), //impulsao
                                                    Integer.parseInt(sDividida[7]), //jogo de cabeça
                                                    Integer.parseInt(sDividida[8]), //remate
                                                    Integer.parseInt(sDividida[9]), // cap de passe  
                                                    new ArrayList<>(),
                                                    Integer.parseInt(sDividida[2]));
                    
                    if (sDividida[0].equals("Guarda-Redes")){
                        GuardaRedes guardaredes = new GuardaRedes(jogador , Integer.parseInt(sDividida[10]));
                        equipaList.getLast().adicionarjogador(guardaredes,Integer.parseInt( sDividida[2]));
                    
                    } else if(sDividida[0].equals("Avancado")){
                        Atacante atacante = new Atacante(jogador);
                        equipaList.getLast().adicionarjogador(atacante,Integer.parseInt( sDividida[2]));
    
                    } else if(sDividida[0].equals("Medio")){
                        Medio medio = new Medio(jogador , Integer.parseInt(sDividida[10]));
                        equipaList.getLast().adicionarjogador(medio,Integer.parseInt( sDividida[2]));
    
                    } else if(sDividida[0].equals("Defesa")){
                        Defesa defesa = new Defesa(jogador);
                        equipaList.getLast().adicionarjogador(defesa,Integer.parseInt( sDividida[2]));
    
                    } else if(sDividida[0].equals("Lateral")){
                        Lateral lateral = new Lateral(jogador , Integer.parseInt(sDividida[10]));
                        equipaList.getLast().adicionarjogador(lateral, Integer.parseInt( sDividida[2]));
    
                    }
            
            }
        }

        public String getFichDefaut() {
            String ficheirosDefault = new String();
            ficheirosDefault ="log2.txt";
            return ficheirosDefault;
            }

        

}
