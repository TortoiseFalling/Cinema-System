package ui;
//1.0版本
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Test {

    //创建窗口
    static  JFrame jFrame = new JFrame("YX影院管理系统");//设置为成员变量
   static ArrayList<Admin> Admin = new ArrayList<>();
   static ArrayList<User> User = new ArrayList<>();

    public static void main(String[] args) {

        //初始化管理账号
        Admin manager = new Admin("jingli", "Lm.123456");//经理
        Admin admin = new Admin("gaunliyuan", "Lm.123456");//管理员
        Admin reception = new Admin("qiantai", "Lm.123456");//前台
        Admin.add(admin);
        Admin.add(manager);
        Admin.add(reception);
        //初始化用户
        User user1 = new User("张飞","666666");
        User user2 = new User("关羽","666666");
        User user3 = new User("刘备","666666");
        User.add(user1);
        User.add(user2);
        User.add(user3);

        //初始化入口
         entrance();
        //初始化按钮
        LoginBotton();
        reginsterBotton();
        //

    }

    //初始化入口
    public static void entrance(){

        //设置尺寸
        jFrame.setSize(1300,750);
        //设置置顶
        jFrame.setAlwaysOnTop(true);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //居中
        jFrame.setLocationRelativeTo(null);
        //取消默认居中
        jFrame.setLayout(null);

        //创建登录按钮(附带事件)
        LoginBotton();

        //创建注册按钮（附带事件）
        reginsterBotton();

        //添加背景图片
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\首页背景.png"));
        jLabel.setBounds(0,0,1290,750);
        jFrame.getContentPane().add(jLabel);
        //展示窗口
        jFrame.setVisible(true);

    }

    //初始化按钮
    //创建登录按钮
    public static void LoginBotton(){
        //创建按钮
        JButton jButton1 = new JButton("管理员系统登录");
        //设置宽高以及位置
        jButton1.setBounds(300,300,150,150);
        //添加事件
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("跳转到管理员登录界面");
                //关闭此页面
                jFrame.setVisible(false);
                //跳转到管理员登录界面
                AdminLoginWindow();

            }
        });
        //添加到窗口
        jFrame.getContentPane().add(jButton1);
    }
    //创建注册按钮
    public static void reginsterBotton(){
        //创建按钮
        JButton jButton2 = new JButton("用户登录");
        //设置宽高以及位置
        jButton2.setBounds(900,300,150,150);
        //添加事件
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("跳转到用户登录界面");
                //跳转到用户登录界面
                //关闭此页面
                jFrame.setVisible(false);
                //打开用户登录界面
                  UserLoginWindow();
            }
        });
        //添加到窗口
        jFrame.getContentPane().add(jButton2);
    }

    //用户登录界面
    public static void UserLoginWindow() {

        JFrame frame = new JFrame("用户登录界面");
        initwindow(frame);

        //给用户界面添加内容
        initUserView(frame);

        //添加背景
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\登录背景2.png"));
        jLabel.setBounds(0,0,603,680);
        frame.getContentPane().add(jLabel);

        // 设置窗口可见
        frame.setVisible(true);
    }

    //管理员登录界面
    public static void AdminLoginWindow(){

        //初始化界面
        JFrame frame = new JFrame("管理员系统登录界面");
        initwindow(frame);

        //给管理员界面添加内容
        initAdminView(frame);
        //添加背景
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\登录背景1.png"));
        jLabel.setBounds(0,0,603,680);
        frame.getContentPane().add(jLabel);


        // 设置窗口可见
        frame.setVisible(true);
    }

    //管理员界面功能
    public static void initAdminView( JFrame frame){
        // 创建用户名、密码、验证码的标签和文本框
        //用户名文本
        JLabel usernameLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\用户名.png"));
        usernameLabel.setBounds(50, 134, 200, 30);
        JTextField usernameField = new JTextField();

        //密码文本
        JLabel passwordLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\密码.png"));
        passwordLabel.setBounds(50, 195, 200, 30);
        JPasswordField passwordField = new JPasswordField();

        //验证码文本
        JLabel captchaLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\验证码.png"));
        captchaLabel.setBounds(50, 256, 200, 30);
        JTextField captchaField = new JTextField();

        // 设置文本框尺寸
        usernameField.setBounds(195, 134, 200, 30);
        passwordField.setBounds(195, 195, 200, 30);
        captchaField.setBounds(195, 256, 150, 30);

        // 设置布局为绝对定位，即取消默认居中
        frame.setLayout(null);

        // 将标签和文本框添加到窗口中
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(captchaLabel);
        frame.add(captchaField);

        //添加登录按钮和注册按钮
        //登录
        JButton login = new JButton();
        login.setBounds(123, 500, 128, 47);
        login.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\登录.png"));
        //去除边框
        login.setBorderPainted(false);
        //去除背景
        login.setContentAreaFilled(false);

        //给按钮添加事件
        //给登录按钮添加点击事件
        //对事件进行设计
        //只要一点击，就会依次获取用户输入的验证码，用户名和密码。逐一进行比较，注意，用户名和密码要判空
        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取验证码
                String Code = captchaField.getText();
                //获取用户名
                String username = usernameField.getText();
                //获取密码
                String password = passwordField.getText();
                System.out.println(Code);
                System.out.println(username);
                System.out.println(password);

                //判断
                int ret = checkAdmin(Admin,username,password,Code);
                switch (ret){
                    case 1:
                        JDialog jDialog = new JDialog(frame,"提示",true);
                        JPanel panel = new JPanel();
                        JLabel jLabel = new JLabel("验证码输入错误，请重新输入");
                        panel.add(jLabel);
                        jDialog.add(panel);
                        jDialog.setSize(300,150);
                        jDialog.setModal(true);
                        jDialog.setLocationRelativeTo(null);
                        jDialog.setVisible(true);
                        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        new adminFounctionWindow();
                        break;
                    case 2:
                        JDialog jDialog2 = new JDialog(frame,"提示",true);
                        JPanel panel2 = new JPanel();
                        JLabel jLabel2 = new JLabel("用户名或密码输入错误，请重新输入");
                        panel2.add(jLabel2);
                        jDialog2.add(panel2);
                        jDialog2.setSize(300,150);
                        jDialog2.setModal(true);
                        jDialog2.setLocationRelativeTo(null);
                        jDialog2.setVisible(true);
                        jDialog2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        new adminFounctionWindow();
                        break;
                    case 3:
                        JDialog jDialog3 = new JDialog(frame,"提示",true);
                        JPanel panel3 = new JPanel();
                        JLabel jLabel3 = new JLabel("登录成功！");
                        panel3.add(jLabel3);
                        jDialog3.add(panel3);
                        jDialog3.setSize(300,150);
                        jDialog3.setModal(true);
                        jDialog3.setLocationRelativeTo(null);
                        jDialog3.setVisible(true);
                        jDialog3.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        new adminFounctionWindow();
                        //登录成功以后，需要跳转到管理员所在的操作界面，进行相关操作
                        break;
                    default:
                        break;
                }
            }
        });
        //添加到界面
        frame.getContentPane().add(login);

        //注册按钮
        JButton reginster = new JButton();
        reginster.setBounds(323, 500, 128, 47);
        reginster.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\注册.png"));
        //去除边框
        reginster.setBorderPainted(false);
        //去除背景
        reginster.setContentAreaFilled(false);
        //添加到界面
        frame.getContentPane().add(reginster);




        //生成验证码提示
        //String codeStr = CodeUtil.getCode();
        JLabel rightCode = new JLabel();
        //设置验证码内容
        rightCode.setText("");
        //设置位置以及宽高
        rightCode.setBounds(350, 256, 50, 30);
        //添加到界面
        frame.getContentPane().add(rightCode);
    }

    //用户界面功能
    public static void initUserView( JFrame frame){
        // 创建用户名、密码、验证码的标签和文本框
        //用户名文本
        JLabel usernameLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\用户名.png"));
        usernameLabel.setBounds(50, 134, 200, 30);
        JTextField usernameField = new JTextField();

        //密码文本
        JLabel passwordLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\密码.png"));
        passwordLabel.setBounds(50, 195, 200, 30);
        JPasswordField passwordField = new JPasswordField();

        //验证码文本
        JLabel captchaLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\验证码.png"));
        captchaLabel.setBounds(50, 256, 200, 30);
        JTextField captchaField = new JTextField();

        // 设置文本框尺寸
        usernameField.setBounds(195, 134, 200, 30);
        passwordField.setBounds(195, 195, 200, 30);
        captchaField.setBounds(195, 256, 150, 30);

        // 设置布局为绝对定位，即取消默认居中
        frame.setLayout(null);

        // 将标签和文本框添加到窗口中
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(captchaLabel);
        frame.add(captchaField);

        //添加登录按钮和注册按钮
        //登录
        JButton login = new JButton();
        login.setBounds(123, 500, 128, 47);
        login.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\登录.png"));
        //去除边框
        login.setBorderPainted(false);
        //去除背景
        login.setContentAreaFilled(false);

        //给按钮添加事件
        //给登录按钮添加点击事件
        //对事件进行设计
        //只要一点击，就会依次获取用户输入的验证码，用户名和密码。逐一进行比较，注意，用户名和密码要判空
        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取验证码
                String Code = captchaField.getText();
                //获取用户名
                String username = usernameField.getText();
                //获取密码
                String password = passwordField.getText();
                System.out.println(Code);
                System.out.println(username);
                System.out.println(password);

                //判断
                int ret = checkUser(User,username,password,Code);
                switch (ret){
                    case 1:
                        JDialog jDialog = new JDialog(frame,"提示",true);
                        JPanel panel = new JPanel();
                        JLabel jLabel = new JLabel("验证码输入错误，请重新输入");
                        panel.add(jLabel);
                        jDialog.add(panel);
                        jDialog.setSize(300,150);
                        jDialog.setModal(true);
                        jDialog.setLocationRelativeTo(null);
                        jDialog.setVisible(true);
                        jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        new adminFounctionWindow();
                        break;
                    case 2:
                        JDialog jDialog2 = new JDialog(frame,"提示",true);
                        JPanel panel2 = new JPanel();
                        JLabel jLabel2 = new JLabel("用户名或密码输入错误，请重新输入");
                        panel2.add(jLabel2);
                        jDialog2.add(panel2);
                        jDialog2.setSize(300,150);
                        jDialog2.setModal(true);
                        jDialog2.setLocationRelativeTo(null);
                        jDialog2.setVisible(true);
                        jDialog2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        new adminFounctionWindow();
                        break;
                    case 3:
                        System.out.println(3);
                        JDialog jDialog3 = new JDialog(frame,"提示",true);
                        JPanel panel3 = new JPanel();
                        JLabel jLabel3 = new JLabel("登录成功！");
                        panel3.add(jLabel3);
                        jDialog3.add(panel3);
                        jDialog3.setSize(300,150);
                        jDialog3.setModal(true);
                        jDialog3.setLocationRelativeTo(null);
                        jDialog3.setVisible(true);
                        jDialog3.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        new adminFounctionWindow();

                        new adminFounctionWindow();
                        break;
                    default:
                        break;
                }
            }
        });
        //添加到界面
        frame.getContentPane().add(login);

        //注册按钮
        JButton reginster = new JButton();
        reginster.setBounds(323, 500, 128, 47);
        reginster.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\注册.png"));
        //去除边框
        reginster.setBorderPainted(false);
        //去除背景
        reginster.setContentAreaFilled(false);
        //添加到界面
        frame.getContentPane().add(reginster);


        //生成验证码提示
        //String codeStr = CodeUtil.getCode();
        JLabel rightCode = new JLabel();
        //设置验证码内容
        rightCode.setText("256781");
        //设置位置以及宽高
        rightCode.setBounds(350, 256, 50, 30);
        //添加到界面
        frame.getContentPane().add(rightCode);


    }

    //初始化窗口
    public static void initwindow( JFrame frame){
        // 设置窗口大小和位置
        frame.setSize(603, 680);
        frame.setLocationRelativeTo(null); // 让窗口居中
        //设置关闭模式
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //居中
        frame.setLocationRelativeTo(null);
        //置顶
        frame.setAlwaysOnTop(true);

        //添加背景
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\登录背景2.png"));
        jLabel.setBounds(0,0,603,680);
        jFrame.getContentPane().add(jLabel);
        jFrame.setVisible(true);
    }

    //判断账号
    public static int checkAdmin(ArrayList<Admin> list,
                                 String username,
                                 String password,
                                 String code) {

        if (code.equals("256781")) {//先判断验证码

            for ( Admin admin : list) {
                if ( admin.getName().equals(username) && admin.getPassword().equals(password)) {
                    return 3; // 找到匹配的成员，返回 true
                }
            }
            return 2; // 没有找到匹配的成员，返回 false
        } else return 1;//如果不相等，直接返回验证码错误
    }
    //判断账号
    public static int checkUser(ArrayList<User> list,
                                String username,
                                String password,
                                String code) {

        if (code.equals("256781")) {//先判断验证码

            for ( User users : list) {
                if ( users.getName().equals(username) && users.getPassword().equals(password)) {
                    return 3; // 找到匹配的成员，返回 true
                }
            }
            return 2; // 没有找到匹配的成员，返回 false
        } else return 1;//如果不相等，直接返回验证码错误
    }
}
