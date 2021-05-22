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
}

class Forest implements Earth {
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
class Tiger implements Earth {
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
class Lion implements Earth {
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
class Deer implements Earth {
	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
