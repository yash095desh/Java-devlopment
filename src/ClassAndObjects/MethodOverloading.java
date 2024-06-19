package ClassAndObjects;

public class MethodOverloading {
    public static void main(String[] args) {
        //Two or more methods can have same name inside the same class if they accept different arguments .this feature is known as method overloading

        greet g1 = new greet();
        g1.greetings("Yash");
        g1.greetings("Lucky",10);

    }
}

class greet{
    void greetings(String name){
        System.out.println("Good Morning " + name);
    }
    void greetings(String name , int count){
        for (int i  = 0; i  < count; i ++) {
            System.out.println("Good Morning " + name);
        }
    }
}