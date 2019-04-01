package bloomberg;

class SuperClass {
	private void printIt() {
		System.out.println("SuperClass");
	}

	void printIt(boolean f) {
		if (f) {
			System.out.println("Super-part 2");
		} else {
			printIt();
		}
	}
}
