package Exp3;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReadFromFile {
	private static final Logger LOGGER = Logger.getLogger(ReadFromFile.class.getName());

	public static ArrayList<Double> readDataFromFile(String filePath, ArrayList listForTimeSeria, ArrayList listOfRealValue) throws Exception {
		int index = 1;
		Scanner s = new Scanner(new File(filePath));
		ArrayList<TimeSeria> list = new ArrayList<>();
		while (s.hasNext()) {
			list.add(new TimeSeria(Double.parseDouble(s.next())));
		}
		s.close();
		int removableQuantityOfTimeSeriaForComparion = (int) (list.size() * 0.25);
		//int removableQuantityOfTimeSeriaForComparion = 6;
		for (int i = 0; i < list.size() - removableQuantityOfTimeSeriaForComparion; i++) {
			listForTimeSeria.add(list.get(i));
		}
		for (int i = list.size() - 1; i >= (list.size() - removableQuantityOfTimeSeriaForComparion); i--) {
			listOfRealValue.add(list.get(i).getYt());
		}
		System.out.println("Исходные данные:" + listForTimeSeria);
		Collections.reverse(listOfRealValue);
		System.out.println("Исходные данные для сравнения : " + listOfRealValue);
		return listForTimeSeria;
	}

	public static void openFile(ArrayList listForTimeSeria, ArrayList listOfRealValue) throws Exception {
		FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
		dialog.setMode(FileDialog.LOAD);
		dialog.setVisible(true);
		String file = dialog.getFile();
		System.out.println(file + " chosen.");
		readDataFromFile(dialog.getDirectory() + file, listForTimeSeria, listOfRealValue);
		LOGGER.info("Open text file to read data");
	}
}
