import java.util.List;
import java.math.BigDecimal;

public class ClassRoom {
    private String id;
    private String ten;
    private int sucChua;
    private List<Device> devices;

    public ClassRoom(String id, String ten, int sucChua, List<Device> devices) {
        this.id = id;
        this.ten = ten;
        this.sucChua = sucChua;
        this.devices = devices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public List<Device> getDevices() {
        return devices;
    }

    public void setDevices(List<Device> devices) {
        this.devices = devices;
    }

    public void addDevice(Device device) {
        if (device == null) {
            throw new IllegalArgumentException("Thiết bị không hợp lệ.");
        }
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getId().equals(device.getId())) {
                System.out.println("Mã thiết bị " + device.getId()
                        + " đã có trong phòng!");
                return;
            }
        }
        devices.add(device);
    }
    boolean RemoveDevice(String id){
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i).getId().equals(id)) {
                devices.remove(i);
                return true;
            }
        }
        return false;
    }
    public Device FindDevice(String id) {
        for (Device device : devices) {
            if (device.getId().equals(id)) {
                return device;
            }
        }
        return null;
    }
    public BigDecimal calculateAnnualMaintenanceCost() {
        return BigDecimal.ZERO;
    }

    public List<Device> getDevicesRequiringMaintenance() {

        return devices;
    }
}
