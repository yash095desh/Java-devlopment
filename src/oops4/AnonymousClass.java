package oops4;

public class AnonymousClass {
    // nested class that doesn't have any name is known as Anonymous
    // used when needed for single use

    // basic use Case
//   class InnerClass extends OuterClass{
//       @Override
//       void outerMethod() {
//           super.outerMethod();
//       }
//   }

    // By using anonumus class
    // Types of anonymous class

    //1) Super class that anonymous class extends
    OuterClass obj = new OuterClass(){
        @Override
        void outerMethod() {
            super.outerMethod();
        }
    };

    // 2) Interface that an anonymous class implements

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };


}

class OuterClass {
    void outerMethod(){

    }
}

interface SuperInterface {
    void interfaceMethod();
}
