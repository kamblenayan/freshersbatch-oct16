package com.assignments;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TaskScheduler {

	static DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	static Timer timer = new Timer();

	private static class MyTimeTask extends TimerTask {

		private String taskName;

		public MyTimeTask(String taskName) {
			this.taskName = taskName;
		}

		public void run() {
			System.out.println(taskName + " scheduled");
		}
	}

	public static void main(String[] args) throws ParseException {

		System.out.println("Current Time: " + df.format(new Date()));

		scheduleTask("2016-12-09 11:13:00", "Task 1");
		scheduleTask("2016-12-09 11:13:15", "Task 2");
		scheduleTask("2016-12-09 11:13:40", "Task 3");

		System.out.println("hii");

	}

	private static void scheduleTask(String date, String string) throws ParseException {
		Date parse = df.parse(date);
		timer.schedule(new MyTimeTask(string), parse);
	}

}
