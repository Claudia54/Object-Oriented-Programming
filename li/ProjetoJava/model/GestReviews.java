
/**
 * Write a description of class GestReviews here.
 *
 * @author grupo 64
 * @version 030621
 */
package model;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;

import model.Business.*;
import model.Reviews.*;
import model.Users.*;
import java.util.stream.*;


public class GestReviews{
     private BusinessList bus ;
     private ReviewList  rev ;
     private UserList user ;
    

  /*  public void guardaEstado(String nomeFich) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(nomeFich);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(this);
        
        fos.flush();
        fos.close();
    }
////// ESTATISTICA
O QUE FALTA :
1. Apresenta ao utilizador os dados referentes aos últimos ficheiros lidos,
designadamente, nome do ficheiro, número total de registos de reviews errados,
número total de negócios x, 
total de diferentes negócios avaliados (nº reviews > 0) x ,
total de não avaliados, ------------- na msm funçao de cima
número total de users e total dos que realizaram reviews,
total de users que nada avaliaram, total de users inativos (sem reviews) e total de
reviews com 0 impacto (0 valores no somatório de cool, funny ou useful).
2. Apresenta em ecrã ao utilizador os números gerais respeitantes aos dados actuais já
registados nas estruturas, designadamente:
a. Número total de reviews por mês;
b. Média de classificação de reviews por mês e o valor global (média global de
reviews);
c. Número de distintos utilizadores que avaliaram em cada mês (não interessa
quantas vezes avaliou).
*/

public int NTotaldeNegocios(){
    return bus.getList().size();
}
public int TotalDifNegoAvaliadosNaoavaliados(){
    Set<String> business = new TreeSet<String> (); //para garantir que sao dif 
      for (Review i : rev.getList()){
              business.add(i.getBusinessId());
          }
     return  business.size();
    }

































////////// CONSULTAS ITERATIVAS 
    /// querie 1 

public  SimpleEntry<Integer,Set<String>> query1(){
        Set<String> aux = new TreeSet<String>(); // para ficar já orenado
        for(Business i: bus.getList()){ // vou percorrer os business tds 
            String id = i.getBusinessId(); // 
             if ( !this.rev.getList().stream().anyMatch(l->l.getBusinessId().equals(id))){ // procura nas reviews o id 
                aux.add(id);  // 
                }
            }
            int tamanho = aux.size();
            return new SimpleEntry(tamanho,aux);
        }


public Map<String,Map<String,List<SimpleEntry<String,Integer>>>> query10() {
    int stars ; 
    int count=0;
    Map<String,Map<String,List<SimpleEntry<String,Integer>>>> ret = new HashMap <String,Map<String,List<SimpleEntry<String,Integer>>>>();
    SimpleEntry<String,Integer> med = new SimpleEntry<String,Integer> (null, null);
    HashMap<String,Set<String>>aux = new HashMap<String,Set<String>>();
    for(Business a : this.bus.getList()){
       if (aux.containsKey(a.getState())){
         if (!ret.get(a.getState()).containsKey(a.getCity())){
              ret.get(a.getState()).put(a.getState(), null);
         };
       }
       else {
           ret.put
       }
       aux2.addAll(a.getCity());
       aux.put(a.getState(), aux2);
       String id = a.getBusinessId();
       for ( Review review : rev.getList()){
        if (review.getBusinessId().equals(id)){
              stars =+ (int) review.getStars();
              count++;

          }

     
    }


    return aux;    
}



         //estado               //cidade                // id    // media  
//public Map<String,Map<String,List<SimpleEntry<String,Integer>>> func (int mes, int ano ){

    //}
    





}



