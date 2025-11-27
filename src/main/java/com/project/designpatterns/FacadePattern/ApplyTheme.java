package com.project.designpatterns.FacadePattern;
/*
	ps: create a Theme Picker application, which allows you to apply
	 light, dark or monochoi coloured themes
	 implement it using facade pattern.
	dnc:
		interface <- [class, class, ...] implement an interface in concrete class.
		
		Class -> interface instances. create different instances of concrete classes above
		using the interface as Type.
		
		next -> call method to apply appropriate theme.

*/
public class ApplyTheme {
	
	private static volatile ThemePicker pick = new ThemePicker();
	
	public static void main(String[] args) {
		pick.applyDarkTheme();
		pick.applyLightTheme();
		pick.applyMonochoiTheme();
	}
}

interface Theme {
	public void apply();
}

class Dark implements Theme {
	@Override
	public void apply() {
		System.out.println("Dark theme applied");
	}
}

class Light implements Theme {
	@Override
	public void apply() {
		System.out.println("Light theme applied");
	}
}
class Monochoi implements Theme {
	@Override
	public void apply() {
		System.out.println("Monochoi theme applied");
	}
}

class ThemePicker {
	private Theme dark;
	private Theme light;
	private Theme monochoi;
	
	public ThemePicker() {
		dark = new Dark();
		light = new Light();
		monochoi = new Monochoi();
	}
	
	public synchronized void applyDarkTheme() {
		dark.apply();
	}
	public synchronized void applyLightTheme() {
		light.apply();
	}
	public synchronized void applyMonochoiTheme() {
		monochoi.apply();
	}
	
	
}
