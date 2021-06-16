package view;

import model.*;
import java.util.ArrayList;


public class View {
    public void  menu(){
        
        StringBuilder sb = new StringBuilder ( );
        sb.append("\n---------------------------------------------------------\n\t\t\t  ");
        sb.append("Menu \n---------------------------------------------------------\n");
        sb.append("1)- Criar Jogador\n");
        sb.append("2)- Criar Equipa\n");
        sb.append("3)- Consultar Jogador\n");
        sb.append("4)- Consultar Equipa\n");
        sb.append("5)- Mudar Jogador De Equipa\n");
        sb.append("6)- Consultar Historico de Jogos\n");
        sb.append("7)- Realizar Jogo\n");
        sb.append("8)- Guardar Estado do Progama\n");
        sb.append("9)- Ler Ficheiro\n");

        System.out.print(sb.toString());
         
    }




    public void print(String string) {
        System.out.println (string);
    }   
    
    public void printVar(String var){
        System.out.println (var + ":");
    }

    public void printOpErrada() {
        System.out.println ("OPCAO ERRADA, Tente Novamente\n");
    }

    public void clearScreen(){
       System.out.println("\033[H\033[2J"); 
    }

    public void notAnInstruction(){
        System.out.print("Esta instruçao nao esta definida!\n");
    }

    public void promptNivel1 (){
        System.out.print("\n# > ");
    }
    public void promptNivel2 (){
        System.out.print("\n# >> ");
    }
 
    public void promptNivel3 (){
        System.out.print("\n# >>> ");
    }

    public void pressEnter() {
        System.out.println("Press Enter to Continue");
    }

    public void fichQueQuer() {
        System.out.println("Nome do ficheiro que pretende\n");
    }
}

    