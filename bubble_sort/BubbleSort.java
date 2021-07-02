import java.util.*;
class BubbleSort{
public void bubble_sort(int [] a , int length){
	for(int i = 0; i<length-1; i++){
		for(int j = 0; j< length-i-1; j++){
		if(a[j] > a[j+1]){
			int temp = a[j];
			a[j]= a[j+1];
			a[j+1] = temp;
		}
	}
	}
}




public static void main(String [] args){
	BubbleSort bs = new BubbleSort();
	int [] array = {-1,10,0,0,3,9,6,2,7};
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	bs.bubble_sort(array, array.length);
	
	System.out.println(Arrays.toString(array));
	System.out.println();
	
}
}