import java.util.Set;
import java.util.Map;
import java.util.HashMap; 

public class Grafo {
// variáveis de instância
private Map<Integer, Set<Integer>> adj;
// "lista" de adjacência

public Grafo(){
    this.adj= new HashMap<>();
}
public Grafo(Map<Integer, Set<Integer>> adj){
    this.adj=adj.entrySet().stream()
             .collect(Collectors.toMap)


}
   }
