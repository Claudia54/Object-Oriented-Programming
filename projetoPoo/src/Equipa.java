
import java.util.ArrayList;
import java.util.HashMap;
//import static java.util.stream.Collectors.toCollection;
//import static java.lang.System.out;
import java.util.Map;

public class Equipa {
    private String equipa;
    private HashMap<Integer,Jogador> jogadores;



    public Equipa(){
        this.habilidade = 0;
        this.jogadores  = new HashMap<>();
        this.equipa = "n/a";
    }

    public Equipa(int habilidade, HashMap<Integer, Jogador> jogadores,String equipa) {
        this.habilidade = habilidade;
        this.jogadores  = jogadores;
        this.equipa = equipa;
    }
    
    public int getEquipa(){
        return this.equipa;
    }

    public void setEquipa(String equipa){
      this.equipa =equipa;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
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
           this.historico.get(numero).add(equipa);
           this.jogadores.remove(numero);
          }
  }


    public void adicionarjogador(Jogador jogador, int numero){ //acresentei o numero assumindo q o numero é dado na identificacao
        jogador.getEquipa()= equipa;
        this.jogadores.put(numero,jogador);
        this.historico.put(jogador,equipa);
    }

   
    public String verJogadores(){
        //aplicar a tostring a lista de jogadores
        return "por fazer";
    }



}