public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредита 1 год: ");
        System.out.println(service.calculate(1_000_000, 9.99, 12));
        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредита 2 года: ");
        System.out.println(service.calculate(1_000_000, 9.99, 24));
        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредита 3 года: ");
        System.out.println(service.calculate(1_000_000, 9.99, 36));
        System.out.println();

    }
}
