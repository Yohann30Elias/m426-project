package ch.bbw.ff.room;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "room")
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int room_id;
    private String name;
    private String address;
    private String city;
    private int nr_of_seats;

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNr_of_seats() {
        return nr_of_seats;
    }

    public void setNr_of_seats(int nr_of_seats) {
        this.nr_of_seats = nr_of_seats;
    }
}
