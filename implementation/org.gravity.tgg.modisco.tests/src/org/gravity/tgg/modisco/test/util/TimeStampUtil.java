package org.gravity.tgg.modisco.test.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeStampUtil {

	public static String getCurrentTimeStamp() {
		return LocalTime.now()
						.format(DateTimeFormatter.ISO_LOCAL_TIME);
	}

}
