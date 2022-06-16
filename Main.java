import package_one.ClassA;

class ClassB extends ClassA {
    private void keepSecret() {
        System.out.println("This is secret");
    }
}


public class Main {

    protected void sayGudMorning() {
        System.out.println("Good Morning");
    }
    public static void main (String[] args) {
        System.out.println("Main class running...");

        ClassA a = new ClassA();
        a.hello();
        // a.greetings();
        // a.sayGudMorning();
        ClassA.greetings();
        // ClassA.hello();
        Main m = new Main();
        m.sayGudMorning();

        ClassB b = new ClassB();
        b.hello();
        // b.keepSecret();
    }
}
