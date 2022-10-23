package course.p1;

import course.p2.C;

class A{
    public void sayHello(){
        System.out.println("Hello from A");
    }
}

public class B extends C{
    public static void main(String[] args) {
        A a = new A();
        a.sayHello();

       B c = new B();
        c.sayHello();
    }
}
