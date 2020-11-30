public class App implements R {
    public static void main(String[] args) {
        App app = new App();
        app.fun(app.boy_filePath,app.girl_filePath,app.arr);
    }
    @Override
    public void fun(String boy_filePath, String girl_filePath, int[][] arr) {
        System.out.println(boy_filePath);
        System.out.println(girl_filePath);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
