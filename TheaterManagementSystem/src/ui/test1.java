package ui;
//调试测试类
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public  class test1 extends JFrame{
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

    public static void main(String[] args) {
        System.out.println(getCode());

        String code1 = getCode();
        boolean ret = getCode().equals(code1);
        System.out.println(ret);

        //new UserFounctionWindow().UserFounctionWindow();
    }

}
