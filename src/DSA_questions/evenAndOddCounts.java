package DSA_questions;

public class evenAndOddCounts {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int l = arr.length;
    int even = 0;
    int odd = 0;

    public void count() {
        for (int i = 0; i < l; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

    public static void main(String[] args) {

        evenAndOddCounts obj = new evenAndOddCounts();
        obj.count();

    }
}