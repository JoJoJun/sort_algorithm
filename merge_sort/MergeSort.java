import java.util.*;
class MergeSort{
final int INT_MAX = Integer.MAX_VALUE;
public void merge_sort(int [] a ,int p, int r){
	if(p<r){
		int mid = (p+r)/2;
		merge_sort(a, p ,mid);
		merge_sort(a, mid+1, r);
		merge(a, p, mid, r);
	}
}
public void merge(int [] a, int p, int q, int r){
 	int n0 = r-p+1, n1 = q-p+1, n2 = r-q;
	ArrayList<Integer>left = new ArrayList<Integer>();
	ArrayList<Integer>right = new ArrayList<Integer>();

	for(int i = 0;i<n1;i++){
		left.add(a[p+i]);
	}
	for(int j = 0; j<n2; j++){
		right.add(a[q+j+1]);
	}
	left.add(INT_MAX);
	right.add(INT_MAX);
	int i = 0, j = 0;
	for(int k = p; k<=r; k++){
		if(left.get(i) <= right.get(j)){
			a[k] = left.get(i);
			i ++;
		}else {
			a[k] = right.get(j);
			j++;
		}
	}
}



public static void main(String [] args){
	MergeSort ms = new MergeSort();
	int [] array = {-1,10,0,0,3,9,6,2,7};
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	ms.merge_sort(array, 0, array.length-1);
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	
}
}