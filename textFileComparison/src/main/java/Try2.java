import java.io.*;

public class Try2 {


    public static void main(String[] args) throws IOException {

        BufferedReader report1 = new BufferedReader(new FileReader("Report.txt"));
        BufferedReader report2 = new BufferedReader(new FileReader("Report2.txt"));

        String lineOfRep1;
        String lineOfRep2;
        String notEqualStrings = "";

        while ((lineOfRep1 = report1.readLine()) != null && (lineOfRep2 = report2.readLine()) != null){

                if (!lineOfRep1.equals(lineOfRep2)){

                    mismatch = mismatchCounter();
                    notEqualStrings = notEqualStrings.concat(lineOfRep1 + "\nне совпало с\n" + lineOfRep2 + "\n////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");

                }

        }

        BufferedWriter result = new BufferedWriter(new FileWriter("Result.txt"));
        result.write(" \n");
        result.write("                                   Несовпадений найдено: " + mismatch + "\n");
        result.write(" \n");
        result.write("////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
        result.write(notEqualStrings);
        result.close();

        System.out.println("DONE!");

    }
    static int mismatch = 0;
    public static int mismatchCounter () {

        mismatch = mismatch + 1;

        return mismatch;

    }

}
