
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Loadlog {
        
        public boolean load(String path,EquipaList equipa, Jogo jogo){

            try {
                Files.lines(Paths.get(path))
                        .forEach(fields -> parse(equipa,fields,jogo));
                return true;
            } catch (IOException e){
                e.printStackTrace();
                return false;
            }
        }
    

       
        
        public void parse (EquipaList equipaList, String s, Jogo jogo) {

            String[] sDividida = s.split("[:,->]+");  //.split(",");
                if (sDividida[0].equals("Equipa")){
                    equipaList.criaEquipa(sDividida[1]);  
                }else if(sDividida[0].equals("Jogo")){
                //Sporting Club Chopin,
                //Sporting Club Schubert,
                //4,
                //0,
                //2021
                //-03
                //-28,
                //20,42,8,44,16,25,4,26,50,35,37,
                //44->40,20->47,42->38,
                //36,23,1,48,16,50,15,11,17,22,39,
                //17->5,39->30,30->43
                ArrayList<Jogador> titularesCasa = new ArrayList<>();
                ArrayList<Jogador> titularesFora = new ArrayList<>();

                ArrayList<Jogador> suplentesCasa = new ArrayList<>();
                ArrayList<Jogador> suplentesFora = new ArrayList<>();

                EquipaJogo casa = new EquipaJogo( Integer.parseInt( sDividida[1]),
                                                                   Estado.NEUTRO,
                                                                   titularesCasa,
                                                                   suplentesCasa);
                EquipaJogo fora = new EquipaJogo( Integer.parseInt( sDividida[2]),
                                                                    Estado.NEUTRO, 
                                                                    titularesFora, 
                                                                    suplentesFora);
                Jogo jogo = new Jogo(LocalDate.of(year, month, dayOfMonth));
                }else{
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
