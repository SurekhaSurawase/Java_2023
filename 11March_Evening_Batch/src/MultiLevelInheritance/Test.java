package MultiLevelInheritance;

public class Test {

	public static void main(String[] args) {

		WhatsAppV1 V1 = new WhatsAppV1();
		V1.TextMsg();
		
		System.out.println();
		WhatsAppV2 V2 = new WhatsAppV2();
		V2.AudioCalling();
		V2.TextMsg();
		System.out.println();
		
		WhatsAppV3 V3 = new WhatsAppV3();
		V3.VideoCalling();
		V3.TextMsg();
		V3.AudioCalling();
		System.out.println();
		
		WhatsAppV4 V4 = new WhatsAppV4();
		V4.Payment();
		V4.AudioCalling();
		V4.TextMsg();
		V4.VideoCalling();
	}

}
