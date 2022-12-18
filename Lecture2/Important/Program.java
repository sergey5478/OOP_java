package Lecture2.Important;

public class Program {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.value = 123;
        // System.out.println(f1.value);
        f1.printCount();

        // Foo.count = 123456000;

        Foo f2 = new Foo();
        f2.value = 2345;
        // System.out.println(f2.value);
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 23145;
        // System.out.println(f3.value);
        f3.printCount();
    }

}
