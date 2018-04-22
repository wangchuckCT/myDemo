package chuckTest;

import java.util.ArrayList;
import java.util.List;


public class mydemo {

	private int myName;

	public int getMyName() {
		return myName;
	}

	public void setMyName(int myName) {
		this.myName = myName;
	}

	public String GetData() {

		return "hello chuck";

	}
	
	/**
 * 
 * @param args
 */
	public static void main(String args[]) {
		
		System.out.println("hello chuck ");
		
		List<String> names=new ArrayList<>();
		names.add("chuck");
		names.add("daci");
		
		 int m = names.indexOf("daci");
		System.out.println(m);
		
		 boolean p = names.remove("pp");
		 System.out.println(p);
		 
		// People pp =new People();
		 
		 
	}
	
}




