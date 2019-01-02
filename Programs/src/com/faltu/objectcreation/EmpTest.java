package com.faltu.objectcreation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EmpTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException, CloneNotSupportedException, IOException {

		Employee e1 = new Employee();
		System.out.println("e1 - hash code: " + e1.hashCode());
		Employee e6 = new Employee();
		System.out.println("e6 - hash code: " + e1.hashCode());

		Class c = Class.forName("com.faltu.objectcreation.Employee");
		Employee e2 = (Employee) c.newInstance();
		System.out.println("e2 - hash code: " + e2.hashCode());

		Constructor<Employee> constructor = Employee.class.getConstructor();
		Employee e3 = constructor.newInstance();
		System.out.println("e3 - hash code: " + e3.hashCode());

		Employee e4 = (Employee) e1.clone();
		System.out.println("e4 - hash code: " + e4.hashCode());

		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e4);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e5 = (Employee)ois.readObject();
		System.out.println("e5 - hash code: " + e5.hashCode());

	}

}
