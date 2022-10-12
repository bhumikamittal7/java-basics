public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int x = a*a + b*b;
        int y = b*b + c*c;
        int z = a*a + c*c;

        boolean positive = a > 0 && b > 0 && c > 0;
        boolean triangle = x == c*c || y == a*a || z == b*b;
        boolean result = (positive == true) && (triangle == true);
        System.out.println(result);
            
        
    
    }}
