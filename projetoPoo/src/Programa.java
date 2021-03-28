
import java.util.Scanner ;


public class Programa {
    public static void main (String[] args ){
        
    
    
    System.out.println(criarJogador().toString());
     
    GuardaRedes gua = new GuardaRedes(criarJogador(),1000);

     
    }


public static Jogador criarJogador(){

    Jogador player = new Jogador();

    Scanner jogadores = new Scanner(System.in); 

    System.out.println ("Escolha um avançado");
    player.setNome(jogadores.next());

    System.out.println ("Sua velocidade");
    player.setVelocidade(jogadores.nextInt());

    System.out.println ("Sua destreza");
    player.setDestreza(jogadores.nextInt());

    System.out.println ("Sua resistência");
    player.setResistencia(jogadores.nextInt());

    System.out.println ("Sua impulsão");
    player.setImpulsao(jogadores.nextInt());

    System.out.println ("Seu jogo de cabeça");
    player.setJogoDeCabeca(jogadores.nextInt());

    System.out.println ("Seu remate");
    player.setRemate(jogadores.nextInt());

    System.out.println ("Sua capacidade de passe");
    player.setCapDePasse(jogadores.nextInt());

    jogadores.close();

    return player;

}



}

