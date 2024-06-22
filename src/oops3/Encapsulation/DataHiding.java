package oops3.Encapsulation;

public class DataHiding {
    public static void main(String[] args) {
        //System.out.println(Encapsulation.serialNO);

//  we can't access private data directly insted we have defined specific method to access and modify private data this is known as encapsulation through this we can acheive data hiding

        //Data hiding
        //Data hiding is a way to of restricting the access of our data members by hiding the implementation details .Encapsulation also provides a way to data hiding.


        System.out.println(Encapsulation.getSerialNO());
        System.out.println(Encapsulation.getfilename());
        Encapsulation.modifySerialNO(34);
        Encapsulation.modifyfileName("newfileName");
        System.out.println(Encapsulation.getSerialNO());
        System.out.println(Encapsulation.getfilename());
    }
}
