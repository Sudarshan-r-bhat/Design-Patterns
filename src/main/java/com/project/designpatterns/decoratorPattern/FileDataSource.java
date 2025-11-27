package com.project.designpatterns.decoratorPattern;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource implements DataSource {
	private String name;
	
	public FileDataSource(String name) {
		this.name = name;
	}
	
	
	@Override
	public void writeData(String data) {
		System.out.println("file writer = " + data);
		File file = new File(name);
		try (OutputStream fos = new FileOutputStream(file)) {
			fos.write(data.getBytes(), 0, data.length());
		} catch(IOException ioEx) {
			System.out.println(ioEx.getMessage());
		}
		
	}

	@Override
	public String readData() {
		char[] buffer = null;
		File file = new File(name);
		try(FileReader reader = new FileReader(file)) {
			buffer = new char[(int)file.length()];
			reader.read(buffer);
		} catch(IOException ioEx) {
			System.out.println(ioEx.getMessage());
		}
		return new String(buffer);
	}

}
