package utilities_tapoo;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\Laadoo\\LearnAutomation\\src\\utilities_tapoo\\db.properties.txt");
		Properties p = new Properties();
		p.load(fr); 
		/*String reslt= p.getProperty("user");
		System.out.println(reslt); */
		System.out.println(p.getProperty("drpdwn_leadset1")); 
		System.out.println(p.getProperty("drpdwn_leadset2")); 
		System.out.println(p.getProperty("drpdwn_leadset3")); 
		System.out.println(p.getProperty("drpdwn_leadset4")); 
		 
		String value= "XPATH";
		switch(value){
		case "XPATH": System.out.println("Case xpath");
		break;
		case "CSS": System.out.println("Case css");
		break;
		case "CLASS": System.out.println("Case class");
		break;
		case "ID": System.out.println("Case id");
		break;
		default:  System.out.println("NA");
		break;
			
		}
	}
}