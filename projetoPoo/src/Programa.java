import model.*;
import controller.*;
import view.*;
import Loaders.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner ;

public class Programa {

    
    
    public static void main (String[] args ){
    
/*
        HashMap<Integer,Jogador> map = new HashMap<>();
        Atacante a = new Atacante("atacante",1,2,3,4,5,28,7,new ArrayList<String>(),10); 
        map.put(10, a);
--------------------------
--------------------------
        Atacante ata = (Atacante) map.get(10);
        System.out.println(ata.getDrible());

    View view = new View();

    view.bola();
    view.menu();
    view.clearScreen();
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    jogadores.add(new Atacante("Gusto",52,80,70,4,5,28,7,new ArrayList<String>()));
    jogadores.add(new Jogador("Gusto",48,26,39,4,5,100,7,new ArrayList<String>()));
    jogadores.add(new Jogador("Gusto",48,60,60,4,5,38,7,new ArrayList<String>()));

    EquipaJogo equipa1 = new EquipaJogo(0,Estado.ATAQUE,jogadores,new ArrayList<>());
    EquipaJogo equipa2 = new EquipaJogo(0,Estado.DEFESA,jogadores,new ArrayList<>());
    
    Jogo jogo = new Jogo(0,equipa1,equipa2,0,0,0,0);
    jogo.calcularResultadoJogo();
    Loadlog log = new Loadlog();

    //String[] s = new String();
    EquipaList lista = new EquipaList();
    log.load(log.getFichDefaut(), lista, jogo);

    lista.getLast().verJogadores();  
    Controller cont = new Controller();      
    Equipa equi = cont.criarEquipa();
    equi.verJogadores();
    */

    Scanner scan = new Scanner(System.in);
    View view = new View();
    Controller controller = new Controller();
    EquipaList listaEquipas = new EquipaList();
    JogoList listaJogos = new JogoList();

    int instruction=0;
    int n;
    Loadlog log = new Loadlog();
    log.load(log.getFichDefaut(), listaEquipas, listaJogos);
       

    while(instruction!=-1){
        view.clearScreen();
        view.bola();
        view.menu();
        view.promptNivel1();
        try{
            instruction = scan.nextInt();
            scan.nextLine();
        }
        catch (InputMismatchException e) {
            instruction = -1;
            view.notAnInstruction();
        }
        view.clearScreen();
    switch (instruction){

        
        case 1:
        // print das equipas por indice
        listaEquipas.mostrarEquipas();

        view.queEquipaJog();
        view.promptNivel2();

        n = scan.nextInt();
        n--;
        scan.nextLine();

        Equipa equipa =  listaEquipas.getEquipa(n);        
        Boolean flag = true;
        while(flag){
        
        view.printVar("Numero do Jogador");
        view.promptNivel2();
        
        int num = scan.nextInt();
        scan.nextLine();
        if (!equipa.containsJogador(num)) {
            equipa.adicionarjogador(controller.criarJogador(), num);
            flag=false;
        }
            else view.jogJaExiste();
        }

        
        break;
        case 2:
        
        listaEquipas.addEquipa( controller.criarEquipa());
        
        break;
        case 3:
            view.jogConsultar();

            String nome = scan.nextLine();
            Jogador jog = listaEquipas.consultajogador(nome);
            if(jog!=null) view.print(jog.toString());
            view.pressEnter();
            scan.nextLine();
        
        break;
        case 4:
            // print das equipas por indice
            listaEquipas.mostrarEquipas();
            
            view.queEquipa();
            view.promptNivel2();
            
            n = scan.nextInt();
            n--;
            scan.nextLine();

            listaEquipas.consultarEquipa(n);
            scan.nextLine();
        break;
        case 5:

            view.jogConsultar();

            String nom = scan.nextLine();
            Jogador jogador = listaEquipas.consultajogador(nom);
        
            view.escEquipaMudar();
            listaEquipas.mostrarEquipas();
            view.queEquipa();
            view.promptNivel2();
            
            n = scan.nextInt();
            n--;
            scan.nextLine();
    
            Equipa novEquipa = listaEquipas.getEquipa(n);
            
            listaEquipas.mudaJogador(jogador, novEquipa);
        break;
        case 6:
            listaJogos.mostrarJogos();
        break;
        case 7:
            view.escEquipaCasa();
            listaEquipas.mostrarEquipas();
            view.queEquipa();
            view.promptNivel2();

            n = scan.nextInt();
            n--;
            scan.nextLine();

            EquipaJogo casa = listaEquipas.getEquipa(n).criarEquipaJogo();

            view.clearScreen();

            view.escEquipaFora();
            listaEquipas.mostrarEquipas();
            view.queEquipa();
            view.promptNivel2();

            n = scan.nextInt();
            n--;
            scan.nextLine();

            EquipaJogo fora = listaEquipas.getEquipa(n).criarEquipaJogo();

        
            Jogo jogo = new Jogo(LocalDate.now(),casa,fora,0,0);
            jogo.calcularResultadoJogo();
            listaJogos.addJogo(jogo);
        break;

        case 8:
        // guardar estado do progama
        break;
    }
}
    }



}





