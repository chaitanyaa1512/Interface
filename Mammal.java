import java.util.*;
public class Mammal implements Animal, Bird{
     public void eat()
     {
     System.out.println("Mammal eats");
     }
     public void travel()
     {
     System.out.println("Mammal travels");
     }
     public void drink()
     {
     System.out.println("Mammal drinks");
     }
     public void fly()
     {
     System.out.println("Mammal flies");
     }
     public int legsNo()
     {
     return 0;
     }
     public static void main(String args[])
     { 
     Mammal m= new Mammal(); m.eat(); m.travel(); m.drink(); m.fly();
     }
}
     
      