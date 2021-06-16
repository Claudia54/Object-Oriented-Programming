/**
 * Escreva a descrição da classe Business aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

package model;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Business
{
    private String businessId;
    private String name;
    private String city;
    private String state;
    private List<String> categories;
    
    public Business(){
        this.businessId = "";
        this.name = "";
        this.city = "";
        this.state = "";
        this.categories = new ArrayList<String>();
    }
    
    public Business(String businessId, String name, String city, String state, List<String> categories){
        this.businessId = businessId;
        this.name = name;
        this.city = city;
        this.state = state;
        this.categories = categories.stream().collect(Collectors.toList());
    }
    
    public Business(Business bus){
        this.businessId = bus.getBusinessId();
        this.name = bus.getName();
        this.city = bus.getCity();
        this.state = bus.getState();
        this.categories = bus.getCategories();
    }
    
    public Business(String[] info){
        /*
        ManipuladorFich mf = new ManipuladorFich();
        String[][] info = mf.parse(nomeFich);
        */
        try{
            addBusiness(info);
        }
        catch(BusinessNotValidException e){
            System.out.println("Ocorreu um erro! A criar novo Business..");
            new Business();
            System.out.println("Novo Business criado!");
        }
    }
    
    public String getBusinessId(){
        return this.businessId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getCity(){
        return this.city;
    }
    
    public String getState(){
        return this.state;
    }
    
    public List<String> getCategories(){
        return this.categories;
    }
    
    public void setBusinessId(String businessId){
        this.businessId = businessId;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCity(String city){
        this.city = city;
    }
    
    public void setState(String state){
        this.state = state;
    }
    
    public void setCategories(List<String> categories){
        this.categories = categories.stream().collect(Collectors.toList());
    }
    
    /**
     * Método que constrói um objeto Business, caso todos os campos sejam válidos.
     */
    public void addBusiness(String[] info) throws BusinessNotValidException{
        int i;
        if(info[0].length() == 22)
            this.businessId = info[0];
        else throw new BusinessNotValidException(info[0]);
        
        if(info[1] != null)
            this.name = info[1];
        else throw new BusinessNotValidException(info[1]);
        
        if(info[2] != null)
            this.city = info[2];
        else throw new BusinessNotValidException(info[2]);
        
        if(info[3].length() == 2)
            this.state = info[3];
        else throw new BusinessNotValidException(info[3]);
        
        if(info[4] != null){
            String[] aux = info[4].split(",");
            this.categories = new ArrayList<>();
            for(String s: aux)
                this.categories.add(s);
        }
        else throw new BusinessNotValidException(info[4]);
    }
    
    public static Business parse(String info){
        String[] camposBus = info.split(";");
        
        return new Business(camposBus[0],
                        camposBus[1],
                        camposBus[2],
                        camposBus[3],
                        Arrays.asList(camposBus[4].split(",")));
    }
    
    public Business clone(){
        return new Business(this);
    }    
    
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null || ! obj.getClass().equals(this.getClass())) return false;
        Business bus = (Business) obj;
        return  this.businessId.equals(bus.getBusinessId()) &&
            this.name.equals(bus.getName())&&
            this.city.equals(bus.getCity()) &&
            this.state.equals(bus.getState()) &&
            this.categories.equals(bus.getCategories());
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Business ");
        sb.append("[ BusinessId: ").append(this.businessId);
        sb.append("; Name: ").append(this.name);
        sb.append("; City: ").append(this.city);
        sb.append("; State: ").append(this.state);
        sb.append("; Categories: ").append(this.state);
        
        for (String s : this.categories){
                sb.append(s).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }            
}
