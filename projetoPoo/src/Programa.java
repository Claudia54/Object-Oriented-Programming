import java.util.ArrayList;
import java.util.Scanner ;

public class Programa {

    
    
    public static void main (String[] args ){
    
        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Atacante("Gusto",1,2,3,4,5,28,7));
        jogadores.add(new Jogador("Gusto",1,2,3,4,5,64,7));
        jogadores.add(new Jogador("Gusto",1,2,3,4,5,38,7));

        EquipaJogo equipa1 = new EquipaJogo(0,Estado.ATAQUE,jogadores,new ArrayList<>());
        EquipaJogo equipa2 = new EquipaJogo(0,Estado.DEFESA,jogadores,new ArrayList<>());
        Jogo jogo = new Jogo(0,equipa1,equipa2,0,0,0,0);
            
        jogo.calcularResultadoJogo();

        System.out.println(jogo.toString());

    
    }



}





