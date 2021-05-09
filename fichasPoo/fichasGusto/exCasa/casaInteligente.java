import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class casaInteligente {
    private String morada;
    private List<SmartDevice> devices;
    private Map <String, List<SmartDevice>> rooms;

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Map<String, List<SmartDevice>> getDevices() {
        return devices;
    }

    public void setDevices(Map<String, List<SmartDevice>> devices) {
        this.devices = devices;
    }

    public casaInteligente() {
        this.morada = "n/a";
        this.devices = new ArrayList<SmartDevice>();
        this.room = new HashMap <String, List<SmartDevice>> ();
    }

    public casaInteligente(String morada) {
        this.morada = morada;
        this.devices = new ArrayList<SmartDevice>();
        this.room = new HashMap <String, List<SmartDevice>> ();
    }


    public boolean existsDevice(String id){
        return this.devices.contains(new SmartDevice (id));
    }

    public void addDevice(SmartDevice device){
        
        Boolean flag = this.devices.contains(device);
        if (flag == false) this.devices.add(device.clone());
    }
/////
    public SmartDevice getDevice (String id){
        for (SmartDevice d: devices){
            if (d.getID().equals(id)){
                return d;
            }
        }
        return null;
    }


    public void setAllOn(boolean bool){
        for (SmartDevice d: this.devices){
            d.setOn(on);
        }
    }

    public void addRoom (String room){
        ArrayList arr = new ArrayList<SmartDevice>();
        this.rooms.putIfAbsent(room, arr);
    }


    public boolean hasRoom(String room){
        return this.rooms.containsKey(room);
    }

    public void addToRoom(String room, String id){

        SmartDevice device = new SmartDevice (id);
        this.rooms.get(r).addDevice(device);
    }

    public boolean roomHasDevice (String room, String id){
        boolean flag = false;

        ArrayList<SmartDevice> list = map.get(room);
        
        for (SmartDevice device : list) {
            if (device.getID().equals(id)) {
                flag = true;
                break;
            }
        }
        
        return flag;
    }

}