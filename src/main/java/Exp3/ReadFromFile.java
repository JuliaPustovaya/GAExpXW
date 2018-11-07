package Exp3;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class ReadFromFile {
    private static final Logger LOGGER = Logger.getLogger(ReadFromFile.class.getName());

    public static ArrayList<Double> readDataFromFile(String filePath, ArrayList list) throws Exception {
        int index = 1;
        Scanner s = new Scanner(new File(filePath));

        while (s.hasNext()) {
            list.add(new TimeSeria(index++, Double.parseDouble(s.next())));
        }

        s.close();
        System.out.println("Исходные данные: Период-Значение:"+ list);
        return list;
    }

    public static void openFile(ArrayList list) throws Exception {
        FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getFile();
        System.out.println(file + " chosen.");
        readDataFromFile(dialog.getDirectory() + file, list);
        LOGGER.info("Open text file to read data");

    }



}
