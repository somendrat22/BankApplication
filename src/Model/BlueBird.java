package Model;

public class BlueBird extends Bird{


    public void fly(){
        System.out.println("Hey I am overridden method");
    }

    public void attack(int a, int b, int c){

    }
    public void attack(int a, int b){

    }
    public void attack(){
        System.out.println("I will attack from front");
    }
}
