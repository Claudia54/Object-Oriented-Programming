public class SmartBulb extends SmartDevice{
    
    private Tonalidade tone;
    //private double powerNormal;
    //private double powerEco;

    public SmartBulb() {
        super();
        this.tone = tone.NEUTRAL;
    }

    public SmartBulb(String Id){
        super(Id);
        this.tone = tone.NEUTRAL;
    }

    public SmartBulb(Tonalidade tone) {
        super();
        this.tone = tone;
    }

    public SmartBulb(String Id, Tonalidade tone){
        super(Id);
        this.tone = tone.NEUTRAL;
    }

    public SmartBulb(SmartBulb lampada) {
        super(lampada);
        this.tone = lampada.getTone();
    }

    public tone getTone() {
        return this.tone;
    }

    public void setTone(Tonalidade tone) {
        this.tone = tone;
    }

    public void lampWARM() {
        this.tone = tone.WARM;
    }

    public void lampCOLD() {
        this.tone = tone.COLD;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Lâmpada [");
        sb.append("\tTonalidade = ").append(this.tone.toString()).append("]\n");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SmartBulb lampada = (SmartBulb) obj;
        return this.tone.equals(lampada.getState()) &&
                Double.compare(lampada.getPowerNormal(), this.powerNormal) == 0 &&
                Double.compare(lampada.getPowerEco(), this.powerEco) == 0;
    }

    public SmartBulb clone() {
        return new SmartBulb(this);
    }
}