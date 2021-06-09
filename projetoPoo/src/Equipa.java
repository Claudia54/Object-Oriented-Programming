
import java.util.ArrayList;
import java.util.HashMap;
//import static java.util.stream.Collectors.toCollection;
//import static java.lang.System.out;
import java.util.Map;

public class Equipa {
    private String equipa;
    private HashMap<Integer,Jogador> jogadores;
    


    public Equipa(){
    
        this.jogadores  = new HashMap<>();
        this.equipa = "n/a";
    }

    public Equipa(int habilidade, HashMap<Integer, Jogador> jogadores,String equipa) {
        this.jogadores  = jogadores;
        this.equipa = equipa;
    }
    
    public String getEquipa(){
        return this.equipa;
    }

    public void setEquipa(String equipa){
      this.equipa =equipa;
    }

    public HashMap<Integer, Jogador> getJogadores() {
        HashMap<Integer, Jogador> list = jogadores;
        return list;
    }

    public void setJogadores(HashMap<Integer, Jogador> jogadores) {
        this.jogadores = jogadores;
    }
  
    public  void removerjogador (int numero){ // assumir que so fica no historico qd sai da equipa 
        if ( this.jogadores.containsKey(numero)){
           this.jogadores.remove(numero);
          }
  }


    public void adicionarjogador(Jogador jogador, int numero){ //acresentei o numero assumindo q o numero é dado na identificacao
        this.jogadores.put(numero,jogador);
        this.jogadores.get(numero).addHistorico(equipa);
        
    }

   
    public String verJogadores(){
        //aplicar a tostring a lista de jogadores
        return "por fazer";
    }



}