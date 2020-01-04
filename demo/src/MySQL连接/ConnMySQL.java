package MySQL连接;

import java.sql.*;

/**
 * @author yaolongtao
 * @create 2020-01-04-16:32
 */
public class ConnMySQL {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            // 加载驱动类
            Class.forName("com.mysql.jdbc.Driver");
            long start = System.currentTimeMillis();

            // 建立连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo_test",
                    "root", "admin");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("建立连接耗时： " + (end - start) + "ms 毫秒");

            // 创建Statement对象
            Statement stmt = conn.createStatement();

            // 执行SQL语句
            ResultSet rs = stmt.executeQuery("select * from t_user");
            System.out.println("id\tusername\tpwd\t\tregTime");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2)
                        + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}