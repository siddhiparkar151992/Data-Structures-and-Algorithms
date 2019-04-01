package main.java.algorithms.arrays;

public class MergeArrayIntoAnother {

	public int[] shift(int mPlusN[], int size) {
		int i, j = size - 1;
		for (i = size - 1; i >= 0; i--) {
			if (mPlusN[i] != -1) {
				mPlusN[j] = mPlusN[i];
				if(j!=i)mPlusN[i] = -1;
				j--;
			}
		}
		return mPlusN;
	}

	public void mergeArrays(int[] mArr, int[] nArr,int n) {
		int i = n;
		int j = 0;
		int k = 0;

		while (k < mArr.length) {
			if(i< mArr.length && mArr[i] < nArr[j]){
				mArr[k] = mArr[i];
				i++;
			}else{
				mArr[k]= nArr[j];
				j++;
			}
			k+=1;
		}
	}

	public static void main(String[] args) {
		MergeArrayIntoAnother me = new MergeArrayIntoAnother();
		int[] mnArr = { 2, 3, -1, -1, -1, 4, -1, 15, 20 };
		int[] nArr = { 5, 7, 9, 25 };
		int n = nArr.length;
		int m = mnArr.length - n;
		mnArr = me.shift(mnArr, mnArr.length);
		me.mergeArrays(mnArr, nArr, m-1);
		System.out.println(mnArr);
	}

}
