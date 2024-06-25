package oops4;

public class Interface {
    public static void main(String[] args) {
        //Interface
        // An Interface is a fully abstract class It includes a group of abstract methods

        Boy rahul = new Boy();
        rahul.talk();
        rahul.walk();
        rahul.speciesName();

        Girl radhika = new Girl();
        radhika.talk();
        radhika.walk();

        square shape = new square();
        shape.length(12);
        shape.joints(4);

    }
}

// interface
 interface Human {
   // public abstract void walking ();
     //By default pubic and abstract
     void walk();
     void talk();

     // we can also create default methods

    default void speciesName(){
        System.out.println("Species : Homo Sapiens");
    }

 }

 class Boy implements Human{

     @Override
     public void walk() {
         System.out.println("Boy is walking");
     }

     @Override
     public void talk() {
         System.out.println("Boy is talking");
     }
 }

 class Girl implements Human{

     @Override
     public void talk() {
         System.out.println("Girl is talking");
     }

     @Override
     public void walk() {
         System.out.println("Girl is walking");
     }
 }

 // Interface is used to acheive multiple inheritance

interface Line {
    void length(int length);
}
interface Polygon{
    void joints (int joints);
}

class square implements Line,Polygon {
    @Override
    public void length(int length) {
        System.out.println(" square has length : " + length);
    }

    @Override
    public void joints(int joints) {
        System.out.println(" square has sides : " + joints);
    }
}