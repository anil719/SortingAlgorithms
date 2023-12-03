public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,3,12,10,14,7,6,2,11,9,15,4,13};

        int n = arr.length;
        insertionSort(arr);

        for(int i : arr) System.out.print(i + " ");
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int j = i;

            while(j > 0 && arr[j-1] > arr[j]){

                int t = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = t;
                j--;

            }
        }
    }

}
