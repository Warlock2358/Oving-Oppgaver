package Forelesning;

public class Array {
    public static void main(String[] args) {
        int[] tall = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int j : tall) {
            sum += j;
        }
        System.out.println(sum);
    }
}
