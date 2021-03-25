public class Circulo {
   private double x;
   private double y;
   private double raio ;

   public Circulo(){
       this.x =0;
       this.y=0;
       this.raio=0;
   }
   public Circulo(double x,double y, double r){
       this.x=x;
       this.y=y;
       this.raio=r;
   }

   public Circulo (Circulo c){
       this.x=c.getX();
       this.y=c.getY();
       this.raio=c.getRaio();
   }  

   public double getX(){
       return this.x;
   }
   
   public double getY(){
       return this.y;
   }

   public double getRaio(){
       return this.raio;
   }

   public void setX(double x){
    this.x=x;
   }

   public void setY(double y){
    this.y=y;
   }
   public void setRaio(double r){
    this.raio=r;
   }
   public void alteraCentro (double x,double y){
       this.x=x;
       setY(y);
   }

   public double calculaArea(){
       return Math.PI * Math.pow(this.raio,2);
   }
   public String toString (){
       return "Circulo -X: " + this.x + "Y: " + this.y + "Raio: " + this.raio;
   }

   public boolean equals (Object o)
   { if(o==this)return true ;
     if (o==null) return false ;
     if (o.getClass() != this.getClass()) return false;
     Circulo c = (Circulo) o;
     return (this.x == c.getX() && 
            this.y ==c.getY() && 
            this.raio=c.getRaio());
   }

   public Circulo clone(){
       return new Circulo(this);
       }
}

