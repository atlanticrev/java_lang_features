class ExampleThreads {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

	System.out.println("Current thread is " + thread);

	thread.setName("testThread");
	System.out.println("Current thread with new name is " + thread);

	for (int n = 5; n > 0; n--) {
	    try {
		System.out.println("count: " + n);
	        thread.sleep(500);
	    } catch (InterruptedException e) {
		System.out.println("Thread has been interrupted");
	    }
	}
    }
}
