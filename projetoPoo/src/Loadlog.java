
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
            
            String[] sDividida = s.split("[:,[->]]+");  //.split(",");
                if (sDividida[0].equals("Equipa")){
                    System.out.println("EQUIPA"); 
                    equipaList.criaEquipa(sDividida[1]);  
                }else if(sDividida[0].equals("Jogo")){
                    System.out.println("JOGO"); 
                //Sporting Club Chopin,     1
                //Sporting Club Schubert,   2
                //4,                        3 
                //0,                        4
                //2021                      5
                //-03 6
                //-28, 7
                //20,42,8,44,16,25,4,26,50,35,37,
                //44->40,20->47,42->38,
                //36,23,1,48,16,50,15,11,17,22,39,
                //17->5,39->30,30->43
                Equipa casaInfo = equipaList.verEquipa(sDividida[1]);
                Equipa foraInfo = equipaList.verEquipa(sDividida[2]);
                
                ArrayList<Jogador> titularesCasa = new ArrayList<>();
                for(int i = 8;i < 19; i++)
                titularesCasa.add(casaInfo.getJogador(Integer.parseInt( sDividida[i])));

                ArrayList<Jogador> titularesFora = new ArrayList<>();
                for(int i = 25;i < 36; i++)
                titularesFora.add(foraInfo.getJogador(Integer.parseInt( sDividida[i])));

                ArrayList<Jogador> suplentesCasa = new ArrayList<>();
                ArrayList<Jogador> suplentesFora = new ArrayList<>();

                EquipaJogo casa = new EquipaJogo( Integer.parseInt( sDividida[3]),
                                                                   Estado.NEUTRO,
                                                                   titularesCasa,
                                                                   suplentesCasa);
                
                for(int i = 19;i < 25; i=i+2)
                casa.substituir(casaInfo.getJogador(Integer.parseInt( sDividida[i+1])), 
                                casaInfo.getJogador(Integer.parseInt( sDividida[i])));

                EquipaJogo fora = new EquipaJogo( Integer.parseInt( sDividida[4]),
                                                                    Estado.NEUTRO, 
                                                                    titularesFora, 
                                                                    suplentesFora);

                
                for(int i = 36;i < 42; i=i+2)
                casa.substituir(casaInfo.getJogador(Integer.parseInt( sDividida[i+1])), 
                                casaInfo.getJogador(Integer.parseInt( sDividida[i])));

                Jogo jogo = new Jogo(LocalDate.of(Integer.parseInt( sDividida[5]), 
                                                  Integer.parseInt( sDividida[6]), 
                                                  Integer.parseInt( sDividida[7])),
                                                  casa,
                                                  fora,
                                                  3,
                                                  3);

                                                
                jogoList.addJogo(jogo);
                }else{
                    System.out.println("jOGADOR"); 
                    Jogador jogador = new Jogador(sDividida[1], //nome
                                                    Integer.parseInt(sDividida[3]), //velocidade
                                                    Integer.parseInt(sDividida[4]), // destreza
                                                    Integer.parseInt(sDividida[5]), // res
                                                    Integer.parseInt(sDividida[6]), //impulsao
                                                    Integer.parseInt(sDividida[7]), //jogo de cabeça
                                                    Integer.parseInt(sDividida[8]), //remate
                                                    Integer.parseInt(sDividida[9]), // cap de passe  
                                                    new ArrayList<>());
                    
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
