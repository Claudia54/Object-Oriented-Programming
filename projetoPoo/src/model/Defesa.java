package model;

import java.util.List;

public class Defesa extends Jogador{

    public Defesa (Jogador jogador){
        super(jogador);
    }

    public Defesa (){
        super();
    }

    public Defesa(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico,int camisola){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico,camisola);
    }

    public Defesa(Defesa defesa){
        super(defesa);

    }

    public int calculaHabilidade(){
        double perVel = 0.10;
        double perDes = 0.25;
        double perRes = 0.10;
        double perImp = 0.20;
        double perJdc = 0.15;
        double perRem = 0.05;
        double perCdp = 0.15;
       

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
        
        sb.append("Defesa ");
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