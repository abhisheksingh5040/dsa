package hashing.program;

public class TwoBinarySubArrayOfGivenSize {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 0, 1, 0, 0, 1};

        int naiveSolution = naiveSolution(arr1, arr2, arr1.length);
        System.out.println(naiveSolution);
    }

    public static int naiveSolution(int[] arr1, int[] arr2, int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int zeroCount1 = 0, oneCount1 = 0, zeroCount2 = 0, oneCount2 = 0;
            for (int j = i; j < n; j++) {
                if (arr1[j] == 0) zeroCount1++;
                else oneCount1++;

                if (arr2[j] == 0) zeroCount2++;
                else oneCount2++;

                if(zeroCount1 == zeroCount2 && oneCount1 == oneCount2) result = Math.max(result, zeroCount1 + oneCount1);
            }
        }

        return result;
    }
}
