package arraylist;

import java.util.ArrayList;
class intWrapper
{
	public int intValue;
	
	public intWrapper(int intValue)
	{
		this.intValue = intValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	
}
public class Auto {
	public static void main(String[] args) {
//	ArrayList<Integer> StuNos = new ArrayList<Integer>();
//	StuNos.add(25);
//	System.out.println(StuNos.get(0));
	
	ArrayList<intWrapper> StuNos = new ArrayList<intWrapper>();
	StuNos.add(new intWrapper(12));             //boxing
	System.out.println(StuNos.get(0).getIntValue());
	}
}