package week1.day1;

public class LearnSwitchCase {
	public static void main(String[] args) {
		String browser ="chrome";
		switch (browser)
		{
		case "chrome": System.out.println("Open Chrome Browser");break;
		case "edge": System.out.println("Open Edge Browser");break;
		case "safari": System.out.println("Open safari Browser");break;
		case "ie": System.out.println("Open Internet Explorer Browser");break;
		default : System.out.println("Open Edge Browser");break;
		}
	}

}
