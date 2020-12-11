import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    int map[][]={
            {1,3,2},
            {4,7,6},
            {9,8,5},
            {11,10,0}
    };
    static int[][] result = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,0}
    };
    int step = 0;
    int cell=128;
    List<JLabel> label_list=new ArrayList<>();
    //构造方法
    public App() {
//网格
        myPanel.setFocusable(true);
        label_txt.setText("步数："+step);
        label_txt.setFont(new Font("宋体",Font.BOLD,20));
        label_txt.setForeground(Color.red);
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        java.net.URL imgURL999 = App.class.getResource("img/foreground.png");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,384,512);
        myPanel.add(label_foreground);
        //图片赋值
        pictureAssignment(map,label_list,myPanel,cell);
        //移动矩阵
        Zero zero = new Zero();
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    step = zero.goUp(map,step);
                    label_txt.setText("步数："+step);
                    pictureAssignment(map,label_list,myPanel,cell);
                }
                if (e.getKeyCode()==e.VK_DOWN){
                    step = zero.goDown(map,step);
                    label_txt.setText("步数："+step);
                    pictureAssignment(map,label_list,myPanel,cell);
                }
                if (e.getKeyCode()==e.VK_LEFT){
                    step = zero.goLeft(map,step);
                    label_txt.setText("步数："+step);
                    pictureAssignment(map,label_list,myPanel,cell);
                }
                if (e.getKeyCode()==e.VK_RIGHT){
                    step = zero.goRight(map,step);
                    label_txt.setText("步数："+step);
                    pictureAssignment(map,label_list,myPanel,cell);
                }
            }
        });
    }
    //图片赋值
    static void  pictureAssignment(int[][] map,List<JLabel> label_list, JPanel myPanel,int cell){
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(map[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
            }
        }
        if (isSuccess(map,result)){
            JOptionPane.showMessageDialog(new App().myPanel,"恭喜你通关！");
        }
    }
    //判断是否通关
    static boolean isSuccess(int[][] map,int[][] result){
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j]==result[i][j]){
                    if (i==map.length-1 && j == map[0].length-1){
                        return true;
                    }
                    continue;
                }else {
                    return false;
                }
            }
        }
        return false;
    }
    //显示窗体方法
    void go(){


        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,150,384,530);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);//禁止用户修改大小
    }
    public static void main(String[] args) {
        new App().go();
    }
}
