public class QuickSort {      //              TimeComplexity -----> O(nlogn)
    public static void main(String[] args) {
        int[] arr = {8,3,12,5,1,10,14,7,6,2};

        int n = arr.length;
        quickSort(arr, 0, n-1);

        for(int i : arr) System.out.print(i + " ");
    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start < end){
            int pivIdx = partition(arr, start, end);
            quickSort(arr, start, pivIdx-1);
            quickSort(arr, pivIdx+1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {

        int piv = arr[end];
        int i = start-1;
        for(int j = start; j < end; j++){
            if(arr[j] < piv){
                i++;
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }

        i ++;
        int t = arr[i];
        arr[i] = piv;
        arr[end] = t;
        return i;
    }

}
