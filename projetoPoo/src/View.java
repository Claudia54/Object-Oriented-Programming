public class View {
    public void  menu(){
        
        StringBuilder sb = new StringBuilder ( );
        sb.append("\n---------------------------------------------------------\n\t\t\t  ");
        sb.append("Menu \n---------------------------------------------------------\n");
        sb.append("0)- Criar Jogador\n");
        sb.append("1)- Criar Equipa\n");
        sb.append("2)- Consultar Jogador\n");
        sb.append("3)- Consultar Equipa\n");
        sb.append("4)- Mudar Jogador De Equipa\n");
        sb.append("5)- Realizar Jogo\n\n");

            System.out.print(sb.toString());
         
    }

    public void bola(){

        StringBuilder sb = new StringBuilder ( );
        sb.append("\n\n\t    ");
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

    public void printVar(String var){
        System.out.println (var + ":");
    }

    public void menuEquipa (){
        StringBuilder sb = new StringBuilder();
        sb.append ("Criação de Equipa\n");
        sb.append ("Qual o nome da sua Equipa?\n");
        sb.append ("Pretende adicionar jogadores?\n");
        sb.append ("Qual o nº de Jogadores?\n");
        

    }

    
}

    