package arraylist;
import java.util.ArrayList;
public class App {
	static ArrayList<String> listNames = new ArrayList<String>();
	public static void main(String[] args) {
		App app = new App();
		listNames.add("A");
		listNames.add("B");
		listNames.add("C");
		listNames.add("D");
		listNames.add("E");
		listNames.add("F");
		app.display(listNames);
		app.removeByPosition(1);
		System.out.println("*********");
		app.display(listNames);
		app.removeByString("E");
		System.out.println("*********");
		app.display(listNames);
		System.out.println(listNames.get(0));
		//app.removeByString("a");
		app.modifyByName(3,"K");
		System.out.println("*********");
		app.display(listNames);
		int position = app.search("K");
		System.out.println(position);
		if(position != -1)
		{
			app.modifyByName(3, "P");
		} else
			System.out.println("Invalid");
		app.display(listNames);
	}
	void display(ArrayList<String> names)
	{
		for(String name:names)
			System.out.println(name);	
	}
	void removeByPosition(int position)
	{
		listNames.remove(position);
	}
	void removeByString(String name)
	{
		listNames.remove(name);
	}
	void modifyByName(int position,String newName)
	{
		listNames.set(position,newName);
	}
	int search(String name)
	{
		return listNames.indexOf(name);
	}
}