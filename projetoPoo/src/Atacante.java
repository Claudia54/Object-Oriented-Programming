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

    public int cpRemateBaliza (){

        double perDes = 0.3;
        double perRem = 0.7;
        int destreza = this.getDestreza();
        int remate = this.getRemate();
        int cpReBa = (int) Math.round(destreza*perDes + remate*perRem);

        return cpReBa;
    }  
    public int cpCanto (){
   
        double perDes = 0.3;
        double perPas = 0.7;
        int destreza = this.getDestreza();
        int passe = this.getCapDePasse();
        int cpCan = (int) Math.round(destreza*perDes + passe*perPas);

        return cpCan;
   }
    public int probPerda (){
        double perDes = 0.3;
        double perPas = 0.7;
        int destreza = this.getDestreza();
        int passe = this.getCapDePasse();
        int cpCan = (int) Math.round(destreza*perDes + passe*perPas);

        return cpCan;
    }

}

