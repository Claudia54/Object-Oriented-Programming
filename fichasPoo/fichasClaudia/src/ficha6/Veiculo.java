import java.time.LocalDate;

public class Veiculo{
    private String codigo;
    private String marca;
    private String modelo;
    private LocalDate data;
    private int velocidade ;
    private int preco ;
    private  private ArrayList<Integer> classificacao;
    private double km;

public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
public Veiculo(){
    this.codigo="";
    this.marca="";
    this.modelo="";
    this.data=LocalDate.now();
    this.velocidade=0;
    this.preco=0.0;
    this.classificacao=0.0;
}
public Veiculo(String codigo,String marca,String modelo,LocalDate data,int velocidade,double preco, double classificacao){
    this.codigo=codigo;
    this.marca=marca;
    this.modelo=modelo;
    this.data=data;
    this.velocidade=velocidade;
    this.preco=preco;
    this.classificacao=classificacao;
}
public Veiculo(Veiculo veiculo){
    veiculo.codigo=codigo;
    veiculo.marca=marca;
    veiculo.modelo=modelo;
    veiculo.data=data;
    veiculo.velocidade=velocidade;
    veiculo.preco=preco;
    veiculo.classificacao=classificacao;

}

public Veiculo clone(){
    return new Veiculo(this);
}
public void addViagem(int nkms){
    this.km += nkms;
}

public void addclassf (int clas){
    this.classificacao.add(clas);
}
public int custo(){
    this.preco += preco*0.10;
    return preco;
}

}