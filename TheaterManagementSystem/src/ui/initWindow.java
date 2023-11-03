package ui;

import javax.swing.*;

public interface initWindow   {

     static JFrame window(  JFrame jFrame) {

        //初始化界面
            //设置置顶
            jFrame.setAlwaysOnTop(true);
            //设置关闭模式
            jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            //居中
            jFrame.setLocationRelativeTo(null);
            //取消默认居中
            jFrame.setLayout(null);
            //展示窗口
            jFrame.setVisible(true);

        return jFrame;
    }

}
