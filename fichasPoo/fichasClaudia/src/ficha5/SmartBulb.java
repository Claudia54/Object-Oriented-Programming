
public class SmartBulb extends Smartdevice {
    public static final int WARM=2;
    public static final int NEUTRAL =1;
    public static final int COLD =0;

    private int tone;

    public SmartBulb(){
        super();
        this.tone =NEUTRAL;
    }
}