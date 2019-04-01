package bloomberg;

public class ReplaceArraywithUnqueElement {
	
	public static void replace(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		
		int cp = 0;
		int np = 1;

		while(cp < arr.length && np < arr.length) {
			
			
			if(visited[arr[cp]] && !visited[arr[np]]) {
				arr[cp] = arr[np];
				cp++;
				np++;
			}else if(visited[arr[cp]] && visited[arr[np]]){
				np++;
			}else{
				cp++;
				np++;
			}
			if(cp < arr.length )visited[arr[cp]] = true;
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		replace(new int[]{3,3,4,5,5,6,7,7,7}, 8);
	}

}
