package Arrays;

public class HarmonicAvarage {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3};
        double harmonicAverage = 0;
        double sum = 0;
        for (double i : numbers) {
            sum += (1 / i);
        }
        harmonicAverage = sum / numbers.length;
        System.out.println("Harmonic avarage : " + harmonicAverage);
    }
}
