
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Loadlog {

        private String[] ficheirosDefault;
        
        public void StreamLoader (){
            this.ficheirosDefault = new String[1];
            this.ficheirosDefault[0] ="../input_files/log2.txt";
        }
        
        public boolean load(String paths[],EquipaList equipa, Jogador jogador , Jogo jogo){
            String path;
            path = ficheirosDefault[0];

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
                                                    Integer.parseInt(sDividida[2]), //velocidade
                                                    Integer.parseInt(sDividida[3]), // destreza
                                                    Integer.parseInt(sDividida[4]),// res
                                                    Integer.parseInt(sDividida[5]), //impulsao
                                                    Integer.parseInt(sDividida[6]), //jogo de cabeça
                                                    Integer.parseInt(sDividida[7]),//remate
                                                    Integer.parseInt(sDividida[8]),// cap de passe  
                                                    new ArrayList<>());
                    
                    if (sDividida[0].equals("Guarda-Redes")){
                        GuardaRedes guardaredes = new GuardaRedes(jogador , Integer.parseInt(sDividida[9]));
                        equipaList.getLast().adicionarjogador(guardaredes, 0);
                    
                    }else if(sDividida[0].equals("Avancado")){
                        Atacante atacante = new Atacante(jogador , Integer.parseInt(sDividida[9]));
                        equipaList.getLast().adicionarjogador(atacante, 0);
    
                    }
                    

            
            }
        }

        
    


    
        //public void addBusiness (IBusiness b){
        //    this.catalogo.putIfAbsent(b.getBusinessId(),b.clone());
        //}


}
