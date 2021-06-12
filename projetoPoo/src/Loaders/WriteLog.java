package Loaders ;

import model.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;

public class WriteLog {

    private EquipaList equipalist ;
    private JogoList jogoList ;

    public WriteLog(EquipaList equipa, JogoList jogo){
        this.equipalist = equipa;
        this.jogoList = jogo;
    }

    public void criarFicheiro() throws IOException{
        FileWriter arq = new FileWriter("log.txt");
        PrintWriter gravarqv = new PrintWriter(arq);
        StringBuilder sb = new StringBuilder();
      
        for (Equipa i : equipalist.getList()){
        sb.append("Equipa:" + i.getEquipa() +"\n");
        for (Map.Entry<Integer, Jogador> jog : i.getJogadores().entrySet()){
            if( jog.getValue() instanceof GuardaRedes){
                sb.append("Guarda-Redes:" + jog.getValue().getNome() + "," +jog.getKey()+",");
                sb.append (jog.getValue().getVelocidade()+ "," + jog.getValue().getResistencia() + ",");
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao()+ ",");
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate()+ ",");
                sb.append (jog.getValue().getCapDePasse() + "," +((GuardaRedes) jog.getValue()).getElasticidade());
                sb.append("\n"); ////////////????????
                }
            if( jog.getValue() instanceof Atacante){
                sb.append("Avançado:" + jog.getValue().getNome() + "," +jog.getKey()+",");
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia()+ "," );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao()+ ",");
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate()+ ",");
                sb.append (jog.getValue().getCapDePasse() ); 
                sb.append("\n");
                }
            if( jog.getValue() instanceof Defesa){
                sb.append("Defesa:" + jog.getValue().getNome() + "," +jog.getKey()+",");
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia()+ "," );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao()+ ",");
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate()+ ",");
                sb.append (jog.getValue().getCapDePasse() ); 
                sb.append("\n");
                }
            if( jog.getValue() instanceof Lateral){
                sb.append("Lateral:" + jog.getValue().getNome() + "," +jog.getKey()+",");
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia()+ "," );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao()+ ",");
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate()+ ",");
                sb.append (jog.getValue().getCapDePasse() + "," +((Lateral) jog.getValue()).getHabilidaDeCruz());
                sb.append("\n");
                }
            if( jog.getValue() instanceof Medio){
                sb.append("Medio:" + jog.getValue().getNome() + "," +jog.getKey()+",");
                sb.append (jog.getValue().getVelocidade()+"," + jog.getValue().getResistencia()+ "," );
                sb.append(jog.getValue().getDestreza() +"," + jog.getValue().getImpulsao()+ ",");
                sb.append(jog.getValue().getJogoDeCabeca()+"," +jog.getValue().getRemate()+ ",");
                sb.append (jog.getValue().getCapDePasse() + "," + ((Medio) jog.getValue()).getRecBola()) ;
                sb.append("\n");
                }
            }
    
}
          for (Jogo i : jogoList.getListjog ()){
                sb.append("Jogo:" );
                sb.append(i.getEquipaCasa().getNome()).append(",");
                sb.append(i.getEquipaFora().getNome()).append(",");
                sb.append(i.getEquipaCasa().getScore()).append(",") ;
                sb.append(i.getEquipaFora().getScore()).append(",");
                sb.append(i.getTime()).append(",");
                for ( Jogador jogador : i.getEquipaCasa().getJogEmCampo()){
                    sb.append(jogador.getCamisola());
                }
                for ( SimpleEntry<Integer,Integer> auxiliar : i.getSubstituicoesCasa()){ ///////???????????
                     sb.append(auxiliar.getKey()).append("->").append(auxiliar.getValue());
                }
                for (Jogador auxi : i.getEquipaFora().getJogEmCampo()){
                    sb.append(auxi.getCamisola());
                }
                for ( SimpleEntry<Integer,Integer> auxiliar : i.getSubstituicoesFora()){ ///////???????????
                    sb.append(auxiliar.getKey()).append("->").append(auxiliar.getValue());
               }
                sb.append("\n");
          }

           gravarqv.printf(sb.toString());
           arq.close();

                   

          
    }
          
}
