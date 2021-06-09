
public class Lateral extends Jogador{
    private int habilidadecruz;


    public Lateral(){
        super();
        habilidadecruz=0
    }

    public Lateral (String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico, int habilidadecruz){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, List<String> historico);
        this.habilidadecruz=habilidadecruz;

    }

    public Lateral(Lateral lateral{
        super(lateral);
        this.lateral=lateral.getHabilidadecruz();
    }

    public int getHabilidadecruz() {
        return habilidadecruz;
    }

    public void setHabilidadecruz(int habilidadecruz) {
        this.habilidadecruz = habilidadecruz;
    }

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
}