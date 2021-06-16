package model;

import model.*;
import view.View;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class BusinessList {
    private List<Business> list ; 
 
    public BusinessList (){
        this.list = new ArrayList<>();
    }
 
    public List<Business> getList () {
        List<Business> nova =list;
     return nova;
    }
 
    public Business getLast(){
        Business e = list.get(list.size()-1);
        return e;
    }
 
    public Business getBusiness(int n){
     Business e = list.get(n);
     return e;
     }
 
     /*
    public Business criaBusiness(String nome ){
        Business newBusiness = new Business();
        nova.setBusiness(nome);
        this.list.add(nova);
        return nova;
    }
 */
    public void addBusiness(Business business){
        list.add(business);
     }
 
     public void consultarBusiness(int n) {
 
         Business e = list.get(n);
         e.toString();
     }
 
     public int size() {
         return list.size();
     }
 
     // so o nome de tds as Businesss 
     public void mostrarBusinesss(){
        View view = new View();
        StringBuilder sb = new StringBuilder();
        int aux = 0;
        for(Business business : list) {
            aux++;
            sb.append( aux + "-" + business.toString()).append("\n");
        }
        view.print(sb.toString());
 
     }
 
     // consulta a Business consoante o nome da msm 
     public Business verBusiness( String nome ) {
         View view = new View ();
         Business procura =null;
         try{
         for (Business business : list ){
           if (business.getName().equals(nome)){
              procura = business;
           }
         }
     }
         catch (InputMismatchException e) {
             view.notAnInstruction();
              }
        return procura;
 
     }
 
 
     public Business getBusiness(String id) {
         Business procura =null;
         for ( Business business : list){
            if(business.getBusinessId().equals(id)){
                procura = business;
            }
         }
         return procura;
     }

 }
 
