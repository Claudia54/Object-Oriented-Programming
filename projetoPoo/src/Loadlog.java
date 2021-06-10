
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Loadlog {

        private String[] ficheirosDef;
        
        public void StreamLoader (){
            this.ficheirosDef = new String[1];
            this.ficheirosDef[0] ="log2.txt";
        }
        
        public boolean load(String paths[],EquipaList equipa, Jogo jogo){
            String path;
            path = paths[0];

            try {
                Files.lines(Paths.get("/home/gusto/Desktop/POO/projetoPoo/out/log2.txt"))
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
                        equipaList.getLast().adicionarjogadorRandom(guardaredes);
                    
                    } else if(sDividida[0].equals("Avancado")){
                        Atacante atacante = new Atacante(jogador , Integer.parseInt(sDividida[9]));
                        equipaList.getLast().adicionarjogadorRandom(atacante);
    
                    } else if(sDividida[0].equals("Medio")){
                        Medio medio = new Medio(jogador , Integer.parseInt(sDividida[9]));
                        equipaList.getLast().adicionarjogadorRandom(medio);
    
                    } else if(sDividida[0].equals("Defesa")){
                        Defesa defesa = new Defesa(jogador , Integer.parseInt(sDividida[9]));
                        equipaList.getLast().adicionarjogadorRandom(defesa);
    
                    } else if(sDividida[0].equals("Lateral")){
                        Lateral lateral = new Lateral(jogador , Integer.parseInt(sDividida[9]));
                        equipaList.getLast().adicionarjogadorRandom(lateral);
    
                    }
                    

            
            }
        }

        public String[] getFichDefaut() {
            String[] ficheirosDefault = new String[1];
            ficheirosDefault[0] ="log2.txt";
            return ficheirosDefault;
            }

        
    


    
        //public void addBusiness (IBusiness b){
        //    this.catalogo.putIfAbsent(b.getBusinessId(),b.clone());
        //}


}
