package closedHashingLinearProbing;

import openhashing.HashTable;

public class Main {
    public static void main(String[] args) {
            HashTableWithLinearProbing ht = new HashTableWithLinearProbing(7);
            ht.insert(2, "data2");
            ht.insert(5, "data5");
            ht.insert(0, "data0");
            ht.insert(9, "data9");
            ht.insert(3, "data3");
            ht.insert(16, "data16");

            System.out.println(ht.get(3));

    }
}
