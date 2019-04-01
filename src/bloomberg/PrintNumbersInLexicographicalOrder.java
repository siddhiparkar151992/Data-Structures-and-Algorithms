package bloomberg;

public class PrintNumbersInLexicographicalOrder {

	public static void printLimit(int n, int i) {
		int k = 1;
		System.out.println(i*10);
		while (k <= 9 && i*10+k <= n) {
			System.out.println(i*10+k);
			k++;
		}
	}

	public static void print(int n) {
		int limit = n / 10;
		int i = 1;
		while (i <= limit) {
			System.out.println(i);
			printLimit(n, i);
			i++;
		}
		while(i < 10){
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(25);
	}

}
