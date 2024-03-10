package Examination2;

public class MyConverter {
    String[] letters = new String[]{
            "A", "B", "C", "D", "E",
            "F", "G", "H", "I", "J", "K", "L", "M", "N",
            "O", "P", "Q", "R", "S", "T", "U", "V", "W",
            "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", ",", "?"};
    String[] morse = new String[]{"*-", "-***", "-*-*", "-**", "*", "**-*", "--*", "****", "**",
            "*---", "-*-", "*-**", "--", "-*", "---", "*---*", "--*-", "*-*",
            "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----",
            "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*",
            "-----", "*-*-*-", "--**--", "**--**"};


    public String getMorseCode(String testdata) {
        String morsecode = "";
        int number = -1;
        for (int i = 0; i < letters.length; i++) {

            if (letters[i].equalsIgnoreCase(testdata)) {
                number = i;

            }

        }
        try {
            morsecode = morse[number];
        } catch (ArrayIndexOutOfBoundsException e) {
            //some way we might act if the exception happens
            System.out.println("There is no such letter/character/number");
        } catch (Exception e) {
            System.out.println("OOPS something went wrong. Please try again");
        }
        return morsecode;
    }

    public String getLetter(String testdata) {
        String letter = "";
        int number = -1;
        for (int i = 0; i < morse.length; i++) {

            if (morse[i].equalsIgnoreCase(testdata)) {
                number = i;

            }

        }
        try {
            letter = letters[number];//зашли в массив взяли там букву и положили в letter
        } catch (ArrayIndexOutOfBoundsException e) {
            //some way we might act if the exception happens
            System.out.println("There is no such morsecode");
        } catch (Exception e) {
            System.out.println("OOPS something went wrong. Please try again");
        }
        return letter;

    }
}

