package hashing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollisionHashtable {

    private int bucket;
    private List<LinkedList> list;

    public CollisionHashtable(int bucket) {
        this.bucket = bucket;
        list = new ArrayList<>(bucket);

        for (int i = 0; i < bucket; i++) {
            list.add(new LinkedList<Integer>());
        }
    }

    public int hashFunction(int num) {
        return num % bucket;
    }

    public void insert(int num) {
        int index = hashFunction(num);
        list.get(index).add(num);
    }

    public void delete(int num) {
        int index = hashFunction(num);
        list.get(index).remove((Integer) num);
    }

    public boolean get(int num){
        int index = hashFunction(num);
        return list.get(index).contains(num);
    }

    public static void main(String[] args) {
        CollisionHashtable hashtable = new CollisionHashtable(7);

        hashtable.insert(10);
        hashtable.insert(15);
        hashtable.insert(18);
        hashtable.insert(25);
        hashtable.insert(55);
        hashtable.insert(45);
        hashtable.insert(85);
        hashtable.insert(95);

        System.out.println(hashtable.get(18));
        hashtable.delete(18);
        System.out.println(hashtable.get(18));

    }
}
