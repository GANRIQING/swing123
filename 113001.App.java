public class App extends  R{
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.boy_filePath);
        System.out.println(app.girl_filePath);
        int[][] arr = app.array2d;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
