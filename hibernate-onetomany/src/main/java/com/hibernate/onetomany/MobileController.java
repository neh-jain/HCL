package com.hibernate.onetomany;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MobileController {
	static Mobile mobile = new Mobile();
	static Sim sim = new Sim();
	static MobileDao dao = new MobileDao();

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			Mobile m = new Mobile();
			MobileDao dao = new MobileDao();
			
			Sim sim1 = new Sim();
			Sim sim2 = new Sim();
			
			sim1.setName("JIO");
			sim1.setProvider("reliance");
			
			sim2.setName("VODA");
			sim2.setProvider("vodafone");
			
			List<Sim> sim = Arrays.asList(sim1,sim2);
			
			m.setName("iphone");
			m.setModel("a14");
			
			m.setList(sim);
			dao.saveMobileSim(mobile,sim1,sim2);
			sc.close();
	}
}
