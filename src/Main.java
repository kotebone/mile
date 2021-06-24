public class Main {
    public static void main(String[] args) {
        double amount = 22_350.0; //в рублях
        double percent = 0.05;
        int mile = (int) (amount * percent);
        System.out.println("Бонусные мили: " + mile);
    }
}