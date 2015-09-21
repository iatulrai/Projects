package registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	public static boolean validate(LoginBean bean){
		boolean status = false;
		
		try {
			
			Connection con = ConnectionProvider.getCon();
			
			PreparedStatement ps = con.prepareStatement("select * from DETAIL where email=? and pass=?");
			
			ps.setString(1, bean.getEmail());
			ps.setString(2, bean.getPass());
			
			ResultSet rs = ps.executeQuery();
			
			status = rs.next();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}

}
