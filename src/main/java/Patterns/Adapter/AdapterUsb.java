package Patterns.Adapter;

public class AdapterUsb implements USB{

    private final MemoryCard memoryCard;

    public AdapterUsb(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    public void connect(){
        System.out.println("Карта памяти вставлена");
    }
}
