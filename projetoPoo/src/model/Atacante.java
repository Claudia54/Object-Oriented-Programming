package model;

import java.util.List;

public class Atacante extends Jogador{
   
    public Atacante (Jogador jogador){
        super(jogador);
    }

    public Atacante (){
        super();
    }

    public Atacante(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico,int camisola){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico,camisola);
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
    // toString method to print the attributes of the class
    public String toString(){
        return "Nome: " + this.getNome() + "\n" +
                "Velocidade: " + this.getVelocidade() + "\n" +
                "Destreza: " + this.getDestreza() + "\n" +
                "Resistencia: " + this.getResistencia() + "\n" +
                "Impulso: " + this.getImpulsao() + "\n" +
                "Jogo de Cabeca: " + this.getJogoDeCabeca() + "\n" +
                "Remate: " + this.getRemate() + "\n" +
                "Cap de Passe: " + this.getCapDePasse() + "\n" +
                "Historico: " + this.getHistorico() + "\n" +
                "Camisola: " + this.getCamisola() + "\n" +
                "Habilidade: " + this.calculaHabilidade() + "\n";
    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;
        if(obj.getClass() != this.getClass()) return false;
        Atacante atacante = (Atacante) obj;
        return this.getNome().equals(atacante.getNome()) &&
                this.getVelocidade() == atacante.getVelocidade() &&
                this.getDestreza() == atacante.getDestreza() &&
                this.getResistencia() == atacante.getResistencia() &&
                this.getImpulsao() == atacante.getImpulsao() &&
                this.getJogoDeCabeca() == atacante.getJogoDeCabeca() &&
                this.getRemate() == atacante.getRemate() &&
                this.getCapDePasse() == atacante.getCapDePasse() &&
                this.getHistorico().equals(atacante.getHistorico()) &&
                this.getCamisola() == atacante.getCamisola();
    }
    // criar um clone do objeto
    public Atacante clone(){
        return new Atacante(this);
    }

    // criar metodo para calcular a media de todos os atributos
    public int mediaAtributos(){
        int media = 0;
        media += this.getVelocidade();
        media += this.getDestreza();
        media += this.getResistencia();
        media += this.getImpulsao();
        media += this.getJogoDeCabeca();
        media += this.getRemate();
        media += this.getCapDePasse();
        media += this.getCamisola();
        return media/8;
    }

}

