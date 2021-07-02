import java.util.*;
class MaxHeapTopK{
   
   public int[] smallestK(int[] arr, int k) {
        if(k<=0 || arr.length<=0){
            return new int[0];
        }
        int [] res= new int[k];
       
       PriorityQueue<Integer> Q = new PriorityQueue<Integer>(new Comparator<Integer>(){
           @Override
           public int compare(Integer i1, Integer i2){
               return i2-i1;
           }
       });
       for(int i = 0; i<k; i++){
           Q.offer(arr[i]);
       }
       for(int i = k; i<arr.length; i++){
           if(arr[i]< Q.peek()){
               Q.poll();
               Q.offer(arr[i]);
           }
       }
        for(int i = 0;i<k;i++){
            res[i] = Q.poll();
        }
        return res;

    }

public static void main(String[] args){
	MaxHeapTopK qsk = new MaxHeapTopK();
	int[] arr ={1,-1,0,0,7,9,10,3,4,88,5,-2};
	System.out.println(Arrays.toString(arr));
	int [] res = qsk.smallestK(arr, 4);
	System.out.println(Arrays.toString(res));
}
}