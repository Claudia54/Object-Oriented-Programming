import java.util.Scanner ;

public class Programa {
    public static void main (String[] args ){
      
   // SO CONSEGUI ASSIM -C A ELASTICIDADE A SER PERGUNTADA PRIMEIRO :
    //AINDA TENHO DE ACRESCENTAR A PERG SE E AVANÇADO OU ASSIM DPS ACRESCENTO 
    
    
    /*GuardaRedes player =new GuardaRedes();
    Scanner jogadores = new Scanner(System.in);


    System.out.println ("Escolha um jogador");
    player.setNome(jogadores.next());
   
    System.out.println ("A sua elasticidade");
    int p = jogadores.nextInt();
    player.setElasticidade(p);

    //System.out.println(criarJogador().toString());
    //System.out.println(criarGuarda_redes().toString());

    GuardaRedes gua = new GuardaRedes(criarJogador(),p);

    System.out.println(gua);
    jogadores.close();
    */ 
    criarGuardaRedes();
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
    Scanner jogadores = new Scanner(System.in);


    System.out.println ("Escolha um jogador");
    player.setNome(jogadores.next());
   
    System.out.println ("A sua elasticidade");
    int p = jogadores.nextInt();
    player.setElasticidade(p);

    //System.out.println(criarJogador().toString());
    //System.out.println(criarGuarda_redes().toString());

    GuardaRedes gua = new GuardaRedes(criarJogador(),p);

    System.out.println(gua);
    jogadores.close();

}

}





