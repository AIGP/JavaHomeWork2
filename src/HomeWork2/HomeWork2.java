package HomeWork2;

import java.io.IOException;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        System.out.println("HomeWork002");
        String inStr = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String[][] strXY;
        strXY = readStr(inStr);
        System.out.println("Sum of elements divided by 2 is: " + calcStr(strXY));

    }

    private static String[][] readStr(String inStr) throws IOException {

        int mX = 4;
        int mY = 4;
        String[] strLines = inStr.split("\n");
        if (strLines.length != mY) {
            throw new IOException("there is not " + mY + " lines");
        }
        String[][] strXY = new String[mX][mY];

        for (int i = 0; i < strLines.length; i++) {
            System.out.println("line " + i + ":  " + strLines[i]);

            try {
                strXY[i] = strLines[i].split(" ");
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new IOException("Line contains more elements");
            }
            if (strXY[i].length < mX) {
                throw new IOException("Line contains less elements");
            }
            if (strXY[i].length > mX) {
                throw new IOException("Line contains more elements");
            }
            StringBuilder strOut = new StringBuilder();
            for (int j = 0; j < strXY[i].length; j++) {
                strOut.append(" ").append(strXY[i][j]);

            }
            System.out.println("Elements for line  " + i + ":  " + strOut);
        }
        return strXY;
    }
    private static double calcStr(String[][] inStr) throws IOException {
        double sum = 0;
        for (String[] strings : inStr) {
            for (int j = 0; j < strings.length; j++) {
                try {
                    sum += Double.parseDouble(strings[j]);

                } catch (NumberFormatException ex) {
                    throw new IOException("It is wrong number format");
                }
            }
        }
        return sum / 2;

    }
}
