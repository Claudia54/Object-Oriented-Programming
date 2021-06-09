import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class FBPost{
    private int id;
    private String nomecriador;
    private LocalDateTime instante;
    private String conteudo;
    private int num_likes;
    private ArrayList<String> comments;
   
    public FBPost (){
        this.id=0;
        this.nomecriador="";
        this.instante= LocalDateTime.now();
        this.conteudo="";
        this.num_likes=0;
        this.comments= new ArrayList<>();
    }
    public FBPost(int id, String nomecriador, LocalDateTime instante, String conteudo, int num_likes, ArrayList<String> comments){
        this.id          = id;
        this.nomecriador = nomecriador;
        this.instante    = instante;
        this.conteudo    = conteudo;
        this.num_likes   = num_likes;
        this.comments    = comments;
    }
    public FBPost (FBPost fbpost){
       this.id=fbpost.getId();
       this.nomecriador=fbpost.getNomecriador();
       this.instante=fbpost.getInstante();
       this.conteudo=fbpost.getConteudo();
       this.num_likes=fbpost.getNum_likes();
       this.comments=fbpost.getComments();
    }
        
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomecriador() {
        return nomecriador;
    }
    public void setNomecriador(String nomecriador) {
        this.nomecriador = nomecriador;
    }
    public LocalDateTime getInstante() {
        return instante;
    }
    public void setInstante(LocalDateTime instante) {
        this.instante = instante;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public int getNum_likes() {
        return num_likes;
    }
    public void setNum_likes(int num_likes) {
        this.num_likes = num_likes;
    }
    public ArrayList<String> getComments() {
        return comments;
    }
    public void setComments(ArrayList<String> comments) {
        this.comments = comments;
    }

    public FBPost clone(){
        return new FBPost(this);
    }

    }




