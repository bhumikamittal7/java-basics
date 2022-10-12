
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double p = (x2-x1)/2;
        double q = (y2-y1)/2;
        double a = Math.pow(Math.sin(Math.toRadians(p)),2);
        double b = Math.pow(Math.sin(Math.toRadians(q)),2);
        double c = Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*b;
        double x = Math.sqrt(a+c);
        double distance = 2*6371*Math.asin(x);

        System.out.println((distance) + " " + "kilometers");

    }
}
