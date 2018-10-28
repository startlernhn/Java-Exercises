package java1.slide2;

import java.text.SimpleDateFormat;
import java.util.Date;

//Co nhieu format de hien thi date sang string. Format type goi la pattern. Vi du:
//	dd/MM/yy hoac dd/MM/yyyy
//	MM/dd/yyyy
//	dd-M-yyyy
//	dd MM yyyy zzzz (zzzz la location time)
//	E, dd MM yyyy HH:mm:ss z  (E la thu trong tuan, H la gio trong 24g, h la gio trong am/pm
//	E, dd MM yy hh:mm:ss z

public class MoreFormatTypeDateToString {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("strDate with pattern dd/MM/yyyy \t" + formatter.format(currentDate));
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println("strDate with pattern MM/dd/yyyy \t" + formatter.format(currentDate));
		
		formatter = new SimpleDateFormat("dd-M-yyyy");
		System.out.println("strDate with pattern dd-M-yyyy \t" + formatter.format(currentDate));
		
		formatter = new SimpleDateFormat("dd MM yyyy zzzz");
		System.out.println("strDate with pattern dd MM yyyy zzzz \t" + formatter.format(currentDate));
		
		formatter = new SimpleDateFormat("E, dd MM yyyy HH:mm:ss z");
		System.out.println("strDate with pattern E, dd MM yyyy HH:mm:ss \t" + formatter.format(currentDate));
		
		formatter = new SimpleDateFormat("E, dd MM yy hh:mm:ss z");
		System.out.println("strDate with pattern E, dd MM yy hh:mm:ss z \t" + formatter.format(currentDate));
	}
}
