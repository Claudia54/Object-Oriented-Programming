
package src;


public class Jogo{

    private String time;
    private int scoreEq1;
    private int scoreEq2;

    public Jogo() {
        this.time     = "n/a";
        this.scoreEq1 = 0;
        this.scoreEq2 = 0;
    }

    public Jogo(String time, int scoreEq1, int scoreEq2) {
        this.time     = time;
        this.scoreEq1 = scoreEq1;
        this.scoreEq2 = scoreEq2;
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
    
    public String toString() {
        return "Jogo [scoreEq1=" +
                        scoreEq1 +
                   ", scoreEq2=" + 
                        scoreEq2 + 
                       ", time=" + 
                            time +
                              "]";
    }


    
    
}