
public class LinearSearch {
	
	public static int linearSearch(int[] data, int key) {
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4};
		int key = 2;		
		int target = linearSearch(data, key);
		
		System.out.println("Index of key "+target); 
		
		if(target != -1) {
		System.out.println("key: "+data[target]);
		}
		else {
			System.out.println(key+" does not exist in the array");
		}
	}

}
