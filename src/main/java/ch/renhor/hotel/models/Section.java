package ch.renhor.hotel.models;

public class Section {
    private String name;
    private String remark;
    private Hotel hotel;

    public Section() {
    }

    public Section(String name, Hotel hotel) {
        this.name = name;
        this.hotel = hotel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", hotel=" + hotel +
                '}';
    }
}
