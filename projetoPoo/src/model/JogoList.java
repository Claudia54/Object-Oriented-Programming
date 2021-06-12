package model;

import java.util.ArrayList;
import java.util.List;

import view.View;

public class JogoList {
    List<Jogo> jogos;

    public JogoList(){
        this.jogos= new ArrayList <>();
    }
    
    public Jogo getLast(){
        Jogo e = jogos.get(jogos.size()-1);
        return e;
    }
 
    public Jogo getJogo(int n){
     Jogo e = jogos.get(n);
     return e;
     }

     public Jogo criaJogo(){
        Jogo nova = new Jogo();
        this.jogos.add(nova);
        return nova;
    }
 
    public void addJogo(Jogo jogo){
     this.jogos.add(jogo);
     }
 
     public void consultarJogo(Equipa a , Equipa b) {
         /*Equipa e = jogos.get(n);
         e.verJogadores();*/
     }
 
     public int size() {
         return jogos.size();
     }
 
      
     public void mostrarJogos(){
     View view = new View();
     StringBuilder sb = new StringBuilder();
     int aux=0;
     for(Jogo i : jogos) {
       aux++;
        sb.append( aux + "-" + i.toString()).append("\n");
     }
     view.print(sb.toString());
 
     }
 
  
 
 
 }
 
 



    

  
