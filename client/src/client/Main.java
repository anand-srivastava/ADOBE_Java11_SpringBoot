package client;

import com.adobe.model.Employee;
//import com.adobe.util.DateUtil;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("Asha","asha@adobe.com");
		System.out.println(e.getName());
		
//		System.out.println(DateUtil.getDate());
	}

}
