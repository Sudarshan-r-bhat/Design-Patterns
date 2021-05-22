package com.project.designpatterns.decoratorPattern;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class CompressionDecorator extends DataSourceDecorator {
	private int compressionLevel = 6;
	
	public CompressionDecorator(DataSource source) {
		super(source);
	}
	public int getCompressionLevel() {
		return compressionLevel;
	}
	 public void setCompressionLevel(int value) {
		 compressionLevel = value;
	 }
	 
	@Override
	public void writeData(String data) {
		super.writeData(compress(data));
	}

	@Override
	public String readData() {
		return decompress(super.readData());
	}
	
	private String compress(String data) {
		byte[] byteData = data.getBytes();
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(compressionLevel));
			dos.write(byteData);
			dos.close();
			bout.close();
			return Base64.getEncoder().encodeToString(bout.toByteArray());
		}catch(IOException ioEx) {
			System.out.println(ioEx.getMessage());
			return null;
		}
	}
	private String decompress(String data) {
		System.out.println("decompress = " + data);
		byte[] bData = Base64.getDecoder().decode(data);
		try {
			InputStream bin = new ByteArrayInputStream(bData);
			InflaterInputStream iin = new InflaterInputStream(bin);
			ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
			int b;
			while((b = iin.read()) != -1) {
				bout.write(b);
			}
			bin.close();
			iin.close();
			bout.close();
			String res =  new String(bout.toByteArray());
			System.out.println("De-compress = " + res);
			return res;
		} catch(IOException ioEx) {
			System.out.println(ioEx.getMessage());
			return null;
		}
	}
	
	
}
