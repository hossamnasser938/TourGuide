package com.example.android.tourguide;

/**
 * Created by Hosam on 4/11/2018.
 */

public class Place {

    private String name;
    private String address;
    private int telephone;
    private int imageResourceId;

    public Place(String name, String address, int telephone) {
        this.setName(name);
        this.setAddress(address);
        this.setTelephone(telephone);
    }

    public Place(String name, String address, int telephone, int imageResourceId) {
        this.setName(name);
        this.setAddress(address);
        this.setTelephone(telephone);
        this.setImageResourceId(imageResourceId);
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}