package main.java.amazon;

public class FindNextGreaterPalindrome {

	public void find(int[] arr) {
		int mid = 0;
		int i = 0;
		int j = 0;
		mid = arr.length / 2;
		if (arr.length % 2 == 0) {
			mid -=1;
			i = mid;
			j = i + 1;
		} else {
			i = mid - 1;
			j = mid + 1;
		}
		boolean uneven = false;
		while (i >= 0 && j < arr.length) {
			if (arr[i] != arr[j]) {
				uneven = true;
				if (arr[i] > arr[j]) {
					arr[j] = arr[i];
				} else {
					if (arr.length % 2 == 0) {
						arr[mid] += 1;
						arr[mid + 1] += 1;
					}else{
						
						if (arr[mid] == 9) {
							arr[mid] = 0;
							int carry = 1;
							for (int m = mid-1; m >= 0; m--) {
								int sum = arr[m] + carry;
								arr[m] = (sum) % 10;
								carry = sum / 10;
							}
						} else {
							arr[mid] += 1;
						}
					}
					break;
				}
			}
			i--;
			j++;
		}

		if (!uneven) {
			int midNum = arr[mid];
			if (arr[mid] == 9) {
				arr[mid] = 0;
				int carry = 1;
				for (int m = mid - 1; m >= 0; m--) {
					int sum = arr[m] + carry;
					arr[m] = (sum) % 10;
					carry = sum / 10;
				}
			} else {
				arr[mid] += 1;
			}
			
			i = mid-1;
			j = mid+1;
			while(i>=0 && j<arr.length){
				if (arr[i] > arr[j]) {
					arr[j] = arr[i];
				} else {
					if (arr.length % 2 == 0) {
						arr[mid] += 1;
						arr[mid + 1] += 1;
					}else{
						
						if (arr[mid] == 9) {
							arr[mid] = 0;
							int carry = 1;
							for (int m = mid-1; m >= 0; m--) {
								int sum = arr[m] + carry;
								arr[m] = (sum) % 10;
								carry = sum / 10;
							}
						} 
					}
					break;
				}
				i--;
				j++;
			}

		}
		for(int o=0;o< arr.length;o++){
			System.out.print(arr[o]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNextGreaterPalindrome f= new FindNextGreaterPalindrome();
		f.find(new int[]{7 ,8 ,3 ,3 ,2 ,2});
//		f.find(new int[]{1, 2 ,9 ,2, 1});
	}

}
