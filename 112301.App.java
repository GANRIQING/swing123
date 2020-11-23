import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true){
           if(n==1){
	            int x = (int)(Math.random()*100);
	            int y = (int)(Math.random()*100);
                System.out.println("("+x+","+y+")");
           }
        }
    }
}
