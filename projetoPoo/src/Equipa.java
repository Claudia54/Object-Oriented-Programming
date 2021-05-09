
import java.util.ArrayList;
//import static java.util.stream.Collectors.toCollection;
//import static java.lang.System.out;

public class Equipa {
    private int habilidade;
    private ArrayList<Jogador> jogadores;

    public Equipa(){
        this.habilidade = 0;
        this.jogadores  = new ArrayList<>();
    }

    public Equipa(int habilidade, ArrayList<Jogador> jogadores) {
        this.habilidade = habilidade;
        this.jogadores  = jogadores;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public ArrayList<Jogador> getJogadores() {
        ArrayList<Jogador> list = jogadores;
        return list;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
  
    public  void removerjogador (Jogador jogador){
        ArrayList<Jogador> list = this.getJogadores();
        
        list.remove(jogador);

        setJogadores(list);
  
    }
    
    public void adicionarjogador(Jogador jogador){
        ArrayList<Jogador> list = this.getJogadores();
        
        list.add(jogador);

        setJogadores(list);
    }
   
    public String verJogadores(){
        //aplicar a tostring a lista de jogadores
        return "por fazer";
    }
}