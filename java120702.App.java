public class App {
    public static void main(String[] args) {
        int array2d[][]={
            {1,2,3,4,5,6},
            {7,8,9,10,0,12},
            {7,8,9,10,11,12},
            {7,8,9,10,11,12},
            {88,66,92,102,151,999}
        };
        Find2 find2 = new Find2();
        find2.findZero(array2d);
        int x = find2.R_zero_x;
        int y = find2.R_zero_y;
        find2.findLeft(x,y);
        find2.findRight(x,y,array2d);
        find2.findUp(x,y);
        find2.findDown(x,y,array2d);
    }
}
