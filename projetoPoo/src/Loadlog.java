
import model.StringInvalidoException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class Loadlog {

        private String[] ficheirosDefault;
        
        public StreamLoader (){
            this.ficheirosDefault = new String[1];
            this.ficheirosDefault[0] ="../input_files/log2.txt";
        }
        
        public boolean load(String paths[],Equipa equipa, Jogador jogador , Jogo jogo){
            String path;
            path = ficheirosDefault[0];

            
            try {
                Files.lines(Paths.get(path))
                        .forEach(fields -> parse(equipa,fields,jogador,jogo);
    
            } catch (IOException e){
                e.printStackTrace();
                return false;
            }
        }
    

       
        
        public void parse (EquipaList equipa, String s, Jogador jogador, Jogo jogo,int i ) {

            String[] sDividida = s.split(":").split(",");
                if (sDividida[0].equals("Equipa")){
                    equipa.add(criaEquipa(sDividida[1]));  
                }
                //criar addjogador
                else {
                    if (ssDividida[0].equals("Guarda-Redes")){
                        GuardaRedes guardaredes = new GuardaRedes(sDividida[1], //nome
                                                                  sDividida[2], //velocidade
                                                                  sDividida[3], // destreza
                                                                  sDividida[4],// res
                                                                  sDividida[5], //impulsao
                                                                  sDividida[6], //jogo de cabeça
                                                                  sDividida[7],//remate
                                                                  sDividida[8],// cap de passe  
                                                                  sDividida[9] );
                        
                        
                         equipa.getLast().adicionarjogador(guardaredes, 0);
                    }
                    

                     
                    adicionaJogador (sDividida[0], sDividida[1], sDividida[2], sDividida[3], sDividida[4]);
                else adicionaJogador(sDividida[0], sDividida[1], sDividida[2], sDividida[3], "");
            }
        }
    


    
        public void addBusiness (IBusiness b){
            this.catalogo.putIfAbsent(b.getBusinessId(),b.clone());
        }
}
