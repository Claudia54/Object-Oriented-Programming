import java.util.Map;
import java.util.stream.Collectors;


public class Aluno {
    private String nome;
    private String codigo;
    Map<String,Aluno> alunos;
    
    public Aluno (){
        nome="";
        codigo="";

        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    }

    public Map<Object, Object> getAlunos() {
       /* return alunos
                .keySet()
                .stream()
                .collect(Collectors.toMap(k->k,k->alunos.get(k).clone()));
                */
                return alunos
                .values()
                .stream().map(Aluno::clone)
                .collect(Collectors.toMap(v->v.getNumero(),v->v.clone()));
            }

    public void setAlunos(Map<String, Aluno> alunos) {
        this.alunos = alunos
                   .entrySet()
                   .stream()
                   .collect(Collectors.toMap(k->k.getKey(),k-> getNome().clone()));
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}