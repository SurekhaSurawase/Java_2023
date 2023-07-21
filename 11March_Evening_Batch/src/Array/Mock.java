package Array;

public class Mock {

	public static void main(String[] args) {
		
		int arr[] = {4,5,4,8,9,7,5,8};
		
		for(int i=0; i<=arr.length-1; i++) {
			
			for(int j= i+1; j<=arr.length-1; j++) {
				if(arr[i]!=arr[j]) {
		System.out.println(arr[i]);
				}
			}
		}

	}

}
