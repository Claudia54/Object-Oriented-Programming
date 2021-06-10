
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

            String[] sDividida = s.split("[:,]+");  //.split(",");
                if (sDividida[0].equals("Equipa")){
                    equipaList.addEquipa(sDividida[1]);  
                }else if(sDividida[0].equals("Jogo")){

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
