package model;

import java.util.List;

public class GuardaRedes extends Jogador{
    private int elasticidade;

    public  GuardaRedes(Jogador jogador,int elasticidade) {
      super (jogador); 
      this.elasticidade = elasticidade;
    }

    public  GuardaRedes() {
      super (); 
      this.elasticidade = 0;
    }
   
   public GuardaRedes(int elasticidade){
       super ();
       this.elasticidade = elasticidade;
   }

   public  GuardaRedes (String nome, int velocidade, int destreza, int resistencia, int impulsao, 
   int jogoDeCabeca, int remate, int capDePasse,List<String> historico, int elasticidade,int camisola) {

    super (nome,velocidade, destreza,resistencia, impulsao,jogoDeCabeca,remate,capDePasse,historico,camisola);
    this.elasticidade = elasticidade;
   }

   public GuardaRedes( GuardaRedes guarda_redes){
       super();
       this.elasticidade = guarda_redes.getElasticidade();

   }

   public int getElasticidade (){
      return this.elasticidade;
  }

   public void setElasticidade (int elasticidade){
     this.elasticidade = elasticidade;
  }

  

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
     GuardaRedes guarda_redes= (GuardaRedes) obj ;
     return super.equals(obj) && this.elasticidade == guarda_redes.getElasticidade();
  }
  
  public GuardaRedes clone(){
    return new GuardaRedes(this);
  }

  
    public int calculaHabilidade(){
      double perVel = 0.05;
      double perDes = 0.15;
      double perRes = 0.05;
      double perImp = 0.25;
      double perJdc = 0.05;
      double perRem = 0.05;
      double perCdp = 0.15;
      double perEla = 0.25;

      return  (int) Math.round(   this.getVelocidade()    * perVel +
                                  this.getDestreza()      * perDes +
                                  this.getResistencia()   * perRes +
                                  this.getImpulsao()      * perImp +
                                  this.getJogoDeCabeca()  * perJdc +
                                  this.getRemate()        * perRem +
                                  this.getCapDePasse()    * perCdp +
                                  this.getElasticidade()  * perEla);

  }  

  public String toString(){
    
    StringBuilder sb = new StringBuilder();
    
    sb.append("GuardaRedes");
    sb.append("[Nome=")           .append(this.getNome());
    sb.append(", Velocidade=")    .append(this.getVelocidade());
    sb.append(", Destreza=")      .append(this.getDestreza());
    sb.append(", Resistencia=")   .append(this.getResistencia());
    sb.append(", Impulsão=")      .append(this.getImpulsao());
    sb.append(", Jogo de cabeca=").append(this.getJogoDeCabeca());
    sb.append(", Remate=")        .append(this.getRemate());
    sb.append(", Cap. de Passe=") .append(this.getCapDePasse());
    sb.append(", Elasticidade=")  .append(this.getElasticidade());
    sb.append(", Histórico=")     .append(this.getHistorico()).append("]\n");
    return sb.toString();
}

  }

