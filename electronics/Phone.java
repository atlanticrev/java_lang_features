package electronics;

public class Phone extends Electronics {
    private String mName;

    public Phone(String name, int cost) {
        super(cost);
	mName = name;
    }

    public String getName() {
        return mName;
    }
}
