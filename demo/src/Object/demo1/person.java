package Object.demo1;

import java.util.Objects;

/**
 * @author yaolongtao
 * @create 2020-01-18-13:54
 */
public class person {
    private String name;
    private int age;

    public person() {
    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* public String toString(){
         return "person{name="+name+",age="+age+"}";
     }
 */

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof person) {
            person p = (person) obj;
            boolean b = this.name.equals(p.name) && this.age == p.age;
            return b;
        }
        return false;
    }
}
