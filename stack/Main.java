package stack;

public class Main {
    public static void main(String[] args) {

        //Array
        MyStackArray array = new MyStackArray(10);
        array.push(10);
        array.push(12);
        array.push(14);
        array.push(16);

        int arrayPeek1 = array.peek();
        System.out.println(arrayPeek1);
        array.pop();
        int arrayPeek2 = array.peek();
        System.out.println(arrayPeek2);

        System.out.println(array.isEmpty());
        System.out.println(array.size());

        // ArrayList
        System.out.println("-----ArrayList---------");
        MyStackArrayList list = new MyStackArrayList();
        list.push(10);
        list.push(12);
        list.push(14);
        list.push(16);

        int arrayListPeek1 = list.peek();
        System.out.println(arrayListPeek1);
        list.pop();
        int arrayListPeek2 = list.peek();
        System.out.println(arrayListPeek2);

        System.out.println(list.isEmpty());
        System.out.println(list.size());

        System.out.println("-----LinkedList---------");
        MyStackLL ll = new MyStackLL();
        ll.push(10);
        ll.push(12);
        ll.push(14);
        ll.push(16);

        int llPeek1 = ll.peek();
        System.out.println(llPeek1);
        ll.pop();
        int llPeek2 = ll.peek();
        System.out.println(llPeek2);

        System.out.println(ll.isEmpty());
        System.out.println(ll.size());
    }
}
