import java.util.List;

public class Atacante extends Jogador{
    private int drible;

   

    public Atacante (Jogador jogador, int drible){
        super(jogador);
        this.drible = drible;
    }

    public Atacante (){
        super();
        this.drible=0;
    }

    public Atacante(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico,int drible){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico);
        this.drible = drible;

    }

    public Atacante(Atacante atacante){
        super(atacante);
        this.drible = atacante.getDrible();

    }

    public int getDrible() {
        return drible;
    }

    public void setDrible(int drible) {
        this.drible = drible;
    }

    

    public int calculaHabilidade(){
        
        double perVel = 0.1;
        double perDes = 0.2;
        double perRes = 0.1;
        double perImp = 0.1;
        double perJdc = 0.1;
        double perRem = 0.3;
        double perCdp = 0.05;
        double perDri = 0.05;

        return  (int) Math.round(   this.getVelocidade()    * perVel +
                                    this.getDestreza()      * perDes +
                                    this.getResistencia()   * perRes +
                                    this.getImpulsao()      * perImp +
                                    this.getJogoDeCabeca()  * perJdc +
                                    this.getRemate()        * perRem +
                                    this.getCapDePasse()    * perCdp +
                                    this.getDrible()        * perDri);
    }
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        
        sb.append("Atacante ");
        sb.append("[Nome=").append(this.getNome());
        sb.append(", Velocidade=").append(this.getVelocidade());
        sb.append(", Destreza=").append(this.destreza);
        sb.append(", Resistencia=").append(this.resistencia);
        sb.append(", Impulsao=").append(this.impulsao);
        sb.append(", Jogo de cabeca=").append(this.jogoDeCabeca);
        sb.append(", Remate=").append(this.remate);
        sb.append(", Cap. de Passe=").append(this.capDePasse);
        sb.append(", Historico=").append(this.historico).append("]\n");
        sb.append(", Cap. de Passe=").append(this.capDePasse);
        return sb.toString();
    }
}

