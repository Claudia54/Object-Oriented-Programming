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

   public Equipa getEquipa(int n){
    Equipa e = list.get(n);
    return e;
    }

   public Equipa criaEquipa(String nome ){
       Equipa nova = new Equipa();
       nova.setEquipa(nome);
       this.list.add(nova);
       return nova;
   }

   public void addEquipa(Equipa equ){
    this.list.add(equ);
    }

    public void consultarEquipa(int n) {

        Equipa e = list.get(n);
        e.verJogadores();
    }

    public int size() {
        return list.size();
    }

}

