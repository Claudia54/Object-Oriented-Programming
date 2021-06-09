
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
    
            
        
        public void parse (Equipa equipa, String s, Jogador jogador, Jogo jogo ) {

            String[] sDividida = s.split(":").split(";");
                if (sDividida[0].equals("Equipa")){
                    criaEquipa(sDividida[1]);  
                }
                //criar addjogador
                else {
                     model.addJogador (sDividida[0], sDividida[1], sDividida[2], sDividida[3], sDividida[4]);
                else model.addJogador(sDividida[0], sDividida[1], sDividida[2], sDividida[3], "");
            }
        }
    
    
        public void addBusiness (IBusiness b){
            this.catalogo.putIfAbsent(b.getBusinessId(),b.clone());
        }
}
