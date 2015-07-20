package jasper.k.exercise2;

import ch.qos.logback.core.net.SyslogOutputStream;

public class BreakEx3 {
	public static void main(String[] args) {
		blockLabel :
		{
			int i = 5;
			if (i ==5) {
				break blockLabel;
			}
			if (i != 5) {
				System.out.println("i is not five");
			}
		}
	System.out.println();

	}
}
