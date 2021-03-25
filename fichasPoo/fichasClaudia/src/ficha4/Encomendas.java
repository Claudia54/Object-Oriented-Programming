import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toCollection;
import static java.lang.System.out;
import java.time.LocalDate;



public class Encomendas {

   private String nome;
   private int numero_fiscal; 
   private String morada ;
   private int numero_encomenda;
   private LocalDate date;
   private ArrayList<LinhaEncomenda> list;


   public Encomendas(){
       this.nome ="n/a";
       this.numero_fiscal=0;
       this.morada="n/a";
       this.numero_encomenda=0;
       this.date=LocalDate.now();
       this.list=new ArrayList<>();
   }
   public Encomendas(String nome,int numero_fiscal,String morada, int numero_encomenda,LocalDate date, ArrayList<LinhaEncomenda> list ){
       this.nome=nome;
       this.numero_fiscal=numero_fiscal;
       this.morada=morada;
       this.numero_encomenda=numero_encomenda;
       this.date=date;
       this.list =list;
   }

   public Encomendas (Encomendas encomenda){
       this.nome=encomenda.getNome();
       this.numero_fiscal=encomenda.getNF();
       this.morada=encomenda.getMorada();
       this.numero_encomenda=encomenda.getNE();
       this.date=encomenda.getData();
       this.list =encomenda.getList();
  
   }  

   public String getNome(){
       return this.nome;
   }

   public int getNF(){
       return this.numero_fiscal;
   }

   public String getMorada(){
       return this.morada;
   }

   public int getNE(){
       return this.numero_encomenda;
   }

   public LocalDate getData(){
       return this.date;
   }

   public void setNome(String nome){
    this.nome=nome;
   }

   public void setNF(int numero_fiscal){
    this.numero_fiscal=numero_fiscal;
   }

   public void setMorada(String morada){
    this.morada=morada;
   }

   public void setNE(int numero) {
    this.numero_encomenda = numero;
    }
    public void setData(LocalDate data) {
        this.date = data;
    }

  public ArrayList<LinhaEncomenda> getList(){
       return this.list; 
       }

    public void setLinhas(ArrayList<LinhaEncomenda> list) {
        this.list = list;
    }

  public Encomendas clone() {
        return new Encomendas(this);
    }

//////////// bii)
  public double calculaValorTotal(){
      return this.list.stream().mapToDouble(LinhaEncomenda::calculaValorLinhaEnc).sum();
  }

///////////biii)
  public double calculaValorDesconto(){
      return this.list.stream().mapToDouble(LinhaEncomenda::calculaValorDesconto).sum();
}
//////////biv)
 public int numeroTotalProdutos(){
     return this.list.stream().mapToInt(LinhaEncomenda::getQuantidade).sum();
 }

///////////v)
public boolean existeProdutoEncomenda(String refProduto){
        return this.list.stream().anyMatch(l->l.getReferencia().equals(refProduto));
    }
   
 ////////   vi)
 public void adicionaLinha(LinhaEncomenda linha){
      this.list.add(linha);

}

/////////vii)
public void removeProduto(String codProd){
this.list.removeIf(list -> list.getReferencia().equals(codProd));
}

public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encomendas encomenda = (Encomendas) o;
        return this.nome.equals(encomenda.getNome()) &&
                this.numero_fiscal==encomenda.getNF() &&
                this.morada.equals(encomenda.getMorada()) &&
                this.numero_encomenda == encomenda.getNE() &&
                this.date.equals(encomenda.getData()) &&
                this.list.equals(encomenda.getList());
    }

}
/*
    public String toString() {
        return "Encomenda{" +
                "nome=' " + this.nome + ''' +
                ", morada='" + this.morada + ''' +
                ", numero_fiscal=" + this.numero_fiscal +
                ", numero_encomenda=" + this.numero_encomenda +
                ", date=" + this.data +
                ", list=" + this.linhas +
                '}';
    }
*/