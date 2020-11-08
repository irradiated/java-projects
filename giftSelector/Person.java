import java.util.*;
import java.io.*;

public class Person {
	
	String name;
	String listHeader;
	
	public Person() {
		name = "";
		listHeader = "";
	}
	
	public Person(String name) {
		this.name = name;
		listHeader = "~" + name;
	}

	public void setPerson(String name) {
		this.name = name;
		listHeader = "~" + name;
	}

	public String getName() {
		return name;
	}
	
	public String getList() {
		return listHeader;
	}

}
