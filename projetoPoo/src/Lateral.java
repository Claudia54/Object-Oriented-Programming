import java.util.List;

public class Lateral extends Jogador{
    private int habilidaDeCruz;


    public Lateral(){
        super();
        habilidaDeCruz = 0;
    }

    public Lateral (String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico, int habilidaDeCruz){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico);
        this.habilidaDeCruz = habilidaDeCruz;

    }

    public Lateral(Lateral lateral){
        super(lateral);
        this.habilidaDeCruz = lateral.getHabilidaDeCruz();
    }

    public int getHabilidaDeCruz() {
        return habilidaDeCruz;
    }

    public void setHabilidaDeCruz(int habilidaDeCruz) {
        this.habilidaDeCruz = habilidaDeCruz;
    }

    public int calculaHabilidade(){
        double perVel = 0.15;
        double perDes = 0.15;
        double perRes = 0.10;
        double perImp = 0.15;
        double perJdc = 0.10;
        double perRem = 0.05;
        double perCdp = 0.15;
        double perCru= 0.15;

        return  (int) Math.round(   this.getVelocidade()    * perVel +
                                    this.getDestreza()      * perDes +
                                    this.getResistencia()   * perRes +
                                    this.getImpulsao()      * perImp +
                                    this.getJogoDeCabeca()  * perJdc +
                                    this.getRemate()        * perRem +
                                    this.getCapDePasse()    * perCdp +
                                    this.getHabilidaDeCruz()* perCru);

    }
}