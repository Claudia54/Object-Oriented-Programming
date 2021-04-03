
public class Defesa extends Jogador{

    public int calculaHabilidade(){
        float percentagem = (float) 0.1;
        return  Math.round( this.getVelocidade()    * percentagem +
                            this.getDestreza()      * percentagem +
                            this.getResistencia()   * percentagem +
                            this.getImpulsao()      * percentagem +
                            this.getJogoDeCabeca()  * percentagem +
                            this.getRemate()        * percentagem +
                            this.getCapDePasse()    * percentagem );

    }
    public int cpRematebaliza (){
        return 0;
    }  
    public int cpCanto (){}
    public int cpPerda (){}

}