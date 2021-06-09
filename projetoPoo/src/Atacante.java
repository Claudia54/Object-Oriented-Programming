public class Atacante extends Jogador{

    public Atacante(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse);

    }

    public int calculaHabilidade(){
        double percentagem = 0.1;
        return  (int) Math.round( this.getVelocidade()    * percentagem +
                            this.getDestreza()      * percentagem +
                            this.getResistencia()   * percentagem +
                            this.getImpulsao()      * percentagem +
                            this.getJogoDeCabeca()  * percentagem +
                            this.getRemate()        * percentagem +
                            this.getCapDePasse()    * percentagem );
    }

}

