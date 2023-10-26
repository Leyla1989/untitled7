public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 65;
        double heightInMeters = 1.64;
        double bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}
