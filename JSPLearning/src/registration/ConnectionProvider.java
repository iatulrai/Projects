package registration;

import java.sql.Connection;
import java.sql.DriverManager;

import static registration.Provider.*;

public class ConnectionProvider {

	private static Connection con = null;

	static {

		try {

			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONNECTION_URL, USERNAME,
					PASSWORD);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}

}
