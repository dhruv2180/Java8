interface Fly {

    /*
        In Java 7 , You cannot implement method within the interface
        --> Default methods get inherited automatically
        --> Can be over written in extending interface
     */
    default public void takeOff() {
        System.out.println("Fly :: takeOff");
    }

    default public void turn() {
        System.out.println("Fly :: turn");
    }

    default public void cruise() {
        System.out.println("Fly :: cruise");
    }

    default public void land() {
        System.out.println("Fly :: land");
    }

}

interface FastFly extends Fly{

    @Override
    default void takeOff() {
        System.out.println("FastFly :: takeOff");
    }
}

class Vehicle {

    public void land(){
        System.out.println("Vehicle :: land");
    }
}

interface Sail{
    default public void cruise() {
        System.out.println("Sail :: cruise");
    }
}

class SeaPlane extends Vehicle implements FastFly,Sail{

    /*
        if Collision between methods of interfaces user super,
        like super here implemented in Sail as well as Fly
        Super informs that method is default
     */
    public void cruise() {
       FastFly.super.cruise();
    }


}

public class DefaultMethods {

    public static void use(){
        SeaPlane seaPlane=new SeaPlane();

        //Calls the method in FastFly since its the nearest implementation
        seaPlane.takeOff();

        //Calls the one in Fly
        seaPlane.turn();

        //will call the one in Vehicle, since Class heirarchy rules
        seaPlane.land();

        /*
        if Collision between methods of interfaces user super
         */

    }
    public static void main(String[] args) {

        use();
    }
}
