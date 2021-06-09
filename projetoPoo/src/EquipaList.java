public class Equipas {
   List<Equipa> equipa ; 

   public String criaEquipa(String nome ){
       Equipa nova = new Equipa<>();
       nova.setEquipa(nome);
       this.equipa.add(nova);
       return nova;
   }


}
