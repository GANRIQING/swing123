import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    List<JLabel> list = new ArrayList<>();

    public App(){
        list.add(new JLabel());
        list.add(new JLabel());
        list.add(new JLabel());
        java.net.URL ballURL1 = App.class.getResource("img/ball.png");
        list.get(0).setIcon(new ImageIcon(ballURL1));
        list.get(0).setBounds(0,100,164,164);
        myPanel.add(list.get(0));
        list.get(1).setIcon(new ImageIcon(ballURL1));
        list.get(1).setBounds(65,100,164,164);
        myPanel.add(list.get(1));
        list.get(2).setIcon(new ImageIcon(ballURL1));
        list.get(2).setBounds(128,100,164,164);
        myPanel.add(list.get(2));
    }
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
