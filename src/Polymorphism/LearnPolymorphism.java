package Polymorphism;

public class LearnPolymorphism {

    // Polymorphism allows us to perform a single action in different ways
    //polymorphism allows you to define one interface and have multiple implemnetatiion

    // Types of polymorphism
    //1) Compile time polymorphism (Overriding)
    //2) Runtime Polymorphism (Runtime )

    public static void main(String[] args) {

        // Compile time polymorphism
        user u1 = new user();
        u1.clicks();
        u1.clicks("yash");
        u1.clicks("lucky",3);

        // runtime polymorphism
        financeUser f1 = new financeUser();
        f1.clicks();

    }
}
class user {
    String name ;
    void clicks (){
        System.out.println("Clicked by user");
    }
    void clicks(String name){
        System.out.println(" Clicked by " + name);
    }
    void clicks(String name , int Count){
        for (int i = 0; i < Count ; i++) {
            System.out.println(" Clicked by " + name);
        }
    }
}

class financeUser extends user{
    @Override
    void clicks(){
        System.out.println("Clicked By Finance User");
    }
}
