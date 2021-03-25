
import java.util.ArrayList;
import java.time.LocalDate;

public class encomendaMain {

	public static void main (String[] args){

		LinhaEncomenda le1 = new LinhaEncomenda("QWERTY", "Batatas",5,20, 0.09, 0.05);
    	LinhaEncomenda le2 = new LinhaEncomenda("ASDFGH", "Cebolas",10 ,30, 0.23, 0.5);

    	LocalDate data = LocalDate.now();

		ArrayList<LinhaEncomenda> list= new ArrayList<LinhaEncomenda>();
		list.add(le1);
		list.add(le2);

		encomenda pckg = new encomenda("Gusto",123456789,"Avenida da Boa Nota nº20", 108,data,list);

		System.out.println( pckg.calculaValorDesconto());
		System.out.println( pckg.calculaValorTotal());
		System.out.println( pckg.existeProdutoEncomenda("QWERTY"));

	}
}
