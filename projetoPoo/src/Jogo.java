

public class Jogo{

    private String time;
    private int scoreEq1;
    private int scoreEq2;
    private int partes;

    public Jogo() {
        this.time     = "n/a";
        this.scoreEq1 = 0;
        this.scoreEq2 = 0;
        this.partes   = 0;
    }

    public Jogo(String time, int scoreEq1, int scoreEq2,int partes) {
        this.time     = time;
        this.scoreEq1 = scoreEq1;
        this.scoreEq2 = scoreEq2;
        this.partes   = partes;
    }


    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getScoreEq1() {
        return scoreEq1;
    }
    public void setScoreEq1(int scoreEq1) {
        this.scoreEq1 = scoreEq1;
    }

    public int getScoreEq2() {
        return scoreEq2;
    }
    public void setScoreEq2(int scoreEq2) {
        this.scoreEq2 = scoreEq2;
    }
    public int getPartes() {
        return partes;
    }

    public void setPartes(int partes) {
        this.partes = partes;
    }
}
    
    public String toString() {
        return "Jogo [scoreEq1=" +
                        scoreEq1 +
                   ", scoreEq2=" + 
                        scoreEq2 + 
                       ", time=" + 
                            time +
                              "]";
    }
    public boolean calcularResultadoJogo (){
      return false;
    }


    
}