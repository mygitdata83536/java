import java.util.Comparator;

public class SelectionSort {
	
	static <T>void selectionSort(T [] arr,Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++)
		for(int j=i+1; j<arr.length; j++)
		if(c.compare(arr[i], arr[j])>0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}}

public static void main(String[] args) {
	

	Integer  []arr = {50,20,30,40,10};
	
	for(int element :arr)
	{	
		
		System.out.println("element - "+element);
	}
	
	
	class CompareArr implements Comparator<Integer> {

		@Override
		public int compare(Integer arr, Integer arr2) {
			int value = Integer.compare(arr, arr2);
			return value;
	}
	}
	CompareArr ca  = new CompareArr();
	SelectionSort.<Integer>selectionSort(arr,ca);
	System.out.println("array aftr sort ");
	for(int element :arr)
	{
		
		System.out.println("element - "+element);
	}
}}