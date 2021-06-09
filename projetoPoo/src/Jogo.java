import java.lang.String;
import java.util.Random;

public class Jogo{

    
    private int time;
    private EquipaJogo casa;
    private EquipaJogo fora;
    private int scoreEqCasa;
    private int scoreEqFora;
    private int parteAtual;
    private int partes;

    public Jogo(int time, EquipaJogo casa, EquipaJogo fora, int scoreEqCasa, int scoreEqFora, int parteAtual,
    int partes) {

        this.time = time;
        this.casa = casa;
        this.fora = fora;
        this.scoreEqCasa = scoreEqCasa;
        this.scoreEqFora = scoreEqFora;
        this.parteAtual = parteAtual;
        this.partes = partes;
}

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


    public int getTime() {
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
        sb.append("[scoreEqCasa= ").append(casa.getScore()).append(";");
        sb.append(" scoreEqFora= ").append(fora.getScore()).append(";");
        sb.append(" time=").append(this.getTime()).append(";");
        sb.append("]").append("\n");
    
        return sb.toString();
    
        }
    
    public void calculaParte(){
        
        if (casa.estaAtacar()){
            
            System.out.println("Casa esta a Atacar");

            if (casa.marcou(fora)) {
                
                System.out.println("Casa Marcou");
                casa.setScore(casa.getScore()+1);
                casa.setEstado(Estado.DEFESA);
                fora.setEstado(Estado.ATAQUE);
            }else {

                if(casa.perdeuBola()){
                    System.out.println("Casa Perdeu a bola");
                    casa.setEstado(Estado.DEFESA);
                    fora.setEstado(Estado.ATAQUE);
                }else{
                    System.out.println("Casa Continua com a bola");
                    
                }
                
            }

        }else{
            
            System.out.println("Fora esta a Atacar");
            if (fora.marcou(casa)) {
                
                System.out.println("Fora Marcou");
                
                fora.setScore(fora.getScore()+1);
                fora.setEstado(Estado.DEFESA);
                casa.setEstado(Estado.ATAQUE);
            }else {

                if(fora.perdeuBola()){
                    System.out.println("Fora Perdeu a bola");
                    fora.setEstado(Estado.DEFESA);
                    casa.setEstado(Estado.ATAQUE);
                }else{
                    System.out.println("Fora Continua com a bola");
                    
                }
                
            }
        }
        
        setTime(this.getTime()+5);
        setParteAtual(this.getParteAtual()+1);
    }
    
    public boolean calcularResultadoJogo (){
      
      
      for(int i = 0; i < 18; i++){
        calculaParte();
      }
      
      
    return false;
    }


    
}