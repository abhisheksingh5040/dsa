package stack;

import java.util.ArrayList;
import java.util.List;

public class MyStackArrayList {
    List<Integer> list;

    MyStackArrayList() {
        this.list = new ArrayList<>();
    }

    public void push(int num) {
        list.add(num);
    }

    public int peek() {
        return list.get(list.size() - 1);
    }

    public int pop() {
        int index = list.size() - 1;
        int res = list.get(index);
        list.remove(index);
        return res;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }
}
