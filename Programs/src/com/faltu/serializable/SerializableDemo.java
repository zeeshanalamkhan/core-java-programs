package com.faltu.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog d1 = new Dog();

		 /*System.out.println("x->"+d1.x+" \ty->"+d1.y);*/

		/*System.out.println("********** SERIALIZATION STARTED **********");

		//FileOutputStream fos = new FileOutputStream("abc.ser");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//d1.setX(25);
		oos.writeObject(d1);
		System.out.println("********** SERIALIZATION ENDED **********\n");

		System.out.println("********** DE-SERIALIZATION STARTED **********");
*/
		
		//FileInputStream fis = new FileInputStream("abc.ser");
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.x+"========"+d2.y);
		System.out.println("********** DE-SERIALIZATION ENDED **********");
	}
}
