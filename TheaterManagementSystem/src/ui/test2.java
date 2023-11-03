package ui;
//2.0版本
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

public class test2  implements initWindow,creatSmallWindow{
    //定义判断常量
    public static final int MATCH_SUCCESS = 3;
    public static final int MATCH_FAULT = 2 ;
    public static final int CODE_FAULT = 1;

    //创建窗口
    static  JFrame jFrame = new JFrame("YX影院管理系统");//设置为成员变量
    static ArrayList<Admin> admins = new ArrayList<>();

    static ArrayList<manager> managers = new ArrayList<>();

    static ArrayList<reception> receptions = new ArrayList<>();

    static ArrayList<User> User = new ArrayList<>();

    public static void main(String[] args) {

            //初始化管理账号
            manager manager1 = new manager("jingli", "Lm.123456");//经理
            Admin admin1 = new Admin("guanliyuan", "Lm.123456");//管理员
            reception reception1 = new reception("qiantai", "Lm.123456");
            admins.add(admin1);
            managers.add(manager1);
            receptions.add(reception1);


            //初始化用户
            User user1 = new User("张飞", "666666");
            User user2 = new User("关羽", "666666");
            User user3 = new User("刘备", "666666");
            User.add(user1);
            User.add(user2);
            User.add(user3);

            //初始化入口
            entrance();

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

        //初始化登录窗口
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

        //初始化管理员登录界面
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

            //给登录按钮添加点击事件
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
                    int adminsAccountNumber = checkAdmin(admins,username,password,Code);
                    int mangerAccountNumber = checkmanger(managers,username,password,Code);
                    int receptionsAccountNumber = checkreception(receptions,username,password,Code);
                    int result ;
                    if(adminsAccountNumber == MATCH_SUCCESS || mangerAccountNumber == MATCH_SUCCESS || receptionsAccountNumber == MATCH_SUCCESS){
                        result = MATCH_SUCCESS;
                    }
                    else if(adminsAccountNumber == CODE_FAULT|| mangerAccountNumber == CODE_FAULT || receptionsAccountNumber == CODE_FAULT){
                        result =CODE_FAULT;
                    }
                    else {
                        result = MATCH_FAULT;
                    }

                    switch (result){
                        case CODE_FAULT:
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
                            break;
                        case MATCH_FAULT:
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
                            break;
                        case MATCH_SUCCESS:
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
                            //登录成功以后，需要跳转到管理员所在的操作界面，进行相关操作
                            //同时，还需要根据登录的管理员类型进入不同的操作界面

                            //拿到其登录的账号和和密码，在每一个账号密码库里进行检索，属于那个类型就进入那个类型的操作系统
                            if(adminsAccountNumber == MATCH_SUCCESS){
                                //进入管理员界面
                                adminFounctionWindow.adminFounctionWindow();
                            } else if (mangerAccountNumber == MATCH_SUCCESS) {
                                //进入经理界面
                                 managerFounctionWindow.managerFounctionWindow();
                            }
                            else {
                                //进入前台界面
                                receptionFounctionWimdow.receptionFounctionWimdow();
                            }
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

            //添加注册按钮事件

            //添加事件，即跳转到邮箱找回密码
            reginster.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog jDialog = new JDialog(frame,"提示",true);
                    JPanel panel = new JPanel();
                    JLabel jLabel = new JLabel("注册账号密码，如果只是在终端用集合创建几个用户存储在文件" +
                            "然后再自己登录，自娱自乐，没意思，一点用处都没有，不如不做");
                    panel.add(jLabel);
                    jDialog.add(panel);
                    jDialog.setSize(700,150);
                    jDialog.setModal(true);
                    jDialog.setLocationRelativeTo(null);
                    jDialog.setVisible(true);
                    jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
            });

            //生成验证码提示
            //String codeStr = CodeUtil.getCode();
            JLabel rightCode = new JLabel();
            //设置验证码内容
            rightCode.setText(getCode());
            //设置位置以及宽高
            rightCode.setBounds(350, 256, 50, 30);
            //添加到界面
            frame.getContentPane().add(rightCode);

            //忘记密码提示
            JButton forgetPassword = new JButton();
            forgetPassword.setBounds(200, 300, 150, 50);
            forgetPassword.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\忘记密码.png"));
            //去除边框
            forgetPassword.setBorderPainted(false);
            //去除背景
            forgetPassword.setContentAreaFilled(false);
            //添加到界面
            frame.getContentPane().add(forgetPassword);
            //添加事件，即跳转到邮箱找回密码
            forgetPassword.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog jDialog = new JDialog(frame,"提示",true);
                    JPanel panel = new JPanel();
                    JLabel jLabel = new JLabel("根据邮箱找回密码，具体和邮箱产生联系，学生目前水平尚不能完成！");
                    panel.add(jLabel);
                    jDialog.add(panel);
                    jDialog.setSize(400,150);
                    jDialog.setModal(true);
                    jDialog.setLocationRelativeTo(null);
                    jDialog.setVisible(true);
                    jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                }
            });

        }

         //初始化用户登录界面
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

        //给登录按钮添加点击事件
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
                    case CODE_FAULT:
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

                        break;
                    case MATCH_FAULT:
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

                        break;
                    case MATCH_SUCCESS:
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
                        new UserFounctionWindow().UserFounctionWindow();

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

             //添加事件
             reginster.addActionListener(new AbstractAction() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     JDialog jDialog = new JDialog(frame,"提示",true);
                     JPanel panel = new JPanel();
                     JLabel jLabel = new JLabel("注册账号密码，如果只是在终端用集合创建几个用户存储在文件" +
                             "然后再自己登录，自娱自乐，没意思，一点用处都没有，不如不做");
                     panel.add(jLabel);
                     jDialog.add(panel);
                     jDialog.setSize(700,150);
                     jDialog.setModal(true);
                     jDialog.setLocationRelativeTo(null);
                     jDialog.setVisible(true);
                     jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                 }
             });


             //生成验证码提示
        JLabel rightCode = new JLabel();
        //设置验证码内容
        rightCode.setText(getCode());
        //设置位置以及宽高
        rightCode.setBounds(350, 256, 50, 30);
        //添加到界面
        frame.getContentPane().add(rightCode);

             //忘记密码提示
             JButton forgetPassword = new JButton();
             forgetPassword.setBounds(200, 300, 150, 50);
             forgetPassword.setIcon(new ImageIcon("C:\\Users\\27398\\IdeaProjects\\java\\TheaterManagementSystem\\src\\忘记密码.png"));
             //去除边框
             forgetPassword.setBorderPainted(false);
             //去除背景
             forgetPassword.setContentAreaFilled(false);
             //添加到界面
             frame.getContentPane().add(forgetPassword);
             //添加事件，即跳转到邮箱找回密码
             forgetPassword.addActionListener(new AbstractAction() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     JDialog jDialog = new JDialog(frame,"提示",true);
                     JPanel panel = new JPanel();
                     JLabel jLabel = new JLabel("根据邮箱找回密码，具体和邮箱产生联系，学生目前水平尚不能完成！");
                     panel.add(jLabel);
                     jDialog.add(panel);
                     jDialog.setSize(400,150);
                     jDialog.setModal(true);
                     jDialog.setLocationRelativeTo(null);
                     jDialog.setVisible(true);
                     jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                 }
             });


         }

        //随机验证码生成器
    public static  String getCode(){
        //创建一个集合添加所有的大小写字母
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));
            list.add((char)('A'+i));
        }
        //拼接字符
        StringBuilder sb  = new StringBuilder();
        //随机获得四个字符
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int index = random.nextInt(list.size());
            //利用随机索引获取字符
            char c = list.get(index);
            //把随机字符添加到sb字符串中
            sb.append(c);
        }
        //添加一个随机数字到
        int number = random.nextInt(10);
        sb.append(number);

        //将数字变成可以出现在任意位置，增强其验证能力
        //但是字符串不可变，可以将之变成字符数组，再修改
        char[] arr = sb.toString().toCharArray();
        int randomIndex = random.nextInt(arr.length - 1);//获取随机索引，进行交换
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length -1];
        arr[arr.length -1 ] = temp;
        return new String(arr);//再将之变成字符串
    }



    //因为对判断的账号属性不同，用户和管理员需要分别书写
    //判断管理员账号
    public static int checkAdmin(ArrayList<Admin> list,
                                 String username,
                                 String password,
                                 String code) {

        if (code.equals(code)) {//先判断验证码

            for (Admin admin : list) {
                if (admin.getName().equals(username) && admin.getPassword().equals(password)) {//判断用户名和密码
                    return MATCH_SUCCESS; // 找到匹配的成员，返回 true
                }
            }
            return MATCH_FAULT; // 没有找到匹配的成员，返回 false
        } else return CODE_FAULT;//判断验证码，返回验证码错误
    }
    //判断经理账号
    public static int checkmanger(ArrayList<manager> list,
                                 String username,
                                 String password,
                                 String code) {

        if (code.equals(code)){//先判断验证码

            for (Admin admin : list) {
                if (admin.getName().equals(username) && admin.getPassword().equals(password)) {
                    return MATCH_SUCCESS; // 找到匹配的成员，返回 true
                }
            }
            return MATCH_FAULT; // 没有找到匹配的成员，返回 false
        } else return CODE_FAULT;//验证码匹配失败，直接返回验证码错误
    }
    //判断前台账号
    public static int checkreception(ArrayList<reception> list,
                                 String username,
                                 String password,
                                 String code) {

        if (code.equals(code)){//先判断验证码

            for (Admin admin : list) {
                if (admin.getName().equals(username) && admin.getPassword().equals(password)) {
                    return MATCH_SUCCESS; // 找到匹配的成员，返回 true
                }
            }
            return MATCH_FAULT; // 没有找到匹配的成员，返回 false
        } else return CODE_FAULT;//验证码匹配失败，直接返回验证码错误
    }

        //判断用户账号
         public static int checkUser(ArrayList<User> list,
                                String username,
                                String password,
                                String code) {


        if (code.equals(code)) {//先判断验证码，注意，这里要确保输入的和生成的验证码是同一个
            for (User users : list) {
                if (users.getName().equals(username) && users.getPassword().equals(password)) {
                    return MATCH_SUCCESS; // 找到匹配的成员，返回 true
                }
            }
            return MATCH_FAULT; // 没有找到匹配的成员，返回 false
        } else return CODE_FAULT;//验证码匹配失败，直接返回验证码错误
    }

}


