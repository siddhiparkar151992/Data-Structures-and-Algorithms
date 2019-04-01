package goldmansach;

import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> stack = new Stack<>();
	
	public void pop(){
		System.out.println(popUtil());
	}
	private Integer popUtil() {
		int n = -1;
		int r= -1;
		if(!stack.isEmpty()){
			n = stack.pop();
			r = popUtil();
		}
		if(r!=-1){
			stack.push(n);
		}
		if(stack.isEmpty()){
			r = n;
		}
		
		return r;
	}
	public void insert(int v) {
		stack.push(v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack q= new QueueUsingStack();
		q.insert(1);
		q.insert(2);
		q.insert(3);
		q.pop();
		q.pop();
		q.pop();
		q.pop();
	}

}
