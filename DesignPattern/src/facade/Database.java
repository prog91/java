package facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

	private Database() {
	}
	
	public static Properties getProperties(String dbname) throws IOException {
		String filename ="D:\\eclipse_workspace\\DesignPattern\\src\\facade\\Database.java";
		Properties prop = new Properties();
		prop.load(new FileInputStream(filename));
		return prop;
	}
	
}
