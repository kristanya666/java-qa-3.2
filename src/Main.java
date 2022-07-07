public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.6;
        double m = 48;
        double BodyMassIndex = service.calculate(h, m);
        System.out.print("Индекс массы тела: ");
        System.out.println(BodyMassIndex);
    }
}
