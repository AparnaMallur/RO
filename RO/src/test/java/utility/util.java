package utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.Test;

public class util {
  @Test
 	  public static String getCurrentDateTime() {
			Calendar currentDate = Calendar.getInstance();
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy:HH.mm.ss");
			return formatter.format(currentDate.getTime());
		}

  }

