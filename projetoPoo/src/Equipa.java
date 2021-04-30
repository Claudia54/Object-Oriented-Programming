

import java.util.List;
//import static java.util.stream.Collectors.toCollection;
//import static java.lang.System.out;

public class Equipa {
    private int habilidade;
    private List<Jogador> jogadores;

    public Equipa(){
        this.habilidade = 0;
        this.jogadores  = new List<>();
    }

    public Equipa(int habilidade, List<Jogador> jogadores) {
        this.habilidade = habilidade;
        this.jogadores  = jogadores;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
  ///// MUDAR JOGADORES DE EQUIPA
    public  void removerjogador (Jogador jogador){
   }
    public void adicionarjogador(Jogador jogador){}
   
    public String verJogadores(){
        //aplicar a tostring a lista de jogadores
    }
}