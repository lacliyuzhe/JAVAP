import java.util.Scanner;
import java.lang.*;

public class Chapter2 {
    public static void main(String[] args) {
        //温度转换
        System.out.println("Enter the number of Centigrade: ");
        Scanner sc = new Scanner(System.in);
        double Centigrade = sc.nextInt();
        double Fahrenheit = (9.0 / 5) * Centigrade + 32;
        System.out.println("The Fahrenheit is " + Fahrenheit);
        //体积计算
        System.out.println("Enter the value of radius: ");
        Scanner sc2 = new Scanner(System.in);
        double radius = sc2.nextDouble();
        System.out.println("Enter the value of height: ");
        Scanner sc3 = new Scanner(System.in);
        double height = sc3.nextDouble();
        double Area = radius * radius * (Math.PI);
        double volume = Area * height;
        System.out.println("The Area is " + Area);
        System.out.println("The Volume is " + volume);
        //求各位数字之和
        System.out.println("Enter a number");
        Scanner sc4 = new Scanner(System.in);
        int num = sc4.nextInt();
        int fourth = num / 1000;//求得千位数
        num = num % 1000;//剩余的数
        int second = num / 100;//求得百位数
        num = num % 100;//剩余的数
        int third = num / 10;//求得十位数
        num = num % 10;//剩余的数
        int sum= num + fourth + second + third;
        System.out.println(fourth + " " + second + " " + third+" "+num+" "+sum);
        //分钟转换
        System.out.print("Enter an minutes: ");
        Scanner sc5 = new Scanner(System.in);
        long minutes = sc5.nextLong();
        int year = (int)(minutes / 60/24/365);//年数
        int day = (int)(minutes / 60/24%365);//天数，因为不一定能整除
        System.out.println(day + ":" + year);
        //计算账户利率
        System.out.println("Enter the monthly saving amount: ");
        Scanner sc6 = new Scanner(System.in);
        int monthlySaving = sc6.nextInt();//每月存多少
        int month = sc6.nextInt();//求第几月的利息
        double sum_account=0;
        double rate=1+0.00417;
        for(int i = 0 ; i < month ; i++){
            sum_account=(monthlySaving+sum_account)*rate;
        }
        System.out.println(sum_account);
        //温度和风速转换
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        Scanner sc7 = new Scanner(System.in);
        double temperature = sc7.nextDouble();
        double Twc=35.74+0.6215*temperature-35.75*(Math.pow(6,0.16))+0.4275*temperature*(Math.pow(6,0.16));
        System.out.println(Twc);
    }
}
