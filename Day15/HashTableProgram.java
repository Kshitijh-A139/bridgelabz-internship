class MyMapNode {
    String word;
    int count;
    MyMapNode next;

    MyMapNode(String word, int count) {
        this.word = word;
        this.count = count;
    }
}

class HashTable {
    MyMapNode[] table = new MyMapNode[10];

    int getIndex(String word) {
        return Math.abs(word.hashCode()) % table.length;
    }

    void add(String word) {
        int index = getIndex(word);
        MyMapNode temp = table[index];

        while (temp != null) {
            if (temp.word.equals(word)) {
                temp.count++;
                return;
            }
            temp = temp.next;
        }

        MyMapNode newMyMapNode = new MyMapNode(word, 1);
        newMyMapNode.next = table[index];
        table[index] = newMyMapNode;
    }

    int get(String word) {
        int index = getIndex(word);
        MyMapNode temp = table[index];

        while (temp != null) {
            if (temp.word.equals(word)) {
                return temp.count;
            }
            temp = temp.next;
        }
        return 0;
    }

    void remove(String word) {
        int index = getIndex(word);
        MyMapNode temp = table[index];
        MyMapNode prev = null;

        while (temp != null) {
            if (temp.word.equals(word)) {
                if (prev == null) {
                    table[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    void print() {
        for (int i = 0; i < table.length; i++) {
            MyMapNode temp = table[i];
            if (temp != null) {
                System.out.print("Bucket " + i + " : ");
                while (temp != null) {
                    System.out.print(temp.word + "=" + temp.count + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }
}

public class HashTableProgram {
    public static void main(String[] args) {
        String s1 = "To be or not to be";
        HashTable h1 = new HashTable();
        String[] words1 = s1.toLowerCase().split(" ");

        for (String w : words1) {
            h1.add(w);
        }

        h1.print();
        System.out.println();
        String s2 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        HashTable h2 = new HashTable();
        String[] words2 = s2.toLowerCase().split(" ");

        for (String w : words2) {
            h2.add(w);
        }

        h2.print();
        h2.remove("avoidable");
        System.out.println("\nAfter removing avoidable");
        h2.print();
    }
}