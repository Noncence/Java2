package geekbrains.javatwo.homeworks.lesson3.homework2;

public class Main {

    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        try {
            stringToArray(str);
        } catch (IndexOutOfArrayException e) {
            e.printStackTrace();
        }

        try {
            stringToSumInt(stringToArray(str));
        } catch (NotAtNumber e) {
            e.printStackTrace();
        }
    }

    public static String[][] stringToArray(String string) {
        int count = 0;
        String[][] strMatrix = new String[4][4];
        String[] subStr = string.split("\\s");
        if (subStr.length > (strMatrix.length * strMatrix.length)) {
            throw new IndexOutOfArrayException("Размер матрицы, полученной из строки, не равен 4x4");
        } else {
            for (int i = 0; i < strMatrix.length; i++) {
                for (int j = 0; j < strMatrix.length; j++) {
                    strMatrix[i][j] = subStr[count];
                    count++;
                    System.out.print(strMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        return strMatrix;
    }

    public static int stringToSumInt(String [][] str) {
        int sumInt  = 0;
        boolean isNumber;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                try {
                    sumInt += Integer.parseInt(str[i][j]);
                    isNumber = true;
                } catch (NumberFormatException e){
                    isNumber = false;
                }
                if (!isNumber) {
                    throw  new NotAtNumber("В одной из ячеек массива не число");
                }
            }
        }
        return sumInt / 2;
    }
}
