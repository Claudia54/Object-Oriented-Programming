import java.util.Scanner;

public class Controller {
    public void notAnInstruction(){
        System.out.print("Esta instruçao nao esta definida!\n");
    }
   
    public void menuInt (){
        Scanner scan = new Scanner(System.in);
        int instruction;
        try{
            instruction = scan.nextInt();
            scan.nextLine();
        }
        catch (InputMismatchException e) {
            instruction = -1;
            notAnInstruction();
        }

    }
    switch (instruction){
        case 1:
        //Perguntar que tipo de jogador

        break;
        case 2:
        break;
        case 3:
        break;
        case 4:
        break;
        case 5:
        break;
    }

    public void escolheJogador(){
        int instruction;
        Scanner scan = new Scanner(System.in);

        try{
            instruction = scan.nextInt();
            scan.nextLine();
        }
        catch (InputMismatchException e) {
            instruction = -1;
            notAnInstruction();
        }
        switch (instruction){
            case 1:
            Atacante avancado = new Atacante ();
            break;
            case 2:
            Medio medio = new Medio();
            break;
            case 3:
            Defesa defesa = new Defesa();
            break;
            case 4:
            Lateral lateral = new Lateral();
            break;
            case 5:
            GuardaRedes guardaredes = new GuardaRedes();
            break;
        }
    }

    public void addCarat(){
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
        
    }
    
}
