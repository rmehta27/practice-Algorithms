package CoreJava.Algorithms.Nag;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SortDate {
	public static void main(String[] args) throws ParseException {
		String[] dates = { "11/24/2010", "02/02/2008", "1/30/2008", "11/23/2010" };
		Date[] dateArray = new Date[dates.length];
		SimpleDateFormat sdf = new SimpleDateFormat("m/d/yyyy");
		for (int i = 0; i < dates.length; i++) {
			dateArray[i] = sdf.parse(dates[i]);
		}
		Arrays.sort(dateArray);

		for (int i = 0; i < dates.length; i++) {
			dates[i] = sdf.format(dateArray[i]);
		}
		System.out.println(dates);
	}
}
