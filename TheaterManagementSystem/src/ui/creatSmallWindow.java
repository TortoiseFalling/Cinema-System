package ui;

import javax.swing.*;

public interface creatSmallWindow  {
     static JFrame wimdow(){
        //创建窗口界面
        JFrame frame = new JFrame("小窗口界面");

        // 设置窗口大小和位置
        frame.setSize(603, 680);
        frame.setLocationRelativeTo(null); // 让窗口居中
        //设置关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //居中
        frame.setLocationRelativeTo(null);
        //置顶
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
        return frame;
    }
}
