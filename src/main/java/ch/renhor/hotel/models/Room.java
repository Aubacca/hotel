package ch.renhor.hotel.models;

public class Room {
    private String roomId;
    private int numberOfPersons;
    private String remark;
    private Section section;
    private boolean available = true;

    public Room() {
    }

    public Room(String roomId, int numberOfPersons, Section section) {
        this.roomId = roomId;
        this.numberOfPersons = numberOfPersons;
        this.section = section;
        this.available = true;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", numberOfPersons=" + numberOfPersons +
                ", remark='" + remark + '\'' +
                ", section=" + section +
                ", available=" + available +
                '}';
    }
}
