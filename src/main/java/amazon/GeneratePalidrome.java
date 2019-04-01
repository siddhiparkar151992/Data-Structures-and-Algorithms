package main.java.amazon;

public class GeneratePalidrome {
	
	public static void generatePalidrome(int num){
		for(int j=0;j<2;j++){
			int i = 1;
			int palin;
			while((palin = createPalidrome(i, j%2 ==0, 10)) < num){
				System.out.println(palin);
				i++;
			}
		}
	}

	private static int createPalidrome(int i, boolean isOdd, int base) {
		int palin = i;
		
		int n = i;
		if(isOdd){
			n/=base;
		}
		while(n > 0){
			palin  = palin * base +(n%base);
			n/=base;
		}
		return palin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generatePalidrome(101);
	}

}
