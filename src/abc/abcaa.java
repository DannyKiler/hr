package abc;
import java.sql.Connection;
import java.sql.DriverManager; 
public class abcaa {
    private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver" ;
    private static final String DBURL = "jdbc:oracle:thin:@//localhost:1521/mldn" ;
    private static final String USER = "c##scott" ;
    private static final String PASSWORD = "tiger" ;
    public static void main(String[] args) throws Exception {
        // ��һ�����������ݿ��������򣬴�ʱ����Ҫʵ��������Ϊ���������Լ��������
        Class.forName(DBDRIVER) ;
        // �ڶ�������������Э�顢�û����������������ݿ�
        Connection conn = DriverManager.getConnection(DBURL, USER, PASSWORD) ;
        System.out.println(conn);		// ������ݿ�����
        conn.close();					// ���Ĳ����ر����ݿ�
    }
}




	  
		
	
		



