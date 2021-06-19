package model;

import model.*;
import view.View;

import java.util.List;
import java.util.ArrayList;

public class ReviewList {
    private List<Review> list ; 
 
    public ReviewList (){
        this.list = new ArrayList<>();
    }
 
    public List<Review> getList () {
        List<Review> nova =list;
     return nova;
    }
 
    public Review getLast(){
        Review e = list.get(list.size()-1);
        return e;
    }
 
    public Review getReview(int n){
     Review e = list.get(n);
     return e;
     }
 
     /*
    public Review criaReview(String nome ){
        Review newReview = new Review();
        nova.setReview(nome);
        this.list.add(nova);
        return nova;
    }
 */
    public void addReview(Review review){
        list.add(review);
     }
 
     public void consultarReview(int n) {
 
         Review e = list.get(n);
         e.toString();
     }
 
     public int size() {
         return list.size();
     }
 
     // so o nome de tds as Reviews 
     public void mostrarReviews(){
        View view = new View();
        StringBuilder sb = new StringBuilder();
        int aux = 0;
        for(Review review : list) {
            aux++;
            sb.append( aux + "-" + review.toString()).append("\n");
        }
        view.print(sb.toString());
 
     }
 
     // consulta a Review consoante o nome da msm 
     /*
     public Review verReview( String nome ) {
         View view = new View ();
         Review procura =null;
         try{
         for (Review review : list ){
           if (review.getName().equals(nome)){
              procura = review;
           }
         }
     }
         catch (InputMismatchException e) {
             view.notAnInstruction();
              }
        return procura;
 
     }
 */
 
     public Review getReview(String id) {
         Review procura =null;
         for ( Review review : list){
            if(review.getReviewId().equals(id)){
                procura = review;
            }
         }
         return procura;
     }

 }

