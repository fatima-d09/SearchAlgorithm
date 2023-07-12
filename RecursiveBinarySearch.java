
public class RecursiveBinarySearch {
	
	public static int recursiveBinarySearch(int[] data, int key, int first, int last) {
		//this will return true or false not position
		
		if(first <= last) {  //last # is greater than or equal to the first #
			int mid = (first + last) / 2;
			
			if(data[mid] == key) {
				return mid;
			}
			
			if(data[mid] > key) {
				return recursiveBinarySearch(data, key, first, (mid - 1));
			}
			if(data[mid] < key) {
				return recursiveBinarySearch(data, key, (mid + 1), last);
			}
		} 	
		return -1;
	}

	public static void main(String[] args) {

		int[] data = {1, 2, 3, 4};
		int key = -2;
		int position = recursiveBinarySearch(data, key, 0, data.length - 1);
		
		System.out.println("Target element index: "+position);
		
		if(position != -1) {
			System.out.println("Target Element: "+data[position]);
		} else {
			System.out.println(key +" does not exist within the list of numbers in array!!!");
		}
		
	}

}
