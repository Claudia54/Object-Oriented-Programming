import java.util.Scanner ;

public class Programa {
    private Equipa equipa1 = new Equipa();
    private Equipa equipa2 = new Equipa();
    private Jogo jogo = new Jogo();
    
    
    public static void main (String[] args ){
    
    
    }


public static Jogador criarJogador(){

    Jogador player = new Jogador();

    Scanner jogadores = new Scanner(System.in); 


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

public static void criarGuardaRedes(){
    
    GuardaRedes player =new GuardaRedes();
   /* Scanner jogadores = new Scanner(System.in);
   */

 //////ALTERAR

    Scanner jogadores = new Scanner(System.in); 


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

    System.out.println ("A sua elasticidade");

    int p = jogadores.nextInt();
    player.setElasticidade(p);

    //System.out.println(criarJogador().toString());
    //System.out.println(criarGuarda_redes().toString());

    
    
    jogadores.close();

}

}





