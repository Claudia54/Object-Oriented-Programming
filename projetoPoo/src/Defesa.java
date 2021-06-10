import java.util.List;

public class Defesa extends Jogador{
    private int posicionamento;

    public Defesa (Jogador jogador, int pos){
        super(jogador);
        this.posicionamento=pos;
    }

    public Defesa (){
        super();
        this.posicionamento=0;
    }

    public Defesa(String nome, int velocidade, int destreza, int resistencia, 
    int impulsao, int jogoDeCabeca, int remate, int capDePasse,List<String> historico, int posicionamento){
        
        super(nome, velocidade, destreza, resistencia, impulsao, jogoDeCabeca, 
        remate, capDePasse, historico);

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
        double perVel = 0.05;
        double perDes = 0.20;
        double perRes = 0.10;
        double perImp = 0.15;
        double perJdc = 0.15;
        double perRem = 0.05;
        double perCdp = 0.15;
        double perPos = 0.15;

        return  (int) Math.round(   this.getVelocidade()    * perVel +
                                    this.getDestreza()      * perDes +
                                    this.getResistencia()   * perRes +
                                    this.getImpulsao()      * perImp +
                                    this.getJogoDeCabeca()  * perJdc +
                                    this.getRemate()        * perRem +
                                    this.getCapDePasse()    * perCdp +
                                    this.getPosicionamento()* perPos);

    }
    

}