public class ArrayStrictlyIncreasing {
    public boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayStrictlyIncreasing obj = new ArrayStrictlyIncreasing();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(obj.isStrictlyIncreasing(arr));
    }
}
