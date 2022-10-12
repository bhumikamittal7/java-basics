package week1;

public class p2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        double min = Math.min(n1, Math.min(n2,n3));
        double max = Math.max(n1, Math.max(n2,n3));
        double mid = n1;

        if (n1 != min && n1!= max){
            mid = n1;
        }
        if (n2 != min && n2!= max){
            mid = n2;
        }
        if (n3 != min && n3!= max){
            mid = n3;
        }

        System.out.println(min + " "+ mid + " " + max);



    }
}
