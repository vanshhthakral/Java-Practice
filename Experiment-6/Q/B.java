package q;
import p.A;

public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.publicMethod(); // Accessible
        obj.protectedMethod(); // Accessible (because B extends A)
        
        // obj.defaultMethod(); // Not accessible (different package)
        // obj.privateMethod(); // Not accessible (private to A)
    }
}
