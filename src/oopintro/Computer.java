package oopintro;

public class Computer {
    private String name;
    private int size;
    private String keyboardTypes;
    private int ramSize;
    private boolean power;

    public Computer(String name, int size, String keyboardTypes, int ramSize, boolean power){
        this.name = name;
        this.size  = size;
        this.keyboardTypes = keyboardTypes;
        this.ramSize = ramSize;
        this.power = power;
    }
    public Computer(){

    }

    public Computer(String name, int ramSize){
        this.name = name;
        this.ramSize = ramSize;

    }
    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public String getKeyboardTypes() {
        return keyboardTypes;
    }

    public void setKeyboardTypes(String keyboardTypes) {
        this.keyboardTypes = keyboardTypes;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public void playMusic(String track){
        System.out.println("Paying music " + track);
    }

    public void computerInfo(){
        System.out.println("Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Keyboard Types: " + keyboardTypes);

        if(power){
            System.out.println("System is on..");
        }
        else {
            System.out.println("System is off..");
        }
    }

    public int addNumber(int num1, int num2){
        int total = num1 + num2;
        return  total;
    }

    public boolean powerOn(){
        power = true;
        return  power;
    }

    public  boolean powerOff(){
        power = false;
        return  power;
    }
}
