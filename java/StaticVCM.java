public class StaticVCM {
    static int n;

    static {
        System.out.println("Static block executed");
        n = 10;
    }

    static void method() {
        System.out.println("Static method called.");
        System.out.println("Count: " + n);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");

        method();

        n = n+1;
        System.out.println("Count is: " + n);
    }
}
