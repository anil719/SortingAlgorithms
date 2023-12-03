public class MergeSort {        //              TimeComplexity -----> O(nlogn)
    public static void main(String[] args) {
        int[] arr = {8,3,12,5,1,10,14,7,6,2,11,9,15,4,13};

        int n = arr.length;
        devide(arr, 0, n-1);

        for(int i : arr) System.out.print(i + " ");
    }

    private static void devide(int[] arr, int start, int end) {
        if(start >= end) return;

        int mid = start + (end-start)/2;
        devide(arr, start, mid);
        devide(arr, mid+1,end);

        conquer(arr, start, mid, end);
    }

    private static void conquer(int[] arr, int start, int mid, int end) {

        int[] newArray = new int[end-start+1];

        int i = start, j = mid+1, k = 0;

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                newArray[k++] = arr[i++];
            }
            else{
                newArray[k++] = arr[j++];
            }
        }

        while(i <= mid){
            newArray[k++] = arr[i++];
        }

        while(j <= end){
            newArray[k++] = arr[j++];
        }

        //coping merged data into original array
        k = start;
        for(int x = 0; x < newArray.length; x++){
            arr[k] = newArray[x];
            k++;
        }
    }
}
