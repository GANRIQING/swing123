public class Find {

    public void findZero(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 0){
                    System.out.println("找到了真爱：（"+i+","+j+")");
                }
            }
        }
    }
}
