package test.git.src;

public class TestGitMain01 {

	public static void main(String[] args) {
		System.out.println("Start Main program");
		System.out.println("Call JustWakenUp");
		new JustWakeUp().justWakenUp();
				
		System.out.println("Call SayGoodMorning01");
		new SayGoodMorning01().sayGoodMorning();
		
		
		System.out.println("Call Hello1");
		SayHello01 sayHello = new SayHello01();
		sayHello.sayHello();
		System.out.println("Call Hello2");
		SayHello02 sayHello2 = new SayHello02();
		sayHello2.sayHello();
		System.out.println("Call Good Bye");
		SayGoodBye01 sayGoodBye = new SayGoodBye01();
		sayGoodBye.sayGoodBye();
		System.out.println("End Main program");
	}

}
