package Model;

public class Car {
    int wheels;
    int seats;
    String name;

    public Car(){
        System.out.println("Hii I am Car Class Constructor !!");
    }


    public Car(String name){
        this.name = name;
        this.wheels = 4;
        this.seats = 5;
    }


    public Car(String name, int seats){
        this.name = name;
        this.seats = seats;
    }
    public void runCar(){
        System.out.println( name + " is running !!");
    }

    public void playMusic(){
        System.out.println(name + "is playing music");
    }
}
