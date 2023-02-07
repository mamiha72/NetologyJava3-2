public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 90.5;
        double height = 1.74;
        double bmi = service.calculate(weight, height);

        String outBmi = String.format("%.2f", bmi);
        System.out.println("Ваш индекс тела " + outBmi);

    }
}
