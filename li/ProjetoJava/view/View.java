package view;

import model.*;
import java.util.ArrayList;


public class View {
    public void  menu(){
        
        StringBuilder sb = new StringBuilder ( );
        sb.append("\n---------------------------------------------------------\n\t\t\t  ");
        sb.append("Menu \n---------------------------------------------------------\n");
        sb.append("0) -Estatisticas \n");
        sb.append("1)- Lista ordenada alfabeticamente com os identificadores dos negócios nunca avaliados e o seu respetivo total;\n");
        sb.append("2)- Dado um mês e um ano (válidos), determinar o número total global de reviews realizadas e o número total de users distintos que as realizaram;\n");
        sb.append("3)- Dado um código de utilizador, determinar, para cada mês, quantas reviews fez,quantos negócios distintos avaliou e que nota média atribuiu;\n");
        sb.append("4)- Dado o código de um negócio, determinar, mês a mês, quantas vezes foi avaliado,por quantos users diferentes e a média de classificação;\n");
        sb.append("5)- Dado o código de um utilizador determinar a lista de nomes de negócios que mais avaliou (e quantos), ordenada por ordem decrescente de quantidade e, paraquantidades iguais, por ordem alfabética dos negócios;\n");
        sb.append("6)- Determinar o conjunto dos X negócios mais avaliados (com mais reviews) em cada ano, indicando o número total de distintos utilizadores que o avaliaram (X é uminteiro dado pelo utilizador);\n");
        sb.append("7)- Determinar, para cada cidade, a lista dos três mais famosos negócios em termos de número de reviews;\n");
        sb.append("8)- Determinar os códigos dos X utilizadores (sendo X dado pelo utilizador) que avaliaram mais negócios diferentes, indicando quantos, sendo o critério deordenação a ordem decrescente do número de negócios\n");
        sb.append("9)- Dado o código de um negócio, determinar o conjunto dos X users que mais o avaliaram e, para cada um, qual o valor médio de classificação (ordenação cf. 5)n\n");

        System.out.print(sb.toString());
         
    }


    public void menuEstatisticas () {
        StringBuilder sb = new StringBuilder ( );
        sb.append("Estatisticas que pretende consultar:\n");
        sb.append ("1)-número total de registos de reviews errados\n");
        sb.append("2)-número total de negócios\n");
        sb.append("3)-total de diferentes negócios avaliados (nº reviews > 0)\n");
        sb.append("4)-número total de negócios não avaliados\n");
        sb.append("5)- número total de users \n");
        sb.append ("6)-numero total de users que realizaram reviews\n");
        sb.append ("7)-total de users que nada avaliaram\n");
        sb.append("8)-total de users inativos (sem reviews)\n");
        sb.append("9)-reviews com 0 impacto (0 valores no somatório de cool, funny ou useful)\n");
        sb.append("10)-Número total de reviews por mês\n");
        sb.append("11)-Média de classificação de reviews por mês e o valor global (média global de reviews);\n");
        sb.append ("12)-Número de distintos utilizadores que avaliaram em cada mês .\n");
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

    