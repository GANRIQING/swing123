public class App extends Thread {
    public static void main(String[] args) {
        System.out.println("每秒输出一个随机坐标：");
        while (true){
            System.out.println("("+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
