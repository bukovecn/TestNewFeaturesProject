package switchtest;

public class SwitchTest {
	

	public int getNumberOfDayInWeek(String dayOfWeekArg) {
		int dayNum = switch (dayOfWeekArg) {
        case "Monday" -> 1;
        case "Tuesday" -> 2;
        case "Wednesday" -> 3;
        case "Thursday" -> 4;
        case "Friday" -> 5;
        case "Saturday" -> 6;
        case "Sunday" -> 7;
        default -> throw new IllegalArgumentException("Unexpected value: " + dayOfWeekArg);
    };
	
    return dayNum;


	}
}

