package model;

import view.View;

import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.AbstractMap.SimpleEntry;

public class Jogo{

    
    private LocalDate time;
    private EquipaJogo casa;
    private EquipaJogo fora;
    private int substCasa;
    private int substFora;
    private List<SimpleEntry<Integer,Integer>> substituicoesCasa;
    private List<SimpleEntry<Integer,Integer>> substituicoesFora;


    

    public Jogo(LocalDate time, EquipaJogo casa, EquipaJogo fora, int substCasa, int substFora) {

        this.time = time;
        this.casa = casa;
        this.fora = fora;
        this.substCasa = substCasa;
        this.substFora = substFora;
}

    public Jogo() {
        this.time     = LocalDate.now();
        this.substCasa = 0;
        this.substFora = 0;
    }

    public Jogo(LocalDate time, int substCasa, int substFora) {
        this.time     = time;
        this.substCasa = substCasa;
        this.substFora = substFora;
    }


    public LocalDate getTime() {
        return time;
    }
    public void setTime(LocalDate time) {
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
    
    public List<SimpleEntry<Integer, Integer>> getSubstituicoesCasa() {
        return substituicoesCasa;
    }

    public void setSubstituicoesCasa(List<SimpleEntry<Integer, Integer>> substituicoesCasa) {
        this.substituicoesCasa = substituicoesCasa;
    }

    public List<SimpleEntry<Integer, Integer>> getSubstituicoesFora() {
        return substituicoesFora;
    }

    public void setSubstituicoesFora(List<SimpleEntry<Integer, Integer>> substituicoesFora) {
        this.substituicoesFora = substituicoesFora;
    }

    
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Jogo ");
        sb.append("scoreEqCasa= ").append(casa.getScore()).append(";");
        sb.append(" scoreEqFora= ").append(fora.getScore()).append(";");
        sb.append(" time=").append(this.getTime()).append(";");
        sb.append("").append("\n");
    
        return sb.toString();
    
        }
    
    public void calculaParte(){
        View view = new View();
        if (casa.estaAtacar()){
            
            view.print("Casa esta a Atacar");

            if (casa.marcou(fora)) {
                
                view.print("Casa Marcou");
                casa.setScore(casa.getScore()+1);
                casa.setEstado(Estado.DEFESA);
                fora.setEstado(Estado.ATAQUE);
            }else {

                if(casa.perdeuBola()){
                    view.print("Casa Perdeu a bola");
                    casa.setEstado(Estado.DEFESA);
                    fora.setEstado(Estado.ATAQUE);
                }else{
                    view.print("Casa Continua com a bola");
                    
                }
                
            }

        }else{
            
            view.print("Fora esta a Atacar");
            if (fora.marcou(casa)) {
                
                view.print("Fora Marcou");
                
                fora.setScore(fora.getScore()+1);
                fora.setEstado(Estado.DEFESA);
                casa.setEstado(Estado.ATAQUE);
            }else {

                if(fora.perdeuBola()){
                    view.print("Fora Perdeu a bola");
                    fora.setEstado(Estado.DEFESA);
                    casa.setEstado(Estado.ATAQUE);
                }else{
                    view.print("Fora Continua com a bola");
                    
                }
                
            }
        }
        
    }
    
    public boolean calcularResultadoJogo (){
      
      View view = new View();
      casa.setEstado(Estado.ATAQUE);
      fora.setEstado(Estado.DEFESA);

      for(int i = 0; i < 9; i++){
        
        calculaParte();

        if (casa.substituicao() && (substCasa<3)){
            substituicoesCasa.add( casa.substituir());
            setSubstCasa(setSubstCasa()+1);
        } 
        if (fora.substituicao() && (substFora<3)){
            substituicoesFora.add( fora.substituir());
            setSubstFora(setSubstFora()+1);
        } 
    }
      
      view.listTitulares(casa);

      for(int i = 0; i < 9; i++){
        
        calculaParte();
        if (casa.substituicao() && (substCasa>3)){
            substituicoesCasa.add( casa.substituir());
            setSubstCasa(setSubstCasa()+1);
           } 
        if (fora.substituicao() && (substFora>3)){
            substituicoesFora.add( fora.substituir());
            setSubstFora(setSubstFora()+1);
        } 
    }
        view.listTitulares(casa);

      
    return false;
    }


    
}