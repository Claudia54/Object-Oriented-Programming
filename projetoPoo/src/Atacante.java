public class Atacante extends Jogador{

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

