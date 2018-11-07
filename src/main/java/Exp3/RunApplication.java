package Exp3;

import java.util.ArrayList;

;

public class RunApplication {

    public static ArrayList<TimeSeria> timeSeria = new ArrayList<TimeSeria>();

    public static void main(String[] args) throws Exception {

        ReadFromFile.openFile(timeSeria);
        InitialIndexis initialIndexis= new InitialIndexis();
        initialIndexis.formS0();
        System.out.println("s0 "+initialIndexis.getS0());
        initialIndexis.formB0();
        System.out.println("b0 "+initialIndexis.getB0());
        initialIndexis.formC0();
        System.out.println("c0 "+initialIndexis.getC0());




    }
}
