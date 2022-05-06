package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private double storageCapacity;
    private ArrayList<String> contents = new ArrayList<>();
    private String discType;

    public BaseDisc(String name, double storageCapacity, ArrayList<String> contents, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
    }

    private void reportInfo(){
        System.out.println(this.name);
        System.out.println(this.storageCapacity);
        System.out.println(this.contents);
        System.out.println(this.discType);
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public void setContents(ArrayList<String> contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
