class Electronics {
    protected int mCost;
	
    Electronics(int cost) {
        mCost = cost;
    }
}

class Phone extends Electronics {
    private String mName;

    Phone(int cost, String name) {
        super(cost);
	mName = name;
    }

    int getCost() {
        return mCost;
    }

    String getName() {
        return mName;
    }
}

class ExampleInheritance {
    public static void main(String[] args) {
        Phone phone = new Phone(1000, "IPhone");
	System.out.println(phone.getCost());
	System.out.println(phone.getName());
    }
}
