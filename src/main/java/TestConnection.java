import java.sql.Connection;

import com.reddy.util.ConnectionUtil;



public class TestConnection {
	   public static void main(String[] args) throws Exception {
     	  Connection con=ConnectionUtil.getConnectionUtil();
			System.out.println(con);
		}

}
