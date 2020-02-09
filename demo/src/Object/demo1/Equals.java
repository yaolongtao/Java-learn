package Object.demo1;

/**
 * @author yaolongtao
 * @create 2020-02-09-10:32
 */
public class Equals {
    public static void main(String[] args) {
//        boolean equals(Object obj)指示其它某个对象是否与此对象相等
        person p1 = new person("古力娜扎", 30);
        person p2 = new person("古力娜扎", 30);
        System.out.println(p1);
        System.out.println(p2);
        boolean b = p1.equals(p2);
        System.out.println(b);
    }
}
