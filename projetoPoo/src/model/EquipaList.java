package model;

import view.View;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;


public class EquipaList { //  implents List // por agregacao
   private List<Equipa> list ; // implementar List por composicao

   public EquipaList (){
       this.list = new ArrayList<>();
   }

   public List<Equipa> getList () {
       List<Equipa> nova =list;
    return nova;
   }

   public Equipa getLast(){
       Equipa e = list.get(list.size()-1);
       return e;
   }

   public Equipa getEquipa(int n){
    Equipa e = list.get(n);
    return e;
    }

   public Equipa criaEquipa(String nome ){
       Equipa nova = new Equipa();
       nova.setEquipa(nome);
       this.list.add(nova);
       return nova;
   }

   public void addEquipa(Equipa equ){
    this.list.add(equ);
    }

    public void consultarEquipa(int n) {

        Equipa e = list.get(n);
        e.verJogadores();
    }

    public int size() {
        return list.size();
    }

    // so o nome de tds as equipas 
    public void mostrarEquipas(){
    View view = new View();
    StringBuilder sb = new StringBuilder();
    int aux=0;
    for(Equipa i : list) {
      aux++;
       sb.append( aux + "-" + i.getEquipa()).append("\n");
    }
    view.print(sb.toString());

    }

    // consulta a equipa consoante o nome da msm 
    public Equipa verEquipa(String nome ) {
        View view = new View ();
        Equipa eq =null;
        try{
        for (Equipa i : list ){
          if (i.getEquipa().equals(nome)){
             eq= i;
          }
        }
    }
        catch (InputMismatchException e) {
            view.notAnInstruction();
             }
       return eq;

    }

    // int char bool 
    
    // dado o nome do jogador diz td sobre ele 
    public Jogador consultajogador (String nome) {
        View view = new View ();
        Jogador f = null ;
    try{
    for (Equipa aux : this.list ){ // List list ;  list.get("Gusto"); 
        for (Jogador i : aux.getJogadores().values()){ // HashMap < key, value>
             if (i.getNome().equals(nome)){
                  f = i;
                }
        
            }
        }
    }
    catch (InputMismatchException e) {
       view.notAnInstruction();
        }
    return f ;
    }

    public Equipa getEquipaa(String nomejogador) {
        Equipa i =null;
        for ( Equipa aux :list){
           for (Jogador jog : aux.getJogadores().values()){
               i= verEquipa(jog.getHistorico().get(0));
           }
        }
        return i;
    }

    public void mudaJogador(Jogador jogador , Equipa novEquipa){
        int i;
        i = getEquipaa(jogador.getNome()).removerjogador(jogador.getNome());
        if (i>=0){
        novEquipa.adicionarjogador(jogador, i);
        }

    }


}

