import java.util.*;
class QuickSort{
public void quick_sort(int [] a ,int p, int r){
	if (p<r){
		int q = partition(a, p, r);
		quick_sort(a,p,q-1);
		quick_sort(a,q+1,r);
	}
}

int partition(int [] array, int p, int r){
	int x = array[r];
	int i = p-1;
	for(int j = p; j<r; j++){
		if(array[j]<x){
			i++;
			int temp = array[i];
			array[i] = array[j];
			array[j]=temp;
		}
	}
int temp = array[i+1];
array[i+1] = x;
array[r] = temp;
return i+1;
}


public static void main(String [] args){
	QuickSort qs = new QuickSort();
	int [] array = {-1,10,0,0,3,9,6,2,7};
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	qs.quick_sort(array, 0, array.length-1);
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	
}
}