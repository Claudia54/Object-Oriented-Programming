import java.util.Arrays;
import java.time.LocalDate;

// ???? nao tenho a certeza 
public class Ficha2_ex3 {
   private LocalDate [] date;
   private int numels;

   public Ficha2_ex3(int size){
       this.date= new LocalDate[size];
       this.numels=0;
   }
   public void insereData(LocalDate data){
      if (this.numels<date.length)
         this.date[this.numels++]=data;
}
   public int[] dataMaisProximacontas(LocalDate data){
     long shortestDiff = Math.abs(DAYS.between(data, this.date[0]));
      LocalDate closestDate = this.dates[0];
      for(int i = 0; i < this.numels; i++) {
            LocalDate dataX = this.dates[i];
            long daysBetween = Math.abs(DAYS.between(data, dataX));
            if(daysBetween < shortestDiff) {
                closestDate = dataX;
                shortestDiff = daysBetween;
            }
        }
        return closestDate;
    }
   
}
    