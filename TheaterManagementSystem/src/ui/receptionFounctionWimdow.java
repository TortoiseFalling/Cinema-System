package ui;

import javax.swing.*;

public class receptionFounctionWimdow implements initWindow,creatSmallWindow{
    public static  void receptionFounctionWimdow(){
        JFrame window = new JFrame("前台");
         window = initWindow.window(window);
       //设置界面
        window.setSize(1300,750);
        //添加背景
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\用户界面背景.png"));
        jLabel.setBounds(0,0,1300,750);
        window.getContentPane().add(jLabel);
        window.setVisible(true);
        initWindow.window(window);
        //设置界面


    }
}
