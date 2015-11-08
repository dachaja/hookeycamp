package anna.p.exercise.ch11;

public class StringSwitch {
	public static void main(String[] args) {
		operate("on");
		operate("off");
		operate("ON");
		operate("Nothing");
		operate("OFF");
		operate(null);
	}
	public static void operate(String status) {
		// Check for null
		if (status == null) {
			System.out.println("status cannot be null.");
			return;
		}
		// Convert to lowercase
		status = status.toLowerCase();
		
		switch (status) {
		case "on":
			System.out.println("Turn on");
			break;
		case "off":
			System.out.println("Turn off");
			break;
		default:
			System.out.println("Unknown command");
			break;
		}
	}
}
