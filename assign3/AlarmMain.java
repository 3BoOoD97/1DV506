package assign3;

public class AlarmMain {

	public static void main(String[] args) {
		
		AlarmClock goodMorning = new AlarmClock(23,48);
		goodMorning.displayTime();
		goodMorning.setAlarm(6, 15);
		
		/*.timeTick:
		 * AH! It has no arguments! 
		 * Why?
		 * ok, a loop then.*/
		System.out.println("500 ticks later...");
		for (int i = 0; i < 500; i++) {
			goodMorning.timeTick();
		}
		goodMorning.displayTime();
		
	}

}
