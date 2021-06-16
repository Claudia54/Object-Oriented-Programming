import model.*;
import controller.*;
import view.*;
import Loaders.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner ;

public class Programa {

    
    
    public static void main (String[] args ) throws IOException{

    Scanner scan = new Scanner(System.in);
    View view = new View();
    Controller controller = new Controller();
    EquipaList listaEquipas = new EquipaList();
    JogoList listaJogos = new JogoList();

    int instruction=0;
    int n;
       

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
            equipa.adicionarjogador(controller.criarJogador(num), num);
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
            view.print(jogo.getSubstituicoesCasa().toString());
            listaJogos.addJogo(jogo);
        break;

        case 8:

            
            WriteLog logescrita = new WriteLog(listaEquipas,listaJogos);
            logescrita.criarFicheiro();
          
        break;
        case 9:
            view.fichQueQuer();
            String fich = scan.nextLine();

            Loadlog log = new Loadlog();


            listaEquipas = new EquipaList();
            listaJogos = new JogoList();

            if(log.load(fich, listaEquipas, listaJogos));
            else log.load(log.getFichDefaut(), listaEquipas, listaJogos);
   
        break;
    }
}
    }



}





