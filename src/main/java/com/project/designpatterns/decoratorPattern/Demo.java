package com.project.designpatterns.decoratorPattern;

import javassist.ClassPath;

/*
NOTE:
	when a child class object is created its parent class is NOT instantiated.
	when you extend a Parent class, you inherit the variables and methods of the parent.
	meaning, its as good as child object owning the parent's methods and variables.
	
	super() is used to refer to constructor method routine.
	super.<method> used to access the method routine.
	
	even though certain variables are declared and initialized in parent class. through
	constructors / methods,
	whenever a child class object is created, these variables are stored in the child 
	class object itself. Parent object is not created. 
	
	CompressionDecorator[Datasource ]
	EncryptionDecorator [Datasource ]
	
	DataSource<Interface> <--- FileDataSource, DataSourceDecorator<abstract>
	write-operation:
		compress -> encrypt -> write
	read-operation:
		read -> decrypt -> decompress
*/
public class Demo {
	public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncodeDecodeDecorator(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
