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
        sb.append("6)- Realizar Jogo\n\n");

        System.out.print(sb.toString());
         
    }

    public void bola(){

        StringBuilder sb = new StringBuilder ( );
        sb.append("\n\t    ");
        sb.append("          _...----.._").append("\n\t    ");
        sb.append("        ,:':::::.     `>.").append("\n\t    ");
        sb.append("      ,' |:::::;'     |:::.").append("\n\t    ");
        sb.append("     /    `'::'       :::::").append("\n\t    ");
        sb.append("    /         _____     `::;").append("\n\t    ");
        sb.append("   :         /:::::\\      ` :").append("\n\t    ");
        sb.append("   | ,.     /::Poo::\\       |").append("\n\t    ");
        sb.append("   |;:::.   `::::::;'       |").append("\n\t    ");
        sb.append("   ::::::     `::;'      ,. ;").append("\n\t    ");
        sb.append("    \\:::'              ,::::/").append("\n\t    ");
        sb.append("     \\                 \\:::/").append("\n\t    ");
        sb.append("      `.     ,:.        :;'").append("\n\t    ");
        sb.append("        `-.::::::..  _.''").append("\n\t    ");
        sb.append("           ```----'''").append("\n\t");

        
        System.out.print(sb.toString());
    }


    public void menuJogador (){
        StringBuilder sb = new StringBuilder();

        sb.append ("Criar:\n");
        sb.append ("1-Atacante\n");
        sb.append ("2-Médio   \n");
        sb.append ("3-Defesa  \n");
        sb.append ("4-Lateral \n");
        sb.append ("5-Guarda-Redes\n");
        
        System.out.print(sb.toString());

    }


    public void menuEquipa (){
        StringBuilder sb = new StringBuilder();
        sb.append ("Criação de Equipa\n");
        sb.append ("Qual o nome da sua Equipa?\n");
        sb.append ("Pretende adicionar jogadores?\n");
        sb.append ("Qual o nº de Jogadores?\n");   

    }

    public void listTitulares(EquipaJogo equipa){
        StringBuilder sb = new StringBuilder();
        int aux=0;
        ArrayList<Jogador> list = equipa.getJogEmCampo();
        for(Jogador i : list) {
          aux++;
           sb.append( aux + "-" + i.toString()).append("\n");
        }
        System.out.println(sb.toString());
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

    public void jogJaExiste() {
        System.out.println ("JOGADOR COM ESSE NUMERO JA EXISTE, Tente Novamente\n");
    }

    public void clearScreen(){
       System.out.println("\033[H\033[2J"); 
    }

    public void escJogTitu() {
        System.out.println("Escolha os Jogadores Titulares\n");
    }

    public void jogadorNaoExite() {
        System.out.println("Esse jogador não existe, Escolha outro\n");
    }

    public void escJogSup() {
        System.out.println("Escolha os Jogadores Suplentes\n");
    }

    public void notAnInstruction(){
        System.out.print("Esta instruçao nao esta definida!\n");
    }

    public void queEquipa() {
        System.out.print("Indice da equipa que pretende consultar:\n");
    }

    public void queEquipaJog() {
        System.out.print("Indice da equipa que pretende adicionar o jogador:\n");
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

}

    