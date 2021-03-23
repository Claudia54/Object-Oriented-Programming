import java.util.Scanner; 
public class Exemplo4 {
     public static void convert (int a,int b){
        int t1,t2 ;
        String dia1, mes1,ano1, dia2,mes2,ano2 ;
        Scanner inputReader = new Scanner(System.in);
        //t1= args.indexOf('-');
        //dia= args.substring(0,t1);
        
        //t2= args1.indexOf('-');
        //dia2= args.substring(0,t2);
        
             
            
         }

     }
      public static void main(String[] args, String[] args1) { 
          int n;
          Scanner inputReader = new Scanner(System.in);
          System.out.printl ("Escreva uma data no formato d-m-a");
          System.out.printl ("Escreva uma data no formato d-m-a ");
          String date = inputReader.nextLine();
                Scanner dateReader = new Scanner(date);
                dateReader.useDelimiter("\\W");
                int day = dateReader.nextInt();
                int month = dateReader.nextInt();
                int year = dateReader.nextInt();
                int weekDay = exs.dayOfTheWeek(day,month,year);



