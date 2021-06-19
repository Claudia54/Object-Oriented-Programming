/**
 * Escreva a descrição da classe User aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

package model;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;

public class User
{
    private String userId;
    private String name;
    private List<String> friends;
    
    public User(){
        this.userId = "";
        this.name = "";
        this.friends = new ArrayList<>();
    }
    
    public User(String user_id, String name, List<String> friends){
        this.userId = userId;
        this.name = name;
        this.friends = friends.stream().collect(Collectors.toList());
    }
    
    public User(User user){
        this.userId = user.getUserId();
        this.name = user.getName();
        this.friends = user.getFriends();
    }
    
    /**
     * Construtor que cria um objeto User a partir de uma string.
     */
    public User(String[] info){
        /*
        ManipuladorFich mf = new ManipuladorFich();
        String[][] info = mf.parse(nomeFich);
        */
        try{
            addUser(info);
        }
        catch(UserNotValidException e){
            System.out.println("Ocorreu um erro! A criar novo User..");
            new User();
            System.out.println("Novo User criado!");
        }
    }

    public String getUserId(){
        return this.userId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public List<String> getFriends(){
        return this.friends;
    }
    
    public void setUserId(String userId){
        this.userId = userId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setFriends(List<String> friends){
        this.friends = friends.stream().collect(Collectors.toList());
    }
    
    /**
     * Método que constrói um objeto User, caso todos os campos sejam válidos.
     */
    public void addUser(String[] info) throws UserNotValidException{
        int i;
        if(info[0].length() == 22)
            this.userId = info[0];
        else throw new UserNotValidException(info[0]);
        
        if(info[1] != null)
            this.name = info[1];
        else throw new UserNotValidException(info[1]);
    }
    
    public static User parse(String info){
        String[] camposUser = info.split(";");
        return new User(camposUser[0],
                    camposUser[1],
                    Arrays.asList(camposUser[2].split(",")));
    }
    
    public User clone(){
        return new User(this);
    }
    
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null || ! obj.getClass().equals(this.getClass())) return false;
        User user = (User) obj;
        return  this.userId.equals(user.getUserId()) &&
            this.name.equals(user.getName()) &&
            this.friends.equals(user.getFriends());            
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserId: ").append(this.userId);
        sb.append("Name: ").append(this.name);
        String friendsString = "";
        for (String s : this.friends){
                friendsString += s + "\t";
        }
        sb.append("Friends: ").append(friendsString);
        return sb.toString();
    } 
}
