package _12_Polymorphism;

/*  Create a Notification class with a sendNotification() method. Create EmailNotification,SMSNotification,
    and PushNotification classes that override the method with their own notification process.*/

class Notification{
	void SendNotification(){
		System.out.println("Sending Notification..");
	}
}

class EmailNotification extends Notification{
	@Override
	void SendNotification(){
		System.out.println("Sending Notification via Email...");
	}
}

class SmsNotification extends Notification{
	@Override
	void SendNotification() {
		System.out.println("Sending Notification via Sms...");
	}
}

class PushNotification extends Notification{
	@Override
	void SendNotification() {
		System.out.println("Sending Notification via Push...");
	}
}

public class _07_NotificationTest {
	public static void main(String[] args) {
		Notification n1 = new EmailNotification();
		n1.SendNotification();
		Notification n2 = new SmsNotification();
		n2.SendNotification();
		Notification n3 = new PushNotification();
		n3.SendNotification();
	}
}
