package abc;
import java.sql.Connection;
import java.sql.DriverManager; 
public class abcaa {
    private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver" ;
    private static final String DBURL = "jdbc:oracle:thin:@//localhost:1521/mldn" ;
    private static final String USER = "c##scott" ;
    private static final String PASSWORD = "tiger" ;
    public static void main(String[] args) throws Exception {
        // 第一步：加载数据库驱动程序，此时不需要实例化，因为会由容器自己负责管理
        Class.forName(DBDRIVER) ;
        // 第二步：根据连接协议、用户名、密码连接数据库
        Connection conn = DriverManager.getConnection(DBURL, USER, PASSWORD) ;
        System.out.println(conn);		// 输出数据库连接
        conn.close();					// 第四步：关闭数据库
    }
}




	  
		
	
		



