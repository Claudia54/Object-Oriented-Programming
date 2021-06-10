import java.util.ArrayList;
import java.util.HashMap;
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


    public Jogador criarJogador(){

        int instruction;
        Scanner scan = new Scanner(System.in);
        View view = new View();
        view.menuJogador();

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
            Atacante atacante = new Atacante (nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>());

            return atacante;

            case 2:
            view.printVar ("Recuperação de Bolas");
            int recBol = scan.nextInt();

            Medio medio = new Medio(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),recBol);

            return medio;

            case 3:

            Defesa defesa = new Defesa(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>());

            return defesa;

            case 4:
            view.printVar ("Cruzamento");
            int cru = scan.nextInt();

            Lateral lateral = new Lateral(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),cru);

            return lateral;

            case 5:
            view.printVar ("Elasticidade");
            int ela = scan.nextInt();

            GuardaRedes guardaredes = new GuardaRedes(nome,velocidade,destreza,resistencia,
            impulsao,jogodeCabeca,remate,capDePasse,new ArrayList<String>(),ela);            

            return guardaredes;
            
            default:
            return null;
        }
    }

   
    public void mudarJogadorDeEquipa(){}// todo


    public Equipa criarEquipa(){
        //menu equipa
        Scanner scan = new Scanner(System.in);

        Equipa equipa = new Equipa();
        View view = new View();

        view.printVar("Nome");
        String nome = scan.nextLine();
        
        equipa.setEquipa(nome); 

        String res = new String();
        while (!res.equals("N")){
            
        view.printVar("Pretende Adicionar Mais Jogadores? S ou N");
        res = scan.nextLine();
            if(res.equals("S")) {

                view.printVar("Numero do Jogador");
                int num = scan.nextInt();
                scan.nextLine();
                if (!equipa.containsJogador(num)) equipa.adicionarjogador(criarJogador(), num); 
                else view.jogJaExiste();
                
            }else if (res.equals("N")){}
            else{
                view.printOpErrada();
            }
        }

        return equipa;
        

    }

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int inte = scan.nextInt();
        return inte;
    }



}
