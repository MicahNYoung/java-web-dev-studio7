package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc, Storable {

    private static final double speed = 300;


    public CD(String name, double storageCapacity, ArrayList<String> contents, String discType) {
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void spinDisc() {
            System.out.println("ZZZzzzZZzzz *spin* zZZzzZZZZZzzzZZ *spin* TIMES " + speed) ;
    }

    @Override
    public void writingData() {
        System.out.println("Writing data");
    }

    @Override
    public void readingData() {
        System.out.println("Reading data");
    }

    @Override
    public void navigateMedia() {
        System.out.println("navigating media");
    }

    @Override
    public void storeData() {
        System.out.println("Storing data");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
