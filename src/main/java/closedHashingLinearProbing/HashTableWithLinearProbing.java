package closedHashingLinearProbing;

// Implementing a Hash Table using closed hashing with linear probing.
public class HashTableWithLinearProbing {
    private HashElem[] table;
    private int capacity;

    /**
     * A nested class representing one element  (one entry) in the hash table
     */
    private static class HashElem {
        int key;
        Object value;

        HashElem(int key, Object value) {
            this.key  = key;
            this.value = value;
        }
    }

    /**
     * Constructor
     * @param size max capacity
     */
    public HashTableWithLinearProbing(int size){
        table = new HashElem[size];
        capacity = size;
    }

    /** Returns the hash value for a given key
     *
     * @param key key
     * @return index in table
     */
    public int hash(int key){
        if (key < 0)
            throw new IllegalArgumentException();
        return key % capacity;
    }

    /**
     * Inserts a new HashElem with the given key and entry to the hash table
     * @param key key
     * @param value value
     */
    public void insert(int key, Object value){
        HashElem elem  = new HashElem(key, value);
        // FILL IN CODE
        // Compute the hash function for the key to find the index in the array
        // If this index is available, add elem there
        // Otherwise "probe" index+1, index+2 ... (in a circular fashion) to find an available spot

    }

    /**
     * Return the value for the given key
     * @param key key
     * @return value
     */
    public Object get(int key) {
       // FILL IN CODE

        return null;
    }

    // This version does not support deletion
}
