package ui;

import javax.swing.*;

public class managerFounctionWindow implements initWindow,creatSmallWindow{
    public static  void  managerFounctionWindow(){
        JFrame window = new JFrame("经理界面");
         window = initWindow.window(window);
         //添加背景
        window.setSize(1300,750);
        //添加背景
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\用户界面背景.png"));
        jLabel.setBounds(0,0,1300,750);
        window.getContentPane().add(jLabel);
        window.setVisible(true);
        initWindow.window(window);

        //设置功能界面


    }
}
