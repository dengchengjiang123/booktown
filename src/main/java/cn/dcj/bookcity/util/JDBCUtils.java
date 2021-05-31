package cn.dcj.bookcity.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    //jdbc连接词工具类
    /*
	1. 声明静态数据源成员变量
	2. 创建连接池对象
	3. 定义公有的得到数据源的方法
	4. 定义得到连接对象的方法
	5. 定义关闭资源的方法
 */
//    1. 声明静态数据源成员变量
    private static DataSource ds;
    //2.创建连接词对像再static方法
    static {
        //2.1加载配置文件
        Properties pro = new Properties();
        //2.2利用类加载器获取数据的位置
        InputStream ism = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
        try {
            pro.load(ism);
            //创建连接词，使用配置文件中的参数
            ds= DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //3.定义共有的数据源方法
    public static DataSource getDs(){
        return ds;
    }
    //4.定义得到连接对象的方法
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
    //5.定义关闭资源的方法
    public static  void close(Connection conn, Statement stmt, ResultSet rs){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException throwables) {

            }
        }
        if (stmt!=null){
            try {
                stmt.close();
            } catch (SQLException throwables) {

            }
        }
        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException throwables) {

            }
        }
    }

}
