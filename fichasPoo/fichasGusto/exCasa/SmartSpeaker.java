public class SmartSpeaker extends SmartDevice{
    
    private int volume;
    private String channel;
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public SmartSpeaker() {
        super();
        this.volume = 0;
        this.channel = "n/a";
    }

    public SmartSpeaker(String id, int volume, String channel) {
        super(id);
        this.volume = volume;
        this.channel = channel;
    }

    public SmartSpeaker(SmartSpeaker speaker) {
        super(speaker.getId(),speaker.getOn());
        this.volume = speaker.getVolume();
        this.channel = speaker.getChannel();
    }

    public volumeUp(){
        this.setVolume(this.getVolume()+1);
    }

    public volumeDown(){
        this.setVolume(this.getVolume()-1);
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer("Speaker [");
        sb.append("\tVolume = ").append(this.volume).append(", ");
        sb.append("\tChannel = ").append(this.channel.toString()).append("]\n");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SmartSpeaker speaker = (SmartSpeaker) obj;
        return this.channel.equals(speaker.getChannel()) &&
                this.volume == speaker.getVolume();            
    }

    public SmartSpeaker clone() {
        return new SmartSpeaker(this);
    }
}