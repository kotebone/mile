public class Main {
    public static void main(String[] args) {
        double amount = 22_350.0; //в рублях
        int percent = 5;
        int mile = (int) (amount * percent / 100);
        System.out.println("Бонусные мили: " + mile);
    }
}