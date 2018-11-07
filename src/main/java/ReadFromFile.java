import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadFromFile {
    private static final Logger LOGGER = Logger.getLogger( ReadFromFile.class.getName() );
    public static ArrayList<TimeSeria> timeSeria = new ArrayList<TimeSeria>();
    public static ArrayList<Double> openFile(String filePath) throws Exception {
        Scanner s = new Scanner(new File(filePath));
        ArrayList<Double> list = new ArrayList<Double>();
        while (s.hasNext()) {
            list.add(Double.parseDouble(s.next()));
        }
        s.close();
        return list;
    }

    public static void openFile() throws Exception {
        FileDialog dialog = new FileDialog((Frame) null, "Select File to Open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getFile();
        System.out.println(file + " chosen.");
        openFile(dialog.getDirectory() + file);
        LOGGER.info("Open text file to read data");

    }

    public static void main(String[] args) {
        try {
            openFile();

        } catch (Exception e) {

           LOGGER.log(Level.SEVERE,"Exception reading file");
            e.printStackTrace();
        }
    }
}
