package stack.program;

public class TwoStackArray {
    int[] arr;
    int cap;
    int top1;
    int top2;

    public TwoStackArray(int cap) {
        this.cap = cap;
        top1 = -1;
        top2 = cap;
        arr = new int[cap];
    }

    public boolean push1(int num) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = num;
            return true;
        }
        return false;
    }

    public boolean push2(int num) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = num;
            return true;
        }
        return false;
    }

    public Integer pop1() {
        if (top1 >= 0) {
            int res = arr[top1];
            top1--;
            return res;
        }
        return null;
    }

    public Integer pop2() {
        if (top2 < cap) {
            int res = arr[top2];
            top2++;
            return res;
        }
        return null;
    }

    public static void main(String[] args) {
        TwoStackArray stack = new TwoStackArray(5);
        System.out.println(stack.push1(1));
        System.out.println(stack.push1(2));
        System.out.println(stack.push1(3));
        System.out.println(stack.push1(4));
        System.out.println(stack.push1(5));
        System.out.println(stack.push1(6));
        System.out.println(stack.push2(7));
    }
}
