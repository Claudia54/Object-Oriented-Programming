public class GuardaRedes extends Jogador{
    private int elasticidade;

    public  GuardaRedes() {
      super (); 
      this.elasticidade = 0;
    }
   
   public GuardaRedes(int elasticidade){
       super ();
       this.elasticidade = elasticidade;
   }

   public  GuardaRedes (String nome, int velocidade, int destreza, int resistencia, int impulsao, 
   int jogoDeCabeca, int remate, int capDePasse,int elasticidade) {

    super (nome,velocidade, destreza,resistencia, impulsao,jogoDeCabeca,remate,capDePasse);
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

  public String toString (){
    StringBuilder sb = new StringBuilder();

    sb.append("Guarda redes -> ");
    sb.append("Velocidade: ").append(this.getVelocidade()).append(";");
    sb.append("Destreza: ").append(this.getDestreza()).append(";");
    sb.append("Resistencia: ").append(this.getResistencia()).append(";");
    sb.append("Impulsao: ").append(this.getImpulsao()).append(";");
    sb.append("Jogo de cabeca: ").append(this.getJogoDeCabeca()).append(";");
    sb.append("Remate: ").append(this.getRemate()).append(";");
    sb.append("Cap. de Passe: ").append(this.getCapDePasse()).append("\n");
    sb.append("Elasticidade: ").append(this.elasticidade).append("\n");

    return sb.toString();

    } 
  

  }

