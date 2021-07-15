import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ship ship = new Ship();
		
        int s1 = 3;
        int s2 = 3;
        int s3 = 3;
System.out.println(ss1);
        int num = 0;
        while(s1 != 0 || s2 != 0 || s3 != 0){
            num++;
            System.out.println("--------------[ターン"+num+"]--------------");

            ship.dispb();

            System.out.println("爆弾のx座標を入力してください(1-5)");
            int x = sc.nextInt();
            System.out.println("爆弾のy座標を入力してください(1-5)");
            int y = sc.nextInt();

            ship.dispa();
        }
    }
}