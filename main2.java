/*
 * class A {
 * // single Inheritence
 * void print_A() {
 * System.out.println("This is single Inheritence");
 * }
 * }
 * 
 * class B extends A {
 * void print_B() {
 * System.out.println("This is Inherited Class");
 * }
 * }
 * 
 * class Anew {
 * public static void main(String[] args) {
 * B obj2 = new B();
 * obj2.print_A();
 * obj2.print_B();
 * }
 * }
 */
// Multilevel inheritence
/*
 * class A {
 * void print_A() {
 * System.out.println("This is Base class");
 * }
 * }
 * 
 * class B extends A {
 * void print_B(int id) {
 * System.out.println("This is inherited class having value " + id);
 * }
 * }
 * 
 * class C extends B {
 * void print_C(int id) {
 * System.out.println("This is inherited class from class B " + id);
 * }
 * }
 * 
 * public class main {
 * public static void main(String[] args) {
 * C s1 = new C();
 * s1.print_A();
 * s1.print_B(10);
 * s1.print_C(11);
 * }
 * }
 * 
 */

/*
 * //Hierachical Inheritence
 * class A {
 * void print_A() {
 * System.out.println("This is Base Class");
 * }
 * }
 * 
 * class B extends A {
 * void print_B() {
 * System.out.println("This is Derived class B from A");
 * }
 * }
 * 
 * class C extends A {
 * void print_C() {
 * System.out.println("This is Derived class C from A");
 * }
 * }
 * 
 * class D extends A {
 * void print_D() {
 * System.out.println("This is Derived class d from A");
 * }
 * }
 * 
 * class Main {
 * 
 * public static void main(String[] args) {
 * B o1 = new B();
 * o1.print_A();
 * o1.print_B();
 * 
 * C o2 = new C();
 * o2.print_A();
 * o2.print_C();
 * 
 * D o3 = new D();
 * o3.print_A();
 * o3.print_D();
 * 
 * }
 * }
 * 
 */

//Hybrid Inheritence

class A {
    void print_A() {
        System.out.println("This is the Base Class");
    }
}

class B extends A {
    void print_B() {
        System.out.println("This is class B");
    }
}

class C extends A {
    void print_C() {
        System.out.println("This is class C");
    }
}

class D extends B {
    void print_D() {
        System.out.println("This is class D");
    }
}

public class main2 {
    public static void main(String[] args) {
        B o1 = new B();
        o1.print_A();
        o1.print_B();

        C o2 = new C();
        o2.print_A();
        o2.print_C();

        D o3 = new D();
        o3.print_B();
        o3.print_D();
    }
}