import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.org.joda.time;

public class Youtube {
    private String nome_video;
    private String conteudo;
    private LocalDate data;
    private int resolucao;
    private int duracao;
    private  ArrayList<Comments> comments;
    private int likes;
    private int dislikes;

   public Youtube(){
       this.nome_video ="";
       this.conteudo   ="";
       this.data       =LocalDate.now();
       this.resolucao  =0;
       this.duracao    =0;
       this.comments   =new ArrayList<>();
       this.likes      =0;
       this.dislikes   =0;
   }
   public Youtube(String nome_video, String conteudo, String data, int resolucao, int duracao, ArrayList<Comments> comments,
   int likes, int dislikes) {
    this.nome_video = nome_video;
    this.conteudo   = conteudo;
    this.data       = data;
    this.resolucao  = resolucao;
    this.duracao    = duracao;
    this.comments   = comments;
    this.likes      = likes;
    this.dislikes   = dislikes;
}

   public Youtube (Youtube video){
    this.nome_video  = video.getNome_video();
    this.conteudo    = video.getConteudo();
    this.data        = video.getData();
    this.resolucao   = video.getResolucao();
    this.duracao     = video.getDuracao();
    this.comments    = video.getComments();
    this.likes       = video.getLikes();
    this.dislikes    = video.getDislikes();
   } 

    public String getNome_video() {
        return nome_video;
    }

    public void setNome_video(String nome_video) {
        this.nome_video = nome_video;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Comments> getComments() {
        return comments;
    }

    public void setComments (ArrayList<Comments> comments) {
        this.comments = comments;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "Youtube [comments=" + comments + ", conteudo=" + conteudo + ", data=" + data + ", dislikes=" + dislikes
                + ", duracao=" + duracao + ", likes=" + likes + ", nome_video=" + nome_video + ", resolucao="
                + resolucao + "]";
    }

    public Youtube clone(){
        return new Youtube(this);
    }
    ////////////////////////////////

    public void insereComentario(String comentario){
        this.comments.add(comentario);
    }
    public long qtsDiasDepois() {
       LocalDate now =LocalDate.now();
       Period period =new Period(now,getData());
       period.getMonths();
    }

    public void thumbsUp(){
        likes++;
    }
}
