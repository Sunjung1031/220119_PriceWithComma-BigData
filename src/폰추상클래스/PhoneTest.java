package 폰추상클래스;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("손흥민 선수가");
		

		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		System.err.println();
		
		TelePhone telePhone = new TelePhone("이강인 선수가");
		
		System.out.println(telePhone.owner);
		telePhone.turnOn();
		telePhone.autoAnswering();
		telePhone.turnOff();
	}

}
