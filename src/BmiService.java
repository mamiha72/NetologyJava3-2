public class BmiService {
    public double calculate(double w, double h) {
        h = h * h;
        double myBmi = w / h;

        return myBmi;
    }
}
