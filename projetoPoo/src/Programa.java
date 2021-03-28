import java.util.Scanner ;


public class Programa {
    public static void main (String[] args ){
     Scanner jogadores = new Scanner(System.in); 
     System.out.println ("Escolha um avançado");
     String avancado = jogadores.next();
     System.out.println ("Sua velocidade");
     int velocidade =jogadores.nextInt();
     System.out.println ("Sua destreza");
     int destreza =jogadores.nextInt();
     System.out.println ("Sua resistência");
     int resistencia =jogadores.nextInt();
     System.out.println ("Sua impulsão");
     int impulsao =jogadores.nextInt();
     System.out.println ("Seu jogo de cabeça");
     int jogodeCabeca =jogadores.nextInt();
     System.out.println ("Seu remate");
     int remate=jogadores.nextInt();
     System.out.println ("Sua capacidade de passe");
     int capDePasse =jogadores.nextInt();

     System.out.println ("O jogador " + avancado+" tem de:\nvelocidade: " 
     + velocidade + "\ndestreza: "+ destreza+ "\nresistência" + resistencia
     +"\nimpulsao: "+impulsao+"\nJogo de cabeça: "+jogodeCabeca+"\nremate: "+remate
     +"\nCapacidade de Passe: " +capDePasse);

     
    }

}