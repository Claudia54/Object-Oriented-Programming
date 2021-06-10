import java.util.ArrayList;
import java.util.InputMismatchException;
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
    }


    public void escolheJogador(){

        int instruction;
        Scanner scan = new Scanner(System.in);
        View view = new View();

        try{
            instruction = scan.nextInt();
            scan.nextLine();
        }
        catch (InputMismatchException e) {
            instruction = -1;
            notAnInstruction();
        }

        view.printVar ("Nome");
        String nome = scan.nextLine();
 
        view.printVar ("Velocidade");
        int velocidade = scan.nextInt();

        view.printVar ("Destreza");
        int destreza = scan.nextInt();

        view.printVar ("Resistência");
        int resistencia = scan.nextInt();


        view.printVar ("Impulsão");
        int impulsao = scan.nextInt();

        view.printVar ("Jogo de Cabeça");
        int jogodeCabeca = scan.nextInt();

        view.printVar ("Remate");
        int remate = scan.nextInt();

        view.printVar ("Capacidade de Passe");
        int capDePasse = scan.nextInt();
        

        switch (instruction){
            case 1:
            view.printVar ("Drible");
            int drible = scan.nextInt();

            Atacante avancado = new Atacante (nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),drible);
            break;
            case 2:
            view.printVar ("Recuperação de Bolas");
            int recBol = scan.nextInt();

            Medio medio = new Medio(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),recBol);

            break;
            case 3:
            view.printVar ("Posicionamento");
            int pos = scan.nextInt();

            Defesa defesa = new Defesa(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),pos);

            break;
            case 4:
            view.printVar ("Cruzamento");
            int cru = scan.nextInt();

            Lateral lateral = new Lateral(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),cru);

            break;
            case 5:
            view.printVar ("Elasticidade");
            int ela = scan.nextInt();

            GuardaRedes guardaredes = new GuardaRedes(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),ela);
           
            break;
        }
    }

   
    
    public void criarequipa(){
        Scanner scan = new Scanner();
        Equipa equipa = new Equipa();
        String nome=scan.nextLine();
        equipa.setEquipa(nome); 
        while (scan.next()){
            tipoJogador (); // falta pedir o numero do jogador;no intrep
        equipa. menuInt();
        }

    }
}


}
