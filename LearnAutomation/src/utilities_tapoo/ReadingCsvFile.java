package utilities_tapoo;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadingCsvFile {

	 public static void main(String[] args) throws Exception {
         String splitBy = ",";
 BufferedReader br = new BufferedReader(new FileReader("D:\\Laadoo\\LearnAutomation\\src\\utilities_tapoo\\test.csv.txt"));
 String line = br.readLine();
 while ((line = br.readLine()) !=null){
      String[] b = line.split(splitBy);
      System.out.println(b[0] +"\t" + b[1] +"\t" +b[2] +"\t" +b[3] +"\t" + b[4]+ "\t" + b[5]+ "\t" + b[6]);
 }
 br.close();

}
}