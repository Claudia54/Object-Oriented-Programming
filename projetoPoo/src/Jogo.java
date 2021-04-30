

public class Jogo{

    
    private String time;
    private int scoreEqCasa;
    private int scoreEqFora;
    private int partes;

    public Jogo() {
        this.time     = "n/a";
        this.scoreEqCasa = 0;
        this.scoreEqFora = 0;
        this.partes   = 0;
    }

    public Jogo(String time, int scoreEqCasa, int scoreEqFora,int partes) {
        this.time     = time;
        this.scoreEqCasa = scoreEqCasa;
        this.scoreEqFora = scoreEqFora;
        this.partes   = partes;
    }


    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getScoreEqCasa() {
        return scoreEqCasa;
    }
    public void setScoreEqCasa(int scoreEqCasa) {
        this.scoreEqCasa = scoreEqCasa;
    }

    public int getScoreEqFora() {
        return scoreEqFora;
    }
    public void setScoreEqFora(int scoreEqFora) {
        this.scoreEqFora = scoreEqFora;
    }
    public int getPartes() {
        return partes;
    }

    public void setPartes(int partes) {
        this.partes = partes;
    }
}
    
    public String toString() {
        return "Jogo [scoreEqCasa=" +
                        scoreEqCasa +
                   ", scoreEqFora=" + 
                        scoreEqFora + 
                       ", time=" + 
                            time +
                              "]";
    }
    public boolean calcularResultadoJogo (){
      return false;
    }


    
}