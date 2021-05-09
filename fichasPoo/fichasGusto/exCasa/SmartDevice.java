public class SmartDevice {

    private String id;
    private Boolean on; 
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public SmartDevice() {
        this.id = "n/a";
        this.on = false; 
    }

    public SmartDevice(String id, Boolean on) {
        this.id = id;
        this.on = on;
    }

    public SmartDevice(SmartDevice device) {
        this.id = device.getId();
        this.on = device.getOn();
    }    

    public String toString() {
        final StringBuffer sb = new StringBuffer("Device [");
        sb.append("\tId = ").append(this.id.toString()).append(", ");
        sb.append("\tOn = ").append(this.on.toString()).append("]\n");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        SmartDevice device = (SmartDevice) obj;
        return  this.id.equals(device.getId()) &&
                this.on.equals(device.getEstado());
    }

    public SmartDevice clone() {
        return new SmartDevice(this);
    }
}