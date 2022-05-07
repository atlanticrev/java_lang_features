import electronics.Phone;

class Main {
    public static void main(String[] args) {
	Phone phone = new Phone("IPhone", 2000);
        System.out.println("Phone: " + phone.getName() + " " + phone.getCost());
    }
}
