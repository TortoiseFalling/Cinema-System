package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UserFounctionWindow implements initWindow,creatSmallWindow{


    //添加菜单
    public void addMenu(JFrame jFrame){
        JMenuBar JMenuBar = new JMenuBar();

        JMenu cinemaName = new JMenu("    XY影院    ");
        JMenu homePagejMenu = new JMenu("    首页   ");
        JMenu allFilmjMenu = new JMenu("    所有电影    ");
        JMenu classifyjMenu = new JMenu("    电影分类    ");
        JMenu MemberCenterjMenu = new JMenu("    会员中心    ");
        JMenu personalCenterjMenu = new JMenu("    个人中心    ");
        JMenuBar.add(cinemaName);
        JMenuBar.add(homePagejMenu);
        JMenuBar.add(allFilmjMenu);
        JMenuBar.add(classifyjMenu);
        JMenuBar.add(MemberCenterjMenu);
        JMenuBar.add(personalCenterjMenu);

        JMenuItem  newFilm = new JMenuItem("最新");
        JMenuItem  science = new JMenuItem("科幻");
        JMenuItem  panic = new JMenuItem("惊悚");
        JMenuItem  comedy = new JMenuItem("喜剧");
        JMenuItem  suspense = new JMenuItem("悬疑");
        JMenuItem  war = new JMenuItem("战争");
        JMenuItem  more = new JMenuItem("更多");

        classifyjMenu.add(newFilm);
        classifyjMenu.add(science);
        classifyjMenu.add(panic);
        classifyjMenu.add(comedy);
        classifyjMenu.add(suspense);
        classifyjMenu.add(war);
        classifyjMenu.add(more);

        jFrame.setJMenuBar(JMenuBar);
    }

    //添加搜索框
    public void addsearchframe(JFrame jFrame){
        //搜索框应该是一个事件触发，搜索的内容对数据库进行检索，而后跳转到相应界面
        //搜索框文本
        JTextField search = new JTextField();
        search.setBounds(50,50,400,45);
        jFrame.getContentPane().add(search);
        //添加搜索按钮
        JButton searchJButton = new JButton();
        searchJButton.setBounds(410,50, 128, 47);
        searchJButton.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\搜索框.png"));
        //去除边框
        searchJButton.setBorderPainted(false);
        //去除背景
        searchJButton.setContentAreaFilled(false);
        jFrame.getContentPane().add(searchJButton);

        //添加事件
        searchJButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog jDialog2 = new JDialog(jFrame,"提示",true);
                JPanel panel2 = new JPanel();
                JLabel jLabel2 = new JLabel("对数据库搜索，如果有，跳转到相应影片信息,但是目前以学生水平尚做不出来....");
                panel2.add(jLabel2);
                jDialog2.add(panel2);
                jDialog2.setSize(500,100);
                jDialog2.setModal(true);
                jDialog2.setLocationRelativeTo(null);
                jDialog2.setVisible(true);
                jDialog2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        });

    }

    //添加热映影片宣传
    public void addFilm(JFrame jFrame){

        //第一部电影
        JButton chooseButton = new JButton();
        chooseButton.setBounds(100,300, 110, 40);
        chooseButton.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\选座购票.png"));
        //去除边框
        chooseButton.setBorderPainted(false);
        //去除背景
        chooseButton.setContentAreaFilled(false);
        jFrame.getContentPane().add(chooseButton);
        //添加事件
        chooseButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame chooseSite = new JFrame("影厅选择座位");
                chooseSite.setBounds(0,0,1300,750);
                initWindow.window(chooseSite);
                chooseSite.setVisible(true);

                //添加影厅
                JMenuBar house = new JMenuBar();
                System.out.println("当点击相应影厅时，就会跳转到相应影厅，显示相应的座位情况");
                JMenu  house1 = new JMenu("一号影厅");
                //当点击相应影厅时，就会跳转到相应影厅，显示相应的座位情况
                JMenu  house2 = new JMenu("二号影厅");
                JMenu  house3 = new JMenu("三号影厅");
                house.add(house1);
                house.add(house2);
                house.add(house3);
                chooseSite.setJMenuBar(house);

                //初始化座位
                //每个座位是一个图片
                //用二维数组存储位置，数据存储的是座位图标，记录座位的状态


            }
        });

        jFrame.getContentPane().add(chooseButton);
        JLabel film1 = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\风神.png"));
        film1.setBounds(100,300,238,380);
        jFrame.getContentPane().add(film1);



        //第二部电影
        JButton choose2Button = new JButton();
        choose2Button.setBounds(338,300, 110, 40);
        choose2Button.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\选座购票.png"));
        //去除边框
        choose2Button.setBorderPainted(false);
        //去除背景
        choose2Button.setContentAreaFilled(false);
        jFrame.getContentPane().add(choose2Button);

        //添加事件
        choose2Button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame chooseSite = new JFrame("影厅选择座位");
                chooseSite.setBounds(0,0,1300,750);
                initWindow.window(chooseSite);
                chooseSite.setVisible(true);

                //添加影厅
                JMenuBar house = new JMenuBar();
                System.out.println("当点击相应影厅时，就会跳转到相应影厅，显示相应的座位情况");
                JMenu  house1 = new JMenu("一号影厅");
                //当点击相应影厅时，就会跳转到相应影厅，显示相应的座位情况
                JMenu  house2 = new JMenu("二号影厅");
                JMenu  house3 = new JMenu("三号影厅");
                house.add(house1);
                house.add(house2);
                house.add(house3);
                chooseSite.setJMenuBar(house);

            }
        });

        JLabel film2 = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\志愿军.png"));
        film2.setBounds(338,300,238,380);
        jFrame.getContentPane().add(film2);


    }

    public void UserFounctionWindow(){

        //创建窗口
        JFrame window = new JFrame("用户操作界面");
        window.setSize(1300,750);
        //添加搜索框
        addsearchframe(window);

        //添加菜单
        addMenu(window);

        //添加影片
        addFilm(window);

        //添加背景
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\用户界面背景.png"));
        jLabel.setBounds(0,0,1300,750);
        window.getContentPane().add(jLabel);
        initWindow.window(window);
        window.setVisible(true);

    }
}

