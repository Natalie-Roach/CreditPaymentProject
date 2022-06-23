public class CreditPaymentService {
    public int calculate(int S, double percent, int n) {

        int A;
        double i = (percent / 12) / 100;

        double k = (i * Math.pow(1 + i, n)) / (Math.pow(1 + i, n) - 1);
        A = (int) (S * k);

        return A;

    }
}
