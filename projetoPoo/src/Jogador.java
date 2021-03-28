
public class Jogador{
    
    private int velocidade;
    private int destreza;
    private int resistencia;
    private int impulsao;
    private int jogoDeCabeca;
    private int remate;
    private int capDePasse;
    
    public Jogador(){
        this.velocidade     = 0;
        this.destreza       = 0;
        this.resistencia    = 0;
        this.impulsao       = 0;
        this.jogoDeCabeca   = 0;
        this.remate         = 0;
        this.capDePasse     = 0;
    }

    public Jogador(int velocidade, int destreza, int resistencia, int impulsao, 
    int jogoDeCabeca, int remate, int capDePasse){

        this.velocidade     = velocidade;
        this.destreza       = destreza;
        this.resistencia    = resistencia;
        this.impulsao       = impulsao;
        this.jogoDeCabeca   = jogoDeCabeca;
        this.remate         = remate;
        this.capDePasse     = capDePasse;
    }

public Jogador(Jogador jogador){

        this.velocidade     = jogador.getVelocidade();
        this.destreza       = jogador.getDestreza();
        this.resistencia    = jogador.getResistencia();
        this.impulsao       = jogador.getImpulsao();
        this.jogoDeCabeca   = jogador.getJogoDeCabeca();
        this.remate         = jogador.getRemate();
        this.capDePasse     = jogador.getCapDePasse();
    }


    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }


    public int getDestreza() {
        return destreza;
    }      
    public void setDestreza(int destreza){
        this.destreza = destreza;
    }

    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia){
        this.resistencia = resistencia;
    }

    public int getImpulsao() {
        return impulsao;
    }
    public void setImpulsao(int impulsao){
        this.impulsao = impulsao;
    }

    public int getJogoDeCabeca() {
        return jogoDeCabeca;
    }
    public void setJogoDeCabeca(int jogoDeCabeca){
        this.jogoDeCabeca = jogoDeCabeca;
    }

    public int getRemate() {
        return remate;
    }
    public void setRemate(int remate){
        this.remate = remate;
    }

    public int getCapDePasse() {
        return capDePasse;
    }    
    public void setgetCapDePasse(int capDePasse){
        this.capDePasse = capDePasse;
    }

    public Jogador clone(){
        return new Jogador(this);
    }


    public boolean equals(Object obj){

        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;

        Jogador jog = (Jogador) obj;
        return  jog.getVelocidade()     == this.velocidade &&
                jog.getDestreza()       == this.destreza &&
                jog.getResistencia()    == this.resistencia &&
                jog.getImpulsao()       == this.impulsao &&
                jog.getJogoDeCabeca()   == this.jogoDeCabeca &&
                jog.getRemate()         == this.remate &&
                jog.getCapDePasse()     == this.capDePasse;
    }

    public String toString(){
    
    StringBuilder sb = new StringBuilder();
    
    sb.append("Jogador -> ");
    sb.append("Velocidade: ").append(this.velocidade).append(";");
    sb.append("Destreza: ").append(this.destreza).append(";");
    sb.append("Resistencia: ").append(this.resistencia).append(";");
    sb.append("Impulsao: ").append(this.impulsao).append(";");
    sb.append("Jogo de cabeca: ").append(this.jogoDeCabeca).append(";");
    sb.append("Remate: ").append(this.remate).append(";");
    sb.append("Cap. de Passe: ").append(this.capDePasse).append("\n");
    
    return sb.toString();
}


}