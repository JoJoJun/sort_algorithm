import java.util.*;
class QuickSortTopK{
    public int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i = p-1;
        for(int j = p; j<=r-1;j++){
            if(arr[j]<=x){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
        return i+1;
    }
    public int[] smallestK(int[] arr, int k) {
        if(k<=0 || arr.length<=0){
            return new int[0];
        }
        int [] res= new int[k];
        int start = 0, end = arr.length-1;
        int q = partition(arr,start, end);
        while(q!=k-1 ){
            if(q<k-1){
                start = q+1;
            }else {
                end = q-1;
            }
            q = partition(arr,start, end);
        }
        for(int i = 0;i<k;i++){
            res[i] = arr[i];
        }
        return res;

    }
public static void main(String[] args){
	QuickSortTopK qsk = new QuickSortTopK();
	int[] arr ={1,-1,0,0,7,9,10,3,4,88,5,-2};
	System.out.println(Arrays.toString(arr));
	int [] res = qsk.smallestK(arr, 4);
	System.out.println(Arrays.toString(res));
}
}