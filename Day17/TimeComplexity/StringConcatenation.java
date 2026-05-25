package TimeComplexity;

public class StringConcatenation {
    public static void main(String[] args) {
        int n = 10000;
        long stringStart = System.nanoTime();
        String str = "";

        for (int i = 0; i < n; i++) {
            str += "a";
        }

        long stringEnd = System.nanoTime();
        long builderStart = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        long builderEnd = System.nanoTime();
        long bufferStart = System.nanoTime();
        StringBuffer sf = new StringBuffer();

        for (int i = 0; i < n; i++) {
            sf.append("a");
        }

        long bufferEnd = System.nanoTime();

        System.out.println("String Time: " + (stringEnd - stringStart) + " ns");
        System.out.println("StringBuilder Time: " + (builderEnd - builderStart) + " ns");
        System.out.println("StringBuffer Time: " + (bufferEnd - bufferStart) + " ns");
    }
}
