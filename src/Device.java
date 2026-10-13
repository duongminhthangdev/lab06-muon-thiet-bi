import java.math.BigDecimal;
import java.time.Year;

public abstract class Device {
    protected String id ;
    protected String ten;
    protected BigDecimal gia;
    protected int namPhucvu;

    public enum Status
    {
        Available,
        Borrowed,
        UnderMaintenance

    }
    private Status status;
    public Device(String id, String ten, BigDecimal gia, int namPhucvu, Status status) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã thiết bị không được để rỗng.");
        }
        if (gia == null || gia.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Giá phải lớn hơn hoặc bằng 0."); // Đã thêm dấu ;
        }
        int currentYear = Year.now().getValue();
        if (namPhucvu > currentYear) {
            throw new IllegalArgumentException("Năm đưa vào sử dụng (" + namPhucvu + ") không được lớn hơn năm hiện tại (" + currentYear + ").");
        }
        this.id = id;
        setTen(ten);
        this.gia = gia;
        this.namPhucvu = namPhucvu;
        setStatus(status);
    }



    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getGia() {
        return gia;
    }


    public int getNamPhucvu() {
        return namPhucvu;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", ten='" + ten + '\'' +
                ", gia=" + gia +
                ", namPhucvu=" + namPhucvu +
                ", status=" + status +
                '}';
    }

    public abstract BigDecimal chiphiBaotri();

}