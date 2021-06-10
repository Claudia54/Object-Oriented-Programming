import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Jogador{
    
    private String nome;
    private int velocidade;
    private int destreza;
    private int resistencia;
    private int impulsao;
    private int jogoDeCabeca;
    private int remate;
    private int capDePasse;
    private List<String> historico;
  


    public Jogador(){
        this.nome           = "n/a";
        this.velocidade     = 0;
        this.destreza       = 0;
        this.resistencia    = 0;
        this.impulsao       = 0;
        this.jogoDeCabeca   = 0;
        this.remate         = 0;
        this.capDePasse     = 0;
        this.historico      = new ArrayList<>();
    }

    public Jogador(String nome, int velocidade, int destreza, int resistencia, int impulsao, 
    int jogoDeCabeca, int remate, int capDePasse , List<String> historico){

        this.nome           = nome;
        this.velocidade     = velocidade;
        this.destreza       = destreza;
        this.resistencia    = resistencia;
        this.impulsao       = impulsao;
        this.jogoDeCabeca   = jogoDeCabeca;
        this.remate         = remate;
        this.capDePasse     = capDePasse;
<<<<<<< HEAD
<<<<<<< HEAD
        this.historico       = historico
=======
        
>>>>>>> c0fe22d... fazer jogo.java e equipaJogo
=======
        this.historico       = historico;
>>>>>>> b586394... corrigir erros
    }

    public Jogador(Jogador jogador){
        this.nome           = jogador.getNome();
        this.velocidade     = jogador.getVelocidade();
        this.destreza       = jogador.getDestreza();
        this.resistencia    = jogador.getResistencia();
        this.impulsao       = jogador.getImpulsao();
        this.jogoDeCabeca   = jogador.getJogoDeCabeca();
        this.remate         = jogador.getRemate();
        this.capDePasse     = jogador.getCapDePasse();
        this.historico      = jogador. getHistorico();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    public void setCapDePasse(int capDePasse){
        this.capDePasse = capDePasse;
    }

    public List<String> getHistorico() {
        
        List<String> list = new ArrayList<>(this.historico);

        return list;
    }

    public void addHistorico(String equipa) {
        this.historico.add(equipa);
    }
/*
    public Jogador clone(){
        Jogador jog = new Jogador(this);
    
        return jog;
    }
*/
    public boolean equals(Object obj){

        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;

        Jogador jog = (Jogador) obj;
        return  jog.getNome()           == this.nome &&
                jog.getVelocidade()     == this.velocidade &&
                jog.getDestreza()       == this.destreza &&
                jog.getResistencia()    == this.resistencia &&
                jog.getImpulsao()       == this.impulsao &&
                jog.getJogoDeCabeca()   == this.jogoDeCabeca &&
                jog.getRemate()         == this.remate &&
                jog.getCapDePasse()     == this.capDePasse &&
                jog.getHistorico()         == this.historico ;

    }

    public String toString(){
    
        StringBuilder sb = new StringBuilder();
        
        sb.append("Jogador ");
        sb.append("[Nome=")           .append(this.getNome());
        sb.append(", Velocidade=")    .append(this.getVelocidade());
        sb.append(", Destreza=")      .append(this.getDestreza());
        sb.append(", Resistencia=")   .append(this.getResistencia());
        sb.append(", Impulsão=")      .append(this.getImpulsao());
        sb.append(", Jogo de cabeca=").append(this.getJogoDeCabeca());
        sb.append(", Remate=")        .append(this.getRemate());
        sb.append(", Cap. de Passe=") .append(this.getCapDePasse());
        sb.append(", Histórico=")     .append(this.getHistorico()).append("]\n");
        return sb.toString();
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
        
        double perVel = 0.25;
        double perDes = 0.5;
        double perRes = 0.25;
        
        int velocidade = this.getVelocidade();
        int destreza = this.getDestreza();
        int resistencia = this.getResistencia();
        
        int probPerd = 100 - (int) Math.round( velocidade  * perVel + 
                                         destreza    * perDes + 
                                         resistencia * perRes );

        return probPerd;
    }

    public int probSucPass (){
        
        double perDes        = 0.35;
        double perCdp        = 0.65;
        int destreza         = this.getDestreza();
        int passe            = this.getCapDePasse();
        
        int probSucPass         = (int) Math.round(destreza*perDes + passe*perCdp);


        return probSucPass;
    }
}