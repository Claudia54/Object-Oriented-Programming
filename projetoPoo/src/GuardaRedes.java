public class Guarda_redes extends Jogador{
    private int elasticidade;

    public  Guarda_redes() {
      super (); 
      this.elasticidade = 0;
    }
   
   public Guarda_redes(int elasticidade){
       super ();
       this.elasticidade = elasticidade;
   }

   public Guarda_redes( Guarda_redes guarda_redes){
       super();
       this.elasticidade = guarda_redes.getElasticidade();

   }

   public int getElasticidade (){
      return this.elasticidade;
  }

   public void setElasticidade (int elasticidade){
     this.elasticidade = elasticidade;
  }

  //@Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
     Guarda_redes guarda_redes= (Guarda_redes) obj ;
     return super.equals(obj) && this.elasticidade == guarda_redes.getElasticidade();
  }

  public Guarda_redes clone(){
    return new Guarda_redes(this);
  }

  public String toString (){
    StringBuilder sb = new StringBuilder();

    sb.append("Guarda redes -> ");
    sb.append("Velocidade: ").append(this.velocidade).append(";");
    sb.append("Destreza: ").append(this.destreza).append(";");
    sb.append("Resistencia: ").append(this.resistencia).append(";");
    sb.append("Impulsao: ").append(this.impulsao).append(";");
    sb.append("Jogo de cabeca: ").append(this.jogoDeCabeca).append(";");
    sb.append("Remate: ").append(this.remate).append(";");
    sb.append("Cap. de Passe: ").append(this.capDePasse).append("\n");
    sb.append("Elasticidade ").append(this.elasticidade).append("\n");

    return sb.toString();

    } 
  

  }

