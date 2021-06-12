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
        System.out.print("Indice da equipa que pretende :\n");
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

    public void escEquipaCasa() {
        System.out.println("Escolha a equipa que joga em Casa\n");
    }

    public void escEquipaFora() {
        System.out.println("Escolha a equipa que joga Fora\n");
    }
    public void escEquipaMudar() {
        System.out.println("Escolha a equipa para a qual o jogador vai\n");
    }

    public void jogConsultar() {
        System.out.println("Nome do jogador que pretende\n");
    }

    public void fichQueQuer() {
        System.out.println("Nome do ficheiro que pretende\n");
    }
}

    