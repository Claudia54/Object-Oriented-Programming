import java.util.Set; import java.util.Map; import java.util.HashMap;
public class Grafo {

private Map<String, Set<String>> adj;

public Grafo(){
    this.adj=new HashMap <String, Set<String>>();
}
public Grafo(Map<String, Set<String>> adj){
    this.adj= adj;
     
}
public void addArco(String vOrig, String vDest){
    if ( !adj.containskey(vOrig)){
     this.adj.put(vOrig,new HashSet<String>()); // para acrescentar um map todo
}
else {
     adj.get(vOrig).add(vDest);
}
}
public boolean isSink(String v){
    if (adj.containskey(v)){
        adj.get(v).isEmpty();

    }
}
public size (){

}
}