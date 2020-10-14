package org.constructors.thisconstructor;

import javax.swing.plaf.basic.BasicEditorPaneUI;

public class BedRoomMain {
    public static void main(String[] args) {
        BedRoom b1 = new BedRoom();

        System.out.println("The values of the fields before the parameterised constructor " +
                "invocation : "+b1.getRoomName()+ " "+ b1.getBulbs()+" "+b1.getRooms()
        +" "+b1.isSame());

        BedRoom bedRoom= new BedRoom(4,4,"NewRoom");
        
        System.out.println("The values of the fields after the parameterised constructor " +
                "invocation : "+bedRoom.getRoomName()+ " "+ bedRoom.getBulbs()+" "+bedRoom.getRooms()
                +" "+bedRoom.isSame());
    }
}
