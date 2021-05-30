import java.lang.String;

public class Jogo{

    
    private int time;
    private int scoreEqCasa;
    private int scoreEqFora;
    private int parteAtual;
    private int partes;

    public Jogo() {
        this.time     = 0;
        this.scoreEqCasa = 0;
        this.scoreEqFora = 0;
        this.partes   = 18;
    }

    public Jogo(int time, int scoreEqCasa, int scoreEqFora) {
        this.time     = time;
        this.scoreEqCasa = scoreEqCasa;
        this.scoreEqFora = scoreEqFora;
        this.partes   = 18;
    }


    public float getTime() {
        return time;
    }
    public void setTime(int time) {
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
    public int getParteAtual() {
        return parteAtual;
    }

    public void setParteAtual(int parteAtual) {
        this.parteAtual = parteAtual;
    }

    
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Jogo ");
        sb.append("[scoreEqCasa= ").append(this.getScoreEqCasa()).append(";");
        sb.append(", scoreEqFora= ").append(this.getScoreEqFora()).append(";");
        sb.append(", time=").append(this.getTime()).append(";");
        sb.append("]").append("\n");
    
        return sb.toString();
    
        }
    
    public void calculaParte(){
        setParteAtual(this.getParteAtual()+1);
    }
    
    public boolean calcularResultadoJogo (){
      
      
      
      
      
    return false;
    }


    
}