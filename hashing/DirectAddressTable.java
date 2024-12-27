package hashing;

/**
 * create an address table where key ranges from 0 to 999 in O(n) time
 */
public class DirectAddressTable {

    private static boolean[] address;

    public static void main(String[] args) {
        address = new boolean[1000];

        insert(100);
        insert(200);

        delete(100);

        System.out.println(find(100));
        System.out.println(find(200));
        System.out.println(find(500));
    }

    public static void insert(int num){
        address[num] = true;
    }

    public static void delete(int num){
        address[num] = false;
    }

    public static boolean find(int num){
        return address[num];
    }
}
