public class BubbleSort {     //              TimeComplexity -----> O(n^2)
    public static void main(String[] args) {
        int[] arr = {8,3,12,5,1,10,14,7};

        int n = arr.length;
        bubbleSort(arr);

        for(int i : arr) System.out.print(i + " ");
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            boolean swapTakeplace = false;
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    swapTakeplace = true;
                }
            }
            if(!swapTakeplace) break;
        }
    }
}



//   Note : Best Case TimeComplexity is O(n)
