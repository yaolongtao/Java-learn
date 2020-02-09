package Object.demo1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author yaolongtao
 * @create 2020-01-18-14:08
 */
public class toString {
    public static void main(String[] args) {
        person p = new person("张三", 18);
        String s = p.toString();
        System.out.println(s);//Object.demo1.person@1540e19d
//直接打印对象的名字，其实就是调用对象的toString方法。
        System.out.println(p);
        Random r = new Random();
        System.out.println(r);
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

    }
}
