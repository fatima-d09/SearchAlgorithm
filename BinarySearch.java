
public class BinarySearch {
	
	//Iterative Binary Search:	
	public static int binarySearch(int[] list, int key, int first, int last){
		 first = 0;
		 last = list.length - 1;
		
		while(first <= last) {
			int midpoint = (first + last) / 2;
			
			if(list[midpoint] == key) { //Best Case
				return midpoint;
			}
			else if(list[midpoint] < key) {
				first = midpoint + 1;
			}
			else {
				last = midpoint - 1;
			}		
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		System.out.println("Iterative Binary Search\n");
		
		int[] list = {4, 5, 6, 7, 8, 9};
		int key = 3;
		int first = 0;
		int last = list.length - 1;
		int target = binarySearch(list, key, first, last);
		
		System.out.println("Target element index: "+target);
		
		if(target != -1) {
			System.out.println("Target element: "+list[target]);
		}
		else {
			System.out.println(key+" is not in list");
		}
					
		
	}

}
