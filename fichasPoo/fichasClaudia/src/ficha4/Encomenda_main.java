import java.util.ArrayList;
import java.util.Scanner ;
import java.time.LocalDate;

public class Encomenda_main {

public static void main (String[] args ){
    LinhaEncomenda nova1 = new LinhaEncomenda("ABCDEFG", "ENCOMENDA TESTE",20 ,
                2, 0.1, 0.2);
		LinhaEncomenda nova2 = new LinhaEncomenda("HIJLMNO", "TESTARR",12 ,
                5, 0.1, 0.2);
     LocalDate data = LocalDate.now();

		ArrayList<LinhaEncomenda> linha_enc1= new ArrayList<LinhaEncomenda>();
		linha_enc1.add(nova1);
		linha_enc1.add(nova2);

		Encomendas encomenda = new Encomendas("Cláudia",19,"Travessa Caboucos do Ouro",
						1,data,linha_enc1);

	System.out.println("Valor total = " + encomenda.calculaValorTotal());
        System.out.println("Valor desconto = " + encomenda.calculaValorDesconto());
        System.out.println("Numero total de produtos = "+ encomenda.numeroTotalProdutos());
        String prod = "ABCDEFG";
        System.out.println("Existe produto com referência "+prod+ "??" + encomenda.existeProdutoEncomenda(prod));
        prod = "bcd";
        System.out.println("Existe produto com referência "+prod+ "??" + encomenda.existeProdutoEncomenda(prod));

        LinhaEncomenda l2 = new LinhaEncomenda("deco", "final", 300, 3, 0.23, 0.4);
        encomenda.adicionaLinha(l2);
        prod = "fghijk";
        System.out.println("Existe produto com referência "+prod+ "??" + encomenda.existeProdutoEncomenda(prod));

        encomenda.removeProduto("fghijk");
        System.out.println("Existe produto com referência "+prod+ "??" + encomenda.existeProdutoEncomenda(prod));
        System.out.println(encomenda.toString());

}
}
