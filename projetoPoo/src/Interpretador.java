import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Interpretador {
<<<<<<< HEAD
    
=======
    public void  menu(){
        StringBuilder sb = new StringBuilder ("\n--------------------------------------------------------------------\n\t\t  " +
                "Menu \n--------------------------------------------------------------------\n");
        sb.append("0)-Criar Jogador\n");
        sb.append("1- Criar Equipa\n");
        sb.append("2- Consultar Jogador\n");
        sb.append("3- Consultar Equipa\n");
        sb.append("4- Mudar Jogador De Equipa\n");
        sb.append("5- Realizar Jogo");

            System.out.print(sb.toString());
         
    }


>>>>>>> cde06a1... inter and controller
}

    public void tipoJogador (){
        StringBuilder sb = new StringBuilder();
        sb.append ("Criar:\n");
        sb.append ("1-Atacante\n");
        sb.append ("2-Médio   \n");
        sb.append ("3-Defesa  \n");
        sb.append ("4-Lateral \n");
        sb.append ("5-Guarda-Redes\n");
        System.out.print();




    }

    