import java.util.List;

public class Atacante extends Jogador{
   
    public Atacante (Jogador jogador){
        super(jogador);
    }

    public Atacante (){
        super();
    }

    public Atacante(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico);
    }

    public Atacante(Atacante atacante){
        super(atacante);

    }

    public int calculaHabilidade(){
        
        double perVel = 0.10;
        double perDes = 0.20;
        double perRes = 0.10;
        double perImp = 0.10;
        double perJdc = 0.15;
        double perRem = 0.30;
        double perCdp = 0.05;
        
        return  (int) Math.round(   this.getVelocidade()    * perVel +
                                    this.getDestreza()      * perDes +
                                    this.getResistencia()   * perRes +
                                    this.getImpulsao()      * perImp +
                                    this.getJogoDeCabeca()  * perJdc +
                                    this.getRemate()        * perRem +
                                    this.getCapDePasse()    * perCdp);
    }
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        
        sb.append("Atacante ");
        sb.append("[Nome=")           .append(this.getNome());
        sb.append(", Velocidade=")    .append(this.getVelocidade());
        sb.append(", Destreza=")      .append(this.getDestreza());
        sb.append(", Resistencia=")   .append(this.getResistencia());
        sb.append(", Impulsão=")      .append(this.getImpulsao());
        sb.append(", Jogo de cabeca=").append(this.getJogoDeCabeca());
        sb.append(", Remate=")        .append(this.getRemate());
        sb.append(", Cap. de Passe=") .append(this.getCapDePasse());
        sb.append(", Histórico=")     .append(this.getHistorico()).append("]\n");
        return sb.toString();
    }
}

