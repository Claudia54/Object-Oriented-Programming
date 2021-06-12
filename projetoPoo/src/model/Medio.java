package model;

import java.util.List;

public class Medio extends Jogador{
    private int recBola;

    public Medio(Jogador jogador, int bola){
        super(jogador);
        recBola=bola;
    }

    public Medio(){
        super();
        recBola=0;
    }

    public Medio(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico,int recBola){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico);
        this.recBola=recBola;

    }

    public Medio(Medio medio){
        super(medio);
        this.recBola = medio.getRecBola();
    }


    public int getRecBola() {
        return recBola;
    }

    public void setRecBola(int recBola) {
        this.recBola = recBola;
    }
    

    public int calculaHabilidade(){
        double perVel = 0.1;
        double perDes = 0.15;
        double perRes = 0.15;
        double perImp = 0.05;
        double perJdc = 0.05;
        double perRem = 0.15;
        double perCdp = 0.2;
        double perReb= 0.15;

        return  (int) Math.round(   this.getVelocidade()    * perVel +
                                    this.getDestreza()      * perDes +
                                    this.getResistencia()   * perRes +
                                    this.getImpulsao()      * perImp +
                                    this.getJogoDeCabeca()  * perJdc +
                                    this.getRemate()        * perRem +
                                    this.getCapDePasse()    * perCdp +
                                    this.getRecBola()       * perReb);

    }
    
    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        
        sb.append("Medio ");
        sb.append("[Nome=")                .append(this.getNome());
        sb.append(", Velocidade=")         .append(this.getVelocidade());
        sb.append(", Destreza=")           .append(this.getDestreza());
        sb.append(", Resistencia=")        .append(this.getResistencia());
        sb.append(", Impulsão=")           .append(this.getImpulsao());
        sb.append(", Jogo de cabeca=")     .append(this.getJogoDeCabeca());
        sb.append(", Remate=")             .append(this.getRemate());
        sb.append(", Cap. de Passe=")      .append(this.getCapDePasse());
        sb.append(", Recuperacao de Bola=").append(this.getRecBola());
        sb.append(", Histórico=")          .append(this.getHistorico()).append("]\n");
        return sb.toString();
    }

}