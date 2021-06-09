
public class Medio extends Jogador{
    private int recbola;



    public Medio(){
        super();
        recbola=0;
    }

    public Medio(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico,int recbola){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, List<String> historico);
        this.recbola=recbola;

    }

    public Medio(Medio medio){
        super(medio);
        this.medio=medio.getRecbola();
    }


    public int getRecbola() {
        return recbola;
    }

    public void setRecbola(int recbola) {
        this.recbola = recbola;
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
    public int cpRematebaliza (){
        return 0;
    }  
    public int cpCanto (){
        return 0;
    }
    public int cpPerda (){
        return 0;
    }
    

}