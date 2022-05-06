package org.launchcode.studio7;

import java.util.ArrayList;

public class VinylRecords extends BaseDisc implements Storable {

    public VinylRecords(String name, double storageCapacity, ArrayList<String> contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void storeData() {
        System.out.println("Storing data");
    }
}
