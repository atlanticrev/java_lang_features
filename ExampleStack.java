class Stack {
    private int mTop;
    private int[] mStack;

    Stack(int length) {
	mTop = -1;
	mStack = new int[length];
    }

    int getTop() {
        return mStack[mTop];
    }

    void push(int value) {
      if (mTop == mStack.length - 1) {
          System.out.println("Stack is full!");
      } else {
          mStack[++mTop] = value;
      }
    }

    int pop() {
        if (mTop < 0) {
	    System.out.println("Stack is empty!");
	    return 0;
	} else {
	    return mStack[mTop--];
	}
    }
}

class ExampleStack {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
	stack.push(10);
	System.out.println(stack.getTop());
	stack.push(20);
	System.out.println(stack.getTop());
	stack.push(30);
    }
}
