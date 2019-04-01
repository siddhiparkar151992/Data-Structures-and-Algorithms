package goldmansach;

public class FlattenHistogram {

	public static void flattenHistogram(int[] a) {
		int len = a.length;
        int count = 0;
        boolean flag = true;
        while(flag){
            flag = false;
            int prev = a[0];
            for(int j = 1; j < len-1; ++j){
                int k = a[j];
                if(k == 0)
                    k = 0;
                else if(k == prev && k == a[j+1])
                    k = k - 1;
                else if(k < prev && k < a[j+1])
                    k = k - 1;
                else{
                    if(k > prev)
                        k = prev;
                    if(k > a[j + 1])
                        k = a[j + 1];
                }
                prev = a[j];
                a[j] = k;
            }
            a[0] = 0;
            a[len-1] = 0;
            count++;
            for(int i = 0; i < len; ++i){
                flag = flag || (a[i] != 0);
            }
        }

        System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 flattenHistogram(new int[] {1,2,3,2,0,0,2,4,3});
//		flattenHistogram(new int[] { 5, 4, 3, 6, 0, 1 });
		flattenHistogram(new int[] { 1,2,3,2,1,1,1,2,4,3,2,3,4,5,1,0,1});
	}

}
