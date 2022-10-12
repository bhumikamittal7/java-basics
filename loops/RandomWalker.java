public class RandomWalker {
    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        int steps = 0;
        int r = Integer.parseInt(args[0]);
        System.out.println("(" + (int) x + "," +(int) y + ")");

        for (steps = 0; r != (Math.abs(x) + Math.abs(y)); steps++) {
            double p = Math.random();
            if (p < 0.25)
                x++;
            else if (p < 0.50)
                x--;
            else if (p < 0.75)
                y++;
            else if (p < 1.00)
                y--;
            System.out.println("(" + (int) x + "," +(int) y + ")");
        }
        System.out.println("steps = " + steps);

    }

}