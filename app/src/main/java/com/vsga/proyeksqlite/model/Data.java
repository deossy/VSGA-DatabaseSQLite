package com.vsga.proyeksqlite.model;

public class Data {
    private String id, name, address;

    public Data(){

    }

    public Data(String id, String name, String address){

    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }
}
