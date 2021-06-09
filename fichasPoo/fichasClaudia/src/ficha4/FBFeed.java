import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.time.LocalDateTime;

public class FBFeed {
    private ArrayList<FBPost> list;
    
public FBFeed (){
    this.list= new ArrayList<>();
}
public FBFeed(List<FBPost> posts) {
    setPosts(posts);
}

public FBFeed(FBFeed feed) {
    setPosts(feed.getPosts());
}
public List<FBPost> getPosts() {
    return this.posts.stream()
            .map(FBPost::clone)
            .collect(Collectors.toList());
}

public void setPosts(List<FBPost> posts) {
    this.posts = posts.stream()
            .map(FBPost::clone)
            .collect(Collectors.toCollection(ArrayList::new));
}

public void addPost(FBPost post) {
    this.posts.add(post);
}
public int nrPosts(String user){
    //return this.list.stream().filter(l->l.getNomecriador().equals(user).count());
    return this.list.postsOf(user).size();
   }
   public List<FBPost> postsOf(String user){
       return this.list.stream().filter(l->l.getNomecriador().equals(user).collect(Collectors.toList())); 
   }
   public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim){
       return this.list.stream().filter(l->l.postsOf(user) &&
                                 list.getInstante().CompareTo(inicio)>0 && 
                                 list.getInstante().CompareTo(fim)<0).collect(Collectors.toList());
   }
   public FBPost getPost(int id){
       for (FBPost post : this.post)
           if(this.post.getId()==id)
             return post;
       return null;
   }
   public void comment(FBPost post, String comentario){
       post.getComments().add(comentario);
   }
   public void comment(int postid, String comentario){
       getPost(postid).getComments().add(comentario); //testar
   }
   public void like(int postid) {
    like(getPost(postid));
}
   public List<Integer> top5CommentsExt(){
       ArrayList<FBPost> copy = new ArrayList<>(this.posts);
       List<Integer> top5 = new ArrayList<>();
     for(int i =0;i<5;i++){
        FBPost mostComment=null;
       for(FBPost post:copy){
           if(mostComment==null || mostComment.getComments().size()<post.getComments().size())
              mostComment=post;
       top5.add(mostCommented.getId());
       copy.remove(mostCommented); 

           }
           return top5;
       }

    
   }
   public List<Integer> top5CommentsInt(){
       return this.list.stream()
                       .sorted((Comparator<FBPost>) (p1,p2)-> p2.getComments().size()-p1.getComments().size())
                       .limit(5)
                       .map(FBPost::getId)
                       .collect(Collectors.toList());
}

public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    FBFeed fbFeed = (FBFeed) o;
    return this.list.equals(fbFeed.posts);
}

public String toString() {
    final StringBuffer sb = new StringBuffer("FBFeed {\n");
    sb.append(list).append('\n');
    sb.append("\n}");
    return sb.toString();
}

public FBFeed clone() {
    return new FBFeed(this);
}
}