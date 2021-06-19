
/**
 * Write a description of class GestReviews here.
 *
 * @author grupo 64
 * @version 030621
 */
package model;

import java.io.*;
import java.lang.*;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;
import java.util.stream.*;

public class GestReviews
{
    public void guardaEstado(String nomeFich) throws FileNotFoundException, IOException{
        FileOutputStream fos = new FileOutputStream(nomeFich);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(this);
        
        fos.flush();
        fos.close();
    }
}
<<<<<<< HEAD
public int TotalDifNegoAvaliadosNaoavaliados(){
    Set<String> business = new TreeSet<String> (); //para garantir que sao dif 
      for (Review i : rev.getList()){
              business.add(i.getBusinessId());
          }
     return  business.size();
    }

////////// CONSULTAS ITERATIVAS 
    /* querie 1 */

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



     /* querie 2 */

 public SimpleEntry<Integer, Integer> query2 (int mes, int ano) throws DateTimeException{
    
    if ((mes < 1 && mes > 12 || ano > 2021) || ano==2021 && mes>6) throw new DateTimeException("Data inserida nao e valida"); //ate a data atual 
    else{
        int qt=0;
        Set <String> user = new TreeSet();
        for (Review review : rev.getList()){
        if (review.getDate().getMonth().equals(mes) ){
            if(review.getDate().getYear() == ano){
                qt++;
                user.add(review.getUserId());
            }
        }
    }
     user.size();      
     return new SimpleEntry (qt,user);
    }
}



/* querie 4 */ 
//Dado o código de um negócio, determinar, mês a mês, quantas vezes foi avaliado,
//por quantos users diferentes e a média de classificação;
public Map<Integer, List<Integer>> query4 (String businessId){
    Map<Integer,List<Integer>>map = new HashMap<>();
   for (int mes=1;mes<=12 ;mes++){
        int quantidade =0;
        int media;
        int stars=0;
        List <Integer> lista2=new ArrayList<>();
        Set <String>lista = new TreeSet<>();
        for( Review r : rev. getList()){
            if (r.getBusinessId().equals(businessId)){
                if (r.getDate().getMonth().equals(mes-1) ){ // retorna o mes de 0 a 11
                    quantidade++;
                    lista.add(r.getUserId());
                    stars += r.getStars();
        }
    }
}
    int valor =lista.size();
    lista2.add(quantidade);
    lista2.add(valor);
    media= stars/quantidade;
    lista2.add(media);
    map.put(mes,lista2);
}
    return map;
}

/*querie 5 

Dado o código de um utilizador determinar a lista de nomes de negócios que mais
avaliou (e quantos), ordenada por ordem decrescente de quantidade e, para
quantidades iguais, por ordem alfabética dos negócios;*/

public List<String> encontraNegocio()



public List<SimpleEntry<String, Integer>> query5(String userId){
    List <Review> lista = this.rev.reviewsPorUser().get(userId);
    List<SimpleEntry<String, Integer>> resultado = new ArrayList <>();
    
    if(lista != null){
        for(Review r: lista){
            for (Business i: bus.getList() ){
                if ( i.getName().equals(userId))
                 String nome = 
            
            


            if(!resultado.stream().anyMatch(s->s.getKey().equals(nome))){
                int count = (int) lista.stream().filter(s->s.getBusinessId().equals(r.getBusinessId())).count();
                resultado.add(new SimpleEntry<String,Integer>(nome,count));
            }            
        }
        
        sort(resultados.values(),Collections.reverseOrder());;
        return resultado;
    }
    else return null;
}

















  /*querie 10*/
  //List<Business> valores = new ArrayList<Business>();

public Map<String,Map<String,List<SimpleEntry<String,Integer>>>> query10() {
    Map<String,Map<String,List<SimpleEntry<String,Integer>>>> ret = new HashMap <String,Map<String,List<SimpleEntry<String,Integer>>>>();
    for(Business aux : this.bus.getList()){ 
        ret.putIfAbsent(aux.getState(),null);//// ver se tem o estado 
        ret.get(aux.getState()).putIfAbsent(aux.getCity(), null); // ver se tem a cidade senao tiver acrescenta       
        String id = aux.getBusinessId();
        int media=(int) this.rev.getList().stream().filter(l->l.getBusinessId().equals(id)).
                map(l->l.getStars()).collect(Collectors.toList())).average();
        ret.get(aux.getState()).get(aux.getCity()).add( new SimpleEntry(id,media));
    
       }
       return ret;
    }




}




=======
>>>>>>> parent of 8a4a146...  ...
