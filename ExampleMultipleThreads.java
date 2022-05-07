class ChildThread implements Runnable {
    Thread thread;

    ChildThread() {
        thread = new Thread(this, "ChildThread");
	System.out.println("Child thread has been created: " + thread);
	thread.start();
    }

    public void run() {
        try {
	    for (int i = 5; i > 0; i--) {
	        System.out.println("Child thread count: " + i);
		thread.sleep(500);
	    } 
	} catch (InterruptedException e) {
	    System.out.println("Child thread has been interrupted");
	}

	System.out.println("Child thread has been finished");
    }
}

class ExampleMultipleThreads {
    public static void main(String[] args) {
        new ChildThread();

	try {
	    for (int i = 5; i > 0; i--) {
	        System.out.println("Main thread count: " + i);
		Thread.sleep(1000);
	    }
	} catch (InterruptedException e) {
	    System.out.println("Main thread has been interrupted");
	}

	System.out.println("Main thread has been finished");
    }
}
