
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class encomenda {

    private String nome;
    private int nfCliente;
    private String morada;
    private int nEncomenda;
    private LocalDate data;
    private ArrayList<LinhaEncomenda> list;
    public encomenda() {
        this.nome       = "n/a";
        this.nfCliente  = 0;
        this.morada     = "n/a";
        this.nEncomenda = 0;
        this.data       = LocalDate.now();
        this.list       = new ArrayList<>();

    }

    public encomenda(String nome, int nfCliente, String morada, int nEncomenda, LocalDate data, ArrayList<LinhaEncomenda> list) {

        this.nome       = nome;
        this.nfCliente  = nfCliente;
        this.morada     = morada;
        this.nEncomenda = nEncomenda;
        this.data       = data;
        this.list       = list;

    }

    public encomenda(encomenda pckg) {

        this.nome       = pckg.getNome();
        this.nfCliente  = pckg.getNfCliente();
        this.morada     = pckg.getMorada();
        this.nEncomenda = pckg.getNEncomenda();
        this.data       = pckg.getData();;
        this.list       = pckg.getList();

    }

    public double calculaValorTotal() {

        Iterator<LinhaEncomenda> itr = list.iterator();
        double valor = 0;

        while(itr.hasNext()) {
            LinhaEncomenda le = itr.next();
            valor = valor + le.calculaValorLinhaEnc();
        }

        return valor;

    }

    public double calculaValorDesconto() {

        Iterator<LinhaEncomenda> itr = list.iterator();
        double valor = 0;

        while(itr.hasNext()) {
            LinhaEncomenda le = itr.next();
            valor = valor + le.calculaValorDesconto();
        }

        return valor;

    }

    public int numeroTotalProdutos() {

        Iterator<LinhaEncomenda> itr = list.iterator();
        int total = 0;

        while(itr.hasNext()) {
            LinhaEncomenda le = itr.next();
            total = total + le.getQuantidade();
        }

        return total;

    }

    public boolean existeProdutoEncomenda(String refProduto) {

        boolean flag = false;
        Iterator<LinhaEncomenda> itr = list.iterator();

        while(itr.hasNext()) {
            LinhaEncomenda le = itr.next();
            if (refProduto.equals(le.getReferencia())) flag = true;
        }

        return flag;

    }

    public void adicionaLinha(LinhaEncomenda linha) {
        this.list.add(new LinhaEncomenda(linha));
    }

    public void removeProduto(String codProd) {
        this.list.removeIf(le -> codProd.equals(le.getReferencia()));
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNfCliente() {
        return this.nfCliente;
    }
    public void setNfCliente(int nfCliente) {
        this.nfCliente = nfCliente;
    }

    public String getMorada() {
        return this.morada;
    }
    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNEncomenda() {
        return this.nEncomenda;
    }
    public void setNEncomenda(int nEncomenda) {
        this.nEncomenda = nEncomenda;
    }

    public LocalDate getData() {
        return this.data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<LinhaEncomenda> getList() {
        return this.list;
    }
    public void setList(ArrayList<LinhaEncomenda> list) {
        this.list = list;
    }

    public encomenda clone() {
        return new encomenda(this);
    }

    public boolean equals(Object obj) {

        if(obj==this) return true;
        if(obj==null || obj.getClass() != this.getClass()) return false;

        encomenda pckg = (encomenda) obj;
        return  pckg.getNome().equals(this.nome) &&
                pckg.getNfCliente() == this.nfCliente &&
                pckg.getMorada().equals(this.morada) &&
                pckg.getNEncomenda() == this.nEncomenda &&
                pckg.getData().equals(this.data) &&
                pckg.getList().equals(this.list);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("Numero Fiscal: ").append(this.nfCliente).append("\n");
        sb.append("Morada: ").append(this.morada).append("\n");
        sb.append("Numero Encomenda: ").append(this.nEncomenda).append("\n");
        sb.append("Data: ").append(this.data).append("\n");
        sb.append("Linhas da encomenda: ").append(this.list.toString());

        return sb.toString();

    }

}