package com.project.designpatterns.prototypePattern;

import java.util.Hashtable;

public class PrototypeRegistry {
	private Hashtable<String, Earth> prototypeRegistry = new Hashtable<>();
	{
		prototypeRegistry.put("forest", new Forest());
		prototypeRegistry.put("tiger", new Tiger());
		prototypeRegistry.put("lion", new Lion());
		prototypeRegistry.put("deer", new Deer());
	}
	public Earth get(String obj) throws CloneNotSupportedException {
		Earth original = this.prototypeRegistry.get(obj);
		if(original != null) {
			return (Earth) original.clone();
		}
		return original;
	}

}

// An interface can extend another interface
interface Earth extends Cloneable{
	public Object clone();
	public String getDetails();
	public void setDetails(String json);
}

class Forest implements Earth {
	private String json;
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getDetails(){
		return json;
	}
	public void setDetails(String json) {
		this.json = json;
	}
}
class Tiger implements Earth {

	private String json;
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getDetails(){
		return json;
	}
	public void setDetails(String json) {
		this.json = json;
	}
}
class Lion implements Earth {
	private String json;
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getDetails(){
		return json;
	}
	public void setDetails(String json) {
		this.json = json;
	}
}
class Deer implements Earth {
	private String json;
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	public String getDetails(){
		return json;
	}
	public void setDetails(String json) {
		this.json = json;
	}
}
