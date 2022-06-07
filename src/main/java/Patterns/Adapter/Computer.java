package Patterns.Adapter;

public class Computer {

    public void copyData(USB usb){
        usb.connect();
        System.out.println("Данные скопированы");
    }
}
