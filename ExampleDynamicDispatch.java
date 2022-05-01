class Electronics {
    protected int mCost;

    Electronics(int cost) {
        mCost = cost;
    }

    void printCost() {
        System.out.println("The cost of electronics is " + mCost);
    }
}

class Phone extends Electronics {
    Phone(int cost) {
        super(cost);
    }

    void printCost() {
        System.out.println("The cost of phone is " + mCost);
    }
}

class Tablet extends Electronics {
    Tablet(int cost) {
        super(cost);
    }

    void printCost() {
        System.out.println("The cost of tablet is " + mCost);
    }
}

class ExampleDynamicDispatch {
    public static void main(String[] args) {
        Electronics electronics = new Electronics(1000);
	Phone phone = new Phone(2000);
	Tablet tablet = new Tablet(3000);

	Electronics test;
	test = electronics;
	test.printCost();

	test = phone;
	test.printCost();

	test = tablet;
	test.printCost();
    }
}
