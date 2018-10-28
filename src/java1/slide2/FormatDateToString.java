package java1.slide2;

import java.text.SimpleDateFormat;
import java.util.Date;

//Dinh dang (format) la convert Date sang String
//method SimpleDateFormat.format(java.util.Date date);
//Phan tich (parse) la convert String sang Date
//method SimpleDateFormat.parse(String string)

public class FormatDateToString {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("current date \t " + currentDate);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
		String strDate = formatter.format(currentDate);
		System.out.println("string date \t" + strDate);
	}

}
