
import java.util.ArrayList;
import java.util.HashMap;
//import static java.util.stream.Collectors.toCollection;
//import static java.lang.System.out;
import java.util.Map;

public class Equipa {
    private int habilidade;
    private HashMap<Integer,Jogador> jogadores;

    public Equipa(){
        this.habilidade = 0;
        this.jogadores  = new HashMap<>();
    }

    public Equipa(int habilidade, HashMap<Integer, Jogador> jogadores) {
        this.habilidade = habilidade;
        this.jogadores  = jogadores;
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
  
    public  void removerjogador (Jogador jogador){
        HashMap<Integer, Jogador> map = this.getJogadores();
        
        map.remove(jogador);

        setJogadores(map);
  
    }
    
    public void adicionarjogador(Jogador jogador){
        HashMap<Integer, Jogador> list = this.getJogadores();
        
        //list.add(jogador);

        //setJogadores(list);
    }
   
    public String verJogadores(){
        //aplicar a tostring a lista de jogadores
        return "por fazer";
    }
}