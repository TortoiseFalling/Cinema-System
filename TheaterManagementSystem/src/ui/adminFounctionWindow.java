package ui;


import javax.swing.*;

//管理员界面
public class adminFounctionWindow implements initWindow,creatSmallWindow{
        //空参初始化
     public static  void adminFounctionWindow(){
         JFrame window = new JFrame("管理员界面");
         window = initWindow.window(window);
         //设置功能界面
         //创建窗口
         window.setSize(1300,750);
         //添加背景
         JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\用户界面背景.png"));
         jLabel.setBounds(0,0,1300,750);
         window.getContentPane().add(jLabel);
         window.setVisible(true);
         initWindow.window(window);

     }
}

