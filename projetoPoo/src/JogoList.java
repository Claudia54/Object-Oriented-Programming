import java.util.ArrayList;
import java.util.List;

public class JogoList {
    List<Jogo> jogos;

    public JogoList(){
        this.jogos= new ArrayList <>();
    }
    
    public Jogo getLast(){
        Jogo e = jogos.get(jogos.size()-1);
        return e;
    }
 
    public Jogo getJogo(int n){
     Jogo e = jogos.get(n);
     return e;
     }

     public Jogo criaJogo(){
        Jogo nova = new Jogo();
        this.jogos.add(nova);
        return nova;
    }
 
    public void addJogo(Jogo jogo){
     this.jogos.add(jogo);
     }
 
     public void consultarJogo(Equipa a , Equipa b) {
         /*Equipa e = jogos.get(n);
         e.verJogadores();*/
     }
 
     public int size() {
         return jogos.size();
     }
 
     // so o nome de tds as equipas 
     public void mostrarEquipas(){
     StringBuilder sb = new StringBuilder();
     int aux=0;
     for(Equipa i : list) {
       aux++;
        sb.append( aux + "-" + i.getEquipa()).append("\n");
     }
     System.out.println(sb.toString());
 
     }
 
     // dado o nome do jogador diz td sobre ele 
     public Jogador consultajogador (String nome) {
         View view = new View ();
         Jogador f = null ;
     try{
     for (Equipa aux :list ){
         for (Jogador i : aux.getJogadores().values()){
              if (i.getNome().equals(nome)){
                   f= i;
                 }
         
             }
         }
     }
     catch (InputMismatchException e) {
        view.notAnInstruction();
         }
     return f ;
     }
 
  
 
 
 }
 
 



    

  
}