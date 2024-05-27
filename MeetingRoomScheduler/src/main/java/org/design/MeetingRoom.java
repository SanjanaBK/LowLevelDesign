package org.design;
// Meeting room should ideally be a pojo
//
public class MeetingRoom {
    int id;
    Location l;
    int capacity;

    public MeetingRoom(int id, Location l, int capacity) {
        this.id = id;
        this.l = l;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getL() {
        return l;
    }

    public void setL(Location l) {
        this.l = l;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
