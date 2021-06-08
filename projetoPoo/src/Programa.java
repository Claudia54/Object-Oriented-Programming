import java.util.ArrayList;
import java.util.Scanner ;

public class Programa {

    
    
    public static void main (String[] args ){
    
        EquipaJogo equipa1 = new EquipaJogo(0,Estado.ATAQUE,new ArrayList<>(),new ArrayList<>());
        EquipaJogo equipa2 = new EquipaJogo(0,Estado.DEFESA,new ArrayList<>(),new ArrayList<>());
        Jogo jogo = new Jogo(0,equipa1,equipa2,0,0,0,0);
            
        jogo.calcularResultadoJogo();

        System.out.println(jogo.toString());

    
    }



}





