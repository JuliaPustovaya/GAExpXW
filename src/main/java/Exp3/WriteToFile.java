package Exp3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class WriteToFile {
	public  static void createFile(ArrayList list) throws Exception {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("filename.txt"), "utf-8"))) {
			for (int i = 0; i <list.size() ; i++) {
				writer.write(list.get(i).toString());
			}

		}
	}
	public static void writeToFile(ArrayList list){
		try {
			createFile(list);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
