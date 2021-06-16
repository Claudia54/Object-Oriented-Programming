package model.Users;


import view.View;

import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class UserList {
    private List<User> list ; 
 
    public UserList (){
        this.list = new ArrayList<>();
    }
 
    public List<User> getList () {
        List<User> nova =list;
     return nova;
    }
 
    public User getLast(){
        User e = list.get(list.size()-1);
        return e;
    }
 
    public User getUser(int n){
     User e = list.get(n);
     return e;
     }
 
     /*
    public User criaUser(String nome ){
        User newUser = new User();
        nova.setUser(nome);
        this.list.add(nova);
        return nova;
    }
 */
    public void addUser(User user){
        list.add(user);
     }
 
     public void consultarUser(int n) {
 
         User e = list.get(n);
         e.toString();
     }
 
     public int size() {
         return list.size();
     }
 
     // so o nome de tds as Users 
     public void mostrarUsers(){
        View view = new View();
        StringBuilder sb = new StringBuilder();
        int aux = 0;
        for(User user : list) {
            aux++;
            sb.append( aux + "-" + user.toString()).append("\n");
        }
        view.print(sb.toString());
 
     }
 
     // consulta a User consoante o nome da msm 
     public User verUser( String nome ) {
         View view = new View ();
         User procura =null;
         try{
         for (User user : list ){
           if (user.getName().equals(nome)){
              procura = user;
           }
         }
     }
         catch (InputMismatchException e) {
             view.notAnInstruction();
              }
        return procura;
 
     }
 
 
     public User getUser(String id) {
         User procura =null;
         for ( User user : list){
            if(user.getUserId().equals(id)){
                procura = user;
            }
         }
         return procura;
     }

 }
 
