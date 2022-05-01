class Static { 
    static int a = 5;
    static int b;

    static void staticMethod() {
      System.out.println("Static method call...");
    }

    static {
        System.out.println("Static initialization block call...");
	b = 10;
    }
}

class ExampleStatic {
    public static void main(String[] args) {
         System.out.println(Static.a);
	 System.out.println(Static.b);
	 Static.staticMethod();
    }
}
