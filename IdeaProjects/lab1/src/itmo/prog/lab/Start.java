package itmo.prog.lab;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        byte i;
        byte j = 0;
        int[] a = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5};
            System.out.println(Arrays.toString(a));
        double[] x = new double[19];
        for (i = 0; i < 19; i++) x[i] = (double) (Math.random() * 12) - 8;
            System.out.println(Arrays.toString(x));
        double[][] a = new double[12][19];
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 19; j++) {
                switch (a[i]) {
                    case = 15:
                        a[i][j] = Math.tan(Math.pow(4.0 * Math.atan((x[j] - 2.0)/12.0),Math.asin((x[j] - 2.0)/12)));
                        break;
                    case = 6:
                    case = 8:
                    case = 10:
                    case = 13:
                    case = 14:
                    case = 16:
                        a[i][j] = Math.pow(Math.E, Math.pow(0.25 * Math.cos(x[j]), Math.pow(Math.E, x[j])));
                        break;
                    default:
                        a[i][j] = 2.0 * Math.cos(Math.pow(2.0 / (Math.sin(x[j]) - 4.0), Math.pow(Math.E, x[j])));
                }       break;
                System.out.printf("%.2f", a[i][j]);
            }
        }


    }
}