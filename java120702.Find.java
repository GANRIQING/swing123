public class Find {
    static int R_zero_x = 0;
    static int R_zero_y = 0;

    public void findZero(int[][] array2d){
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                if (array2d[i][j] == 0) {
                    R_zero_x = j;
                    R_zero_y = i;
                    System.out.println("R_zero("+j+","+i+")");
                }
            }
        }
    }
    public void findLeft(int x, int y){
        if (x<=0){
            System.out.println("R_left("+x+","+y+")");
        }else {
            System.out.println("R_left("+(x-1)+","+y+")");
        }
    }
    public void findRight(int x, int y,int[][] array2d){
        if (x>=(array2d[0].length-1)){
            System.out.println("R_right("+x+","+y+")");
        }else {
            System.out.println("R_right("+(x+1)+","+y+")");
        }
    }
    public void findUp(int x, int y){
        if (y<=0){
            System.out.println("R_up("+x+","+y+")");
        }else {
            System.out.println("R_up("+x+","+(y-1)+")");
        }
    }
    public void findDown(int x, int y, int[][] array2d){
        if (y>=(array2d.length-1)){
            System.out.println("R_down("+x+","+y+")");
        }else {
            System.out.println("R_down("+x+","+(y+1)+")");
        }
    }
}
