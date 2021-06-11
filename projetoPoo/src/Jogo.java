import java.lang.String;
import java.util.List;
import java.util.Random;
import java.util.AbstractMap.SimpleEntry;

public class Jogo{

    
    private int time;
    private EquipaJogo casa;
    private EquipaJogo fora;
    private int substCasa;
    private int substFora;
    private int parteAtual;
    private int partes;
    private List<SimpleEntry<Integer,Integer>> substituicoes;


    public Jogo(int time, EquipaJogo casa, EquipaJogo fora, int substCasa, int substFora, int parteAtual,
    int partes) {

        this.time = time;
        this.casa = casa;
        this.fora = fora;
        this.substCasa = substCasa;
        this.substFora = substFora;
        this.parteAtual = parteAtual;
        this.partes = partes;
}

    public Jogo() {
        this.time     = 0;
        this.substCasa = 0;
        this.substFora = 0;
        this.partes   = 18;
    }

    public Jogo(int time, int substCasa, int substFora) {
        this.time     = time;
        this.substCasa = substCasa;
        this.substFora = substFora;
        this.partes   = 18;
    }


    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public int setSubstCasa() {
        return substCasa;
    }
    public void setSubstCasa(int substCasa) {
        this.substCasa = substCasa;
    }

    public int setSubstFora() {
        return substFora;
    }
    public void setSubstFora(int substFora) {
        this.substFora = substFora;
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

    public List<SimpleEntry<Integer, Integer>> getSubstituicoes() {
        return substituicoes;
    }

    public void setSubstituicoes(List<SimpleEntry<Integer, Integer>> substituicoes) {
        this.substituicoes = substituicoes;
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

        System.out.println(time + " min");
        setParteAtual(this.getParteAtual()+1);
    }
    
    public boolean calcularResultadoJogo (){
      
      View view = new View();
      
      for(int i = 0; i < 9; i++){
        
        calculaParte();

        if (casa.substituicao() && (substCasa<3)) casa.substituir();setSubstCasa(setSubstCasa()+1);
        if (fora.substituicao() && (substFora<3)) fora.substituir();setSubstFora(setSubstFora()+1);
    }
      
      view.listTitulares(casa);
      // FAZER SUBSTITUICOES
      
      for(int i = 0; i < 9; i++){
        
        calculaParte();
        if (casa.substituicao() && (substCasa>3)) casa.substituir();
        if (fora.substituicao() && (substFora>3)) fora.substituir();
    }
        view.listTitulares(casa);

      
    return false;
    }


    
}