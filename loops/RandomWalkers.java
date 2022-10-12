public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int count = 0;
        for (int counter = 0; counter < trials; counter++) {
            double x = 0;
            double y = 0;
            int steps = 0;

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
            }
            count = count + steps;
        }
        double avg = (double) count / trials;
        System.out.println("average number of steps = " + avg);

    }
}