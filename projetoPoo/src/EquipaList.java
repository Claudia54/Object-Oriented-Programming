import java.util.ArrayList;
import java.util.List;

public class EquipaList {
   private List<Equipa> list ; 

   public EquipaList (){
       this.list = new ArrayList<>();
   }

   public Equipa getLast(){
       Equipa e = list.get(list.size()-1);
       return e;
   }

   public Equipa criaEquipa(String nome ){
       Equipa nova = new Equipa();
       nova.setEquipa(nome);
       this.list.add(nova);
       return nova;
   }

   public void addEquipa(String nome){
    Equipa equipa = new Equipa(nome);
    this.list.add(equipa);
    
    }

}

