public class SelectionSort {  // TimeComplexity -----> O(n^2)
    public static void main(String[] args) {
        int[] arr = {8,3,12,5,7,6,2};

        int n = arr.length;
        selectionSort(arr);

        for(int i : arr) System.out.print(i + " ");
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIdx = i;
            for(int j = i+1; j<n; j++ ){
                if(arr[j] < arr[minIdx]) minIdx = j;
            }
            int t = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = t;
        }
    }
}
