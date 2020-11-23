import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //输入坐标数
        int n = sc.nextInt();
        while (n>0){
            int x = (int)(Math.random()*100);
            int y = (int)(Math.random()*100);
            System.out.println("("+x+","+y+")");
            n--;
        }
    }
}
