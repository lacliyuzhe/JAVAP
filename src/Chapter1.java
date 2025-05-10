import java.util.Scanner;
public class Chapter1 {
    public static void main(String[] args) {
        //创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double x,y;
        x = (e*d)-(b*f)/(a*d) - (b*c);
        y = (a*f)-(e*c)/(a*d) - (b*c);
        System.out.println(x+","+y);
    }
}
