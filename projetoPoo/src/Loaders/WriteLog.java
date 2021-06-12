package Loaders ;

import model.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

public class WriteLog {

    private EquipaList equipalist ;
    private JogoList jogoList ;



    public void criarFicheiro() throws IOException{
        FileWriter arq = new FileWriter("log.txt");
        PrintWriter gravarqv = new PrintWriter(arq);
        StringBuilder sb = new StringBuilder();
      
        for (Equipa i : equipalist.getList()){
        gravarqv.printf("Equipa : " + i.getEquipa() +"\n");
        for (Map.Entry<Integer, Jogador> jog : i.getJogadores().entrySet()){
            if( jog.getValue() instanceof GuardaRedes){
                sb.append("Guarda-Redes: " + jog.getValue().getNome() + "," +jog.getKey()+"," + jog.getValue());
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia() );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao());
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate());
                sb.append (jog.getValue().getCapDePasse() + "," +((GuardaRedes) jog.getValue()).getElasticidade()); ////////////????????
                }
            if( jog.getValue() instanceof Atacante){
                sb.append("Avançado: " + jog.getValue().getNome() + "," +jog.getKey()+"," + jog.getValue());
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia() );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao());
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate());
                sb.append (jog.getValue().getCapDePasse() ); 
                }
            if( jog.getValue() instanceof Defesa){
                sb.append("Avançado: " + jog.getValue().getNome() + "," +jog.getKey()+"," + jog.getValue());
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia() );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao());
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate());
                sb.append (jog.getValue().getCapDePasse() ); 
                }
            if( jog.getValue() instanceof Lateral){
                sb.append("Lateral: " + jog.getValue().getNome() + "," +jog.getKey()+"," + jog.getValue());
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia() );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao());
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate());
                sb.append (jog.getValue().getCapDePasse() + "," +((Lateral) jog.getValue()).getHabilidaDeCruz());
                }
            if( jog.getValue() instanceof Medio){
                sb.append("Medio: " + jog.getValue().getNome() + "," +jog.getKey()+"," + jog.getValue());
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia() );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao());
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate());
                sb.append (jog.getValue().getCapDePasse() + "," + ((Medio) jog.getValue()).getRecBola()) ;
                }
            }
    
}
          for (Jogo i : jogoList.getListjog ()){

                sb.append("Jogo:" );
                sb.append(i.getEquipaCasa().getNome());
                sb.append(i.getEquipaFora().getNome());
                sb.append(i.getEquipaCasa().getScore()).append(",") ;
                sb.append(i.getEquipaFora().getScore()).append(",");
                sb.append(i.getTime()).append(",");
                sb.append(i.getEquipaCasa().getJogEmCampo()).append(",");
                sb.append(i.getSubstituicoesCasa()).append(",");
                sb.append( i.getEquipaFora().getJogEmCampo()).append(",");
                sb.append(i.getSubstituicoesFora()).append(",");
          }

           gravarqv.printf(sb.toString());
           arq.close();

                   

          
    }
          
}
