package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        ArrayList<String> evilEmpire = new ArrayList<>();
        evilEmpire.add("Bulls on Parade");
        evilEmpire.add("Down rodeo");
        CD evilEmpireCD = new CD("Evil Empire", 100, evilEmpire, "CD");
        ArrayList<String> memento = new ArrayList<>();
        memento.add("Intro Screen");
        memento.add("Main Movie");
        memento.add("Deleted Scenes");
        DVD mementoDVD = new DVD("Memento", 1000, memento, "DVD");

        evilEmpireCD.navigateMedia();
        mementoDVD.navigateMedia();

        evilEmpireCD.spinDisc();
        mementoDVD.spinDisc();

        System.out.println(evilEmpireCD.getName());
        System.out.println(mementoDVD.getName());



        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
