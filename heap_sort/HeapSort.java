import java.util.*;
class HeapSort{
public void heap_sort(int [] array, int size){
	build_heap(array, size);
	for(int i = size-1; i>=0; i--){
		int temp = array[0];
		array[0] = array[i];
		array[i] = temp;
		heap_adjust(array, 0, i);
	}
}

void build_heap(int [] array, int size){
	for(int i = (size-2)/2; i>=0; i--){
		heap_adjust(array, i, size);
	}
}

void heap_adjust(int [] array, int i, int size){
	if(i<= (size-2)/2){
		int left = 2*i+1;
		int right = 2*(i+1);
		int maxx = i;
		if (left < size && array[left] > array[maxx]){
			maxx = left;
		}
		if(right < size && array[right] > array[maxx]){
			maxx = right;
		}
		if (i != maxx){
			int temp = array[i];
			array[i] = array[maxx];
			array[maxx] = temp;
			heap_adjust(array, maxx, size);
		}
	}
}

public static void main(String [] args){
	HeapSort hp = new HeapSort();
	int [] array = {-1,10,0,0,3,9,6,2,7};
	/*for (int i = 0; i<array.length; i++){
		System.out.print(array[i],",");
	}*/

	System.out.println(Arrays.toString(array));
	System.out.println();
	hp.heap_sort(array, array.length);
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	
}
}