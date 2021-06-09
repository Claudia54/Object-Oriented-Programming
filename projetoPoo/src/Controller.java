
public class Controller {

    public void menuInt (){
        int instruction;
        try{
            instruction = this.scan.nextInt();
            this.scan.nextLine();
        }
        catch (InputMismatchException e) {
            instruction = -1;
            this.view.notAnInstruction();
        }

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

    public void escolheJogador(){
        try{
            instruction = this.scan.nextInt();
            this.scan.nextLine();
        }
        catch (InputMismatchException e) {
            instruction = -1;
            this.view.notAnInstruction();
        }
        switch ()
    }
    
}
