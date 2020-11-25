import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public App() {
        textArea_A.setText("点击上↑键输出文字");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.orange);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.red);
        myPanel.add(textArea_B);

        textArea_A.setText("广科师谁最骚？");

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if(textArea_A.getText().equals("远敬！")){
                        textArea_B.setText("回答正确！");
                    }else {
                        textArea_B.setText("丑拒！");
                    }
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("窗体123456");
        myPanel.setLayout(null);
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
