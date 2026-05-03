//package Creational.Builder;

class Phone{
    public String processorSpeed, screenSize, RAM, OS; 

    public void setProcessorSpeeed(String processorSpeed){
        this.processorSpeed = processorSpeed; 
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void show(){
        System.out.println("Processor Speed:" + processorSpeed + "ScreenSize: " + screenSize + "RAM: " + RAM + "OS: " + OS );
    }
}

interface phoneBuilder{
    public void buildProcessorSpeed(); 
    public void buildScreenSize(); 
    public void buildOS(); 
    public void buildRAM(); 
}



public class Main {
    
}
