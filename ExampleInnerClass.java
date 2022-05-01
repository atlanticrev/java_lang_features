class OuterClass {
    private int outerVar = 10;

    void outerMethod() {
        InnerClass innerClass = new InnerClass();
	innerClass.display();
    }

    class InnerClass {
        private int innerVar = 20;

	void display() {
	    System.out.println("InnerClass method 'display' call...");
	    System.out.println("Value of outerVar from innerMethod is " + outerVar);
	}
    }
}

class ExampleInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();	
    }
}
