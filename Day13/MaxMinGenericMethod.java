public class MaxMinGenericMethod {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 25;
        Integer c = 15;
        System.out.println("Maximum Integer: " + findMax(a, b, c));

        Float x = 12.5f;
        Float y = 7.8f;
        Float z = 19.3f;
        System.out.println("Maximum Float: " + findMax(x, y, z));

        String p = "Apple";
        String q = "Peach";
        String r = "Banana";
        System.out.println("Maximum String: " + findMax(p, q, r));
    }

    public static <Obj extends Comparable<Obj>> Obj findMax(Obj a, Obj b, Obj c) {
        Obj max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }

        if (c.compareTo(max) > 0) {
            max = c;
        }

        return max;
    }
}