package Object.demo1;

import java.util.Objects;

/**
 * @author yaolongtao
 * @create 2020-02-09-11:16
 */
public class DemoObjects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "ylt";
//        boolean b=s1.equals(s2);
        boolean b2 = Objects.equals(s1, s2);
//        System.out.println(b);
        System.out.println(b2);
    }
}
