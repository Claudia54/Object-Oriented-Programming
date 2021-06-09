import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

import org.w3c.dom.css.CSSFontFaceRule;

public class DriveIt {
    private Map<String,Veiculo> veiculo;

    public DriveIt (Map<String,Veiculo> veiculos){
        this.veiculo = veiculos.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e->e.getValue().clone()));
    }

    public DriveIt (DriveIt a){
        this.veiculo = a.getVeiculo();
    }

    public Map <String,Veiculo> getVeiculo(){

        return this.veiculo.entrySet().stream()
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue().clone()));
    }

    public void setVeiculo(Map<String, Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
    public boolean existeVeiculo(String cod){
        return this.veiculo.containsKey(cod);
    }
    public int quantos(){
        return this.veiculo.size();
    }
    public int quantos(String marca){
        return this.veiculo.values().stream().filter(l->l.getMarca().equals(marca)).count();;
    }
    public Veiculo getVeiculo(String cod){
        return this.veiculo.get(cod).clone();   
       //for(Veiculo aux: Veiculo)
       }
       public void adiciona(Veiculo v){
           this.veiculo.putIfAbsent(v.getCodigo(),v.clone());
       }
       public List<Veiculo> getVeiculos(){
           return this.veiculo.values().stream().map(veiculo::clone).collect(Collectors.toList());

       }
       public void adiciona(Set<Veiculo> vs) {
        for(Veiculo v: vs)
          adiciona(v);//expressa em cima
 
           }
      public void registarAluguer(String codVeiculo, int numKms){
         this.veiculo.get(codVeiculo).addViagem(numKms);
      }

      public void classificarVeiculo(String cod, int classificacao){
          this.veiculo.get(cod).addclassf(classificacao);

      }
      public int custoRealKm(String cod){
          this.veiculo.get(cod).custo();

      }

      public Veiculo veiculoMaisBarato(){ ????????????
          Comparator<Veiculo>cs =  (v1,v2)-> (v1.custoRealKM() != v2.custoRealKM() ?;
          for (v1.custoRealKm()-v2.custoRealKm(): v1.getCodigo().compareTo(v2.getCodigo()))
          return this.veiculo.stream().sorted(cs).findFirst(.get().clone();
      }

           

       
    
    }


    
}
