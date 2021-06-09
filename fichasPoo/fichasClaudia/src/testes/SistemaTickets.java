public class SistemaTickets {
    private Map<String,Tecnico> funcionarios; // funcionarios da empresa 
    private List<Ticket> ticketsPorResolver; //tickets ainda n~ao tratados 
    private List<Ticket> ticketsResolvidos; //tickets j ́a satisfeitos
    
    public void adicionaTicket(Ticket t){
        this.tickectsPorResolver.add(t);
    }

}


