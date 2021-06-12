package model;

import view.View;

import java.lang.String;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.AbstractMap.SimpleEntry;

public class Jogo{

    // private  String equipa1
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
        this.substituicoesCasa = new ArrayList<>();
        this.substituicoesFora = new ArrayList<>();
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

    public EquipaJogo getEquipaCasa(){
        EquipaJogo equipa = casa ;
        return equipa ;

    }
    public EquipaJogo getEquipaFora(){
        EquipaJogo equipa = fora ;
        return equipa ;

    }




    public LocalDate getTime() {
        return time;
    }
    public void setTime(LocalDate time) {
        this.time = time;
    }
    public int getSubstCasa() {
        return substCasa;
    }
    public void setSubstCasa(int substCasa) {
        this.substCasa = substCasa;
    }

    public int getSubstFora() {
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
        System.out.println(substCasa);

        System.out.println(substFora);
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

        if (casa.substituicao() && (casa.getSuplentes().size() != 0)){
            int sai = (int) Math.floor(Math.random()*(casa.getJogEmCampo().size()));
            int entra = (int) Math.floor(Math.random()*(casa.getSuplentes().size()));

            SimpleEntry<Integer,Integer> subst = new SimpleEntry<Integer,Integer>(casa.getJogEmCampo().get(sai).getCamisola(),  
                                                                                    casa.getSuplentes().get(entra).getCamisola());
            casa.substituir(entra,sai);
            
            substituicoesCasa.add( subst);
            setSubstCasa(getSubstCasa()+1);
                
            } 
            
        if (fora.substituicao()  && (fora.getSuplentes().size() != 0)){
            int sai = (int) Math.floor(Math.random()*(fora.getJogEmCampo().size()));
            int entra = (int) Math.floor(Math.random()*(fora.getSuplentes().size()));

            SimpleEntry<Integer,Integer> subst = new SimpleEntry<Integer,Integer>(fora.getJogEmCampo().get(sai).getCamisola(),
                                                                                 fora.getSuplentes().get(entra).getCamisola());
            fora.substituir(entra,sai);
            
            substituicoesFora.add( subst);
            setSubstFora(getSubstFora()+1);
            
                
            }

        view.listTitulares(casa);

        view.listTitulares(fora);
    }
      

      for(int i = 0; i < 9; i++){
        
        calculaParte();
        
        if (casa.substituicao() && (casa.getSuplentes().size() != 0)){
            int sai = (int) Math.floor(Math.random()*(casa.getJogEmCampo().size()));
            int entra = (int) Math.floor(Math.random()*(casa.getSuplentes().size()));

            SimpleEntry<Integer,Integer> subst = new SimpleEntry<>( casa.getJogEmCampo().get(sai).getCamisola(),
                                                                    casa.getSuplentes().get(entra).getCamisola());
            casa.substituir(entra,sai);
            if (subst != null){
                substituicoesCasa.add( subst);
                setSubstCasa(getSubstCasa()+1);
                }
            } 
            
        if (fora.substituicao() && (fora.getSuplentes().size() != 0)){
            int sai = (int) Math.floor(Math.random()*(fora.getJogEmCampo().size()));
            int entra = (int) Math.floor(Math.random()*(fora.getSuplentes().size()));

            SimpleEntry<Integer,Integer> subst = new SimpleEntry<>(fora.getJogEmCampo().get(sai).getCamisola(),
                                                                   fora.getSuplentes().get(entra).getCamisola());
            fora.substituir(entra,sai);
            
            if (subst != null){
                substituicoesFora.add( subst);
                setSubstFora(getSubstFora()+1);
                }
            } 

 
    }
      
    return false;
    }


    
}


