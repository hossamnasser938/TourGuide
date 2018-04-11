package com.example.android.tourguide;

/**
 * Created by Hosam on 4/11/2018.
 */

public class Place {

    private String name;
    private String address;
    private String telephone;
    private int imageResourceId;

    public Place(String name, String address, String telephone) {
        this.setName(name);
        this.setAddress(address);
        this.setTelephone(telephone);
    }

    public Place(String name, String address, String telephone, int imageResourceId) {
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}