
public class Defesa extends Jogador{
    private int posicionamento;


    public Defesa (){
        super();
        this.posicionamento=0;
    }

    public Defesa(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico, int posicionamento){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, List<String> historico);

        this.posicionamento=posicionamento;
    }

    public Defesa(Defesa defesa){
        super(defesa);
        this.posicionamento = defesa.getPosicionamento();

    }

    public int getPosicionamento() {
        return posicionamento;
    }

    public void setPosicionamento(int posicionamento) {
        this.posicionamento = posicionamento;
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
    public int cpRemateBaliza (){
        return 0;
    }  
    public int cpCanto (){
        return 0;
    }
    public int probPerda (){
        return 0; 
    }

}