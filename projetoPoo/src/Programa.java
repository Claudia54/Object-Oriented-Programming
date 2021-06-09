import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner ;

public class Programa {

    
    
    public static void main (String[] args ){
    
/*
        HashMap<Integer,Jogador> map = new HashMap<>();
        Atacante a = new Atacante("atacante",1,2,3,4,5,28,7,new ArrayList<String>(),10); 
        map.put(10, a);

        Atacante ata = (Atacante) map.get(10);
        System.out.println(ata.getDrible());
*/






        ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
        jogadores.add(new Atacante("Gusto",52,80,70,4,5,28,7,new ArrayList<String>(),10));
        jogadores.add(new Jogador("Gusto",48,26,39,4,5,100,7,new ArrayList<String>()));
        jogadores.add(new Jogador("Gusto",48,60,60,4,5,38,7,new ArrayList<String>()));

        EquipaJogo equipa1 = new EquipaJogo(0,Estado.ATAQUE,jogadores,new ArrayList<>());
        EquipaJogo equipa2 = new EquipaJogo(0,Estado.DEFESA,jogadores,new ArrayList<>());
        Jogo jogo = new Jogo(0,equipa1,equipa2,0,0,0,0);
            
        jogo.calcularResultadoJogo();

        System.out.println(jogo.toString());

    
    }



}





