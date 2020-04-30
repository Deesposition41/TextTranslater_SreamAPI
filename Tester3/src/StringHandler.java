
import java.awt.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StringHandler {

    static HashMap<Character, String> dict = new HashMap<>();
    static HashMap<Character, String> frip = new HashMap<>();
    static ArrayList<String> lines = new ArrayList<>();
    String p = "";
    static ArrayList<String> result = new ArrayList<>();
    static File newfile = new File("src//1.txt");

    public StringHandler(ArrayList<String> lines) {
        this.lines = lines;
    }

    public static ArrayList<String> FileInList(File fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static String toSmall(String results) {
        frip.put('А', "а");
        frip.put('Б', "б");
        frip.put('В', "в");
        frip.put('Г', "г");
        frip.put('Е', "е");
        frip.put('Д', "д");
        frip.put('Ж', "ж");
        frip.put('З', "з");
        frip.put('И', "и");
        frip.put('К', "к");
        frip.put('Л', "л");
        frip.put('М', "м");
        frip.put('Н', "н");
        frip.put('О', "о");
        frip.put('П', "п");
        frip.put('С', "с");
        frip.put('Т', "т");
        frip.put('Ь', "ь");
        frip.put('Ъ', "ъ");
        frip.put('Х', "х");
        frip.put('Ш', "ш");
        frip.put('Щ', "щ");
        frip.put('Э', "э");
        frip.put('Ю', "ю");
        frip.put('Я', "я");
        frip.put('A', "a");
        frip.put('B', "b");
        frip.put('C', "c");
        frip.put('D', "d");
        frip.put('E', "e");
        frip.put('F', "f");
        frip.put('G', "g");
        frip.put('H', "h");
        frip.put('I', "i");
        frip.put('J', "j");
        frip.put('K', "k");
        frip.put('L', "l");
        frip.put('M', "m");
        frip.put('N', "n");
        frip.put('O', "o");
        frip.put('P', "p");
        frip.put('Q', "q");
        frip.put('R', "r");
        frip.put('S', "s");
        frip.put('W', "w");
        frip.put('X', "x");
        frip.put('U', "u");
        frip.put('Z', "z");

        char[] chars = results.toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += frip.getOrDefault(chars[i], chars[i] + " ");
        }
        return s;
    }

    public static String translate(String results) {
        dict.put('А', "A");
        dict.put('Б', "B");
        dict.put('В', "V");
        dict.put('Г', "G");
        dict.put('Д', "D");
        dict.put('Е', "E");
        dict.put('Ё', "E");
        dict.put('Ж', "ZH");
        dict.put('З', "Z");
        dict.put('И', "I");
        dict.put('Й', "J");
        dict.put('К', "K");
        dict.put('Л', "L");
        dict.put('М', "M");
        dict.put('Н', "N");
        dict.put('О', "O");
        dict.put('П', "P");
        dict.put('Р', "R");
        dict.put('С', "S");
        dict.put('Т', "T");
        dict.put('У', "U");
        dict.put('Ф', "F");
        dict.put('Х', "H");
        dict.put('Ц', "C");
        dict.put('Ч', "CH");
        dict.put('Ш', "SH");
        dict.put('Щ', "SHH");
        dict.put('Ъ', "");
        dict.put('Ы', "");
        dict.put('Ь', "");
        dict.put('Э', "");
        dict.put('Ю', "");
        dict.put('Я', "");
        dict.put('а', "a");
        dict.put('б', "b");
        dict.put('в', "v");
        dict.put('г', "g");
        dict.put('д', "d");
        dict.put('е', "e");
        dict.put('ё', "e");
        dict.put('ж', "zh");
        dict.put('з', "z");
        dict.put('и', "i");
        dict.put('й', "yo");
        dict.put('к', "k");
        dict.put('л', "l");
        dict.put('м', "m");
        dict.put('н', "n");
        dict.put('о', "o");
        dict.put('п', "p");
        dict.put('р', "r");
        dict.put('с', "s");
        dict.put('т', "t");
        dict.put('у', "u");
        dict.put('ф', "f");
        dict.put('х', "h");
        dict.put('ц', "c");
        dict.put('ч', "ch");
        dict.put('ш', "sh");
        dict.put('щ', "sch'");
        dict.put('ы', "y");
        dict.put('ь', "'");
        dict.put('э', "e'");
        dict.put('ю', "yu");
        dict.put('я', "ya");
        dict.put('a', "а");
        dict.put('b', "б");
        dict.put('c', "ц");
        dict.put('d', "д");
        dict.put('e', "у");
        dict.put('f', "ф");
        dict.put('g', "ж");
        dict.put('h', "ш");
        dict.put('i', "ш");
        dict.put('j', "дж");
        dict.put('k', "к");
        dict.put('l', "л");
        dict.put('m', "м");
        dict.put('n', "н");
        dict.put('o', "о");
        dict.put('p', "п");
        dict.put('q', "ку");
        dict.put('r', "р");
        dict.put('s', "с");
        dict.put('t', "т");
        dict.put('u', "у");
        dict.put('v', "в");
        dict.put('w', "в");
        dict.put('x', "икс");
        dict.put('y', "й");
        dict.put('z', "з");

        char[] chars = results.toCharArray();
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += dict.getOrDefault(chars[i], chars[i] + " ");
        }
        return s;

    }

    public static String toBig(String result) {
        String f = "";
        String[] tmpArr = result.split(" ");
        for (int j = 0; j < tmpArr.length; j++) {
            if (tmpArr[j].length() > 1) {
                f += tmpArr[j].substring(0, 1).toUpperCase() + tmpArr[j].substring(1, tmpArr[j].length()) + " ";
            }
        }
        return f;
    }

    public static void writeToFile(File fileName, ArrayList<String> result) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String line : result
            ) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

   /* public static void writeToFile(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(string);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newfile));
            for (String line : arrayList) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/



   /* public StringHandler(File fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while (reader.ready()) {
                lines.add(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public StringHandler translate() {
        dict.put('А', "A");
        dict.put('Б', "B");
        dict.put('В', "V");
        dict.put('Г', "G");
        dict.put('Д', "D");
        dict.put('Е', "E");
        dict.put('Ё', "E");
        dict.put('Ж', "ZH");
        dict.put('З', "Z");
        dict.put('И', "I");
        dict.put('Й', "J");
        dict.put('К', "K");
        dict.put('Л', "L");
        dict.put('М', "M");
        dict.put('Н', "N");
        dict.put('О', "O");
        dict.put('П', "P");
        dict.put('Р', "R");
        dict.put('С', "S");
        dict.put('Т', "T");
        dict.put('У', "U");
        dict.put('Ф', "F");
        dict.put('Х', "H");
        dict.put('Ц', "C");
        dict.put('Ч', "CH");
        dict.put('Ш', "SH");
        dict.put('Щ', "SHH");
        dict.put('Ъ', "");
        dict.put('Ы', "");
        dict.put('Ь', "");
        dict.put('Э', "");
        dict.put('Ю', "");
        dict.put('Я', "");
        dict.put('а', "a");
        dict.put('б', "b");
        dict.put('в', "v");
        dict.put('г', "g");
        dict.put('д', "d");
        dict.put('е', "e");
        dict.put('ё', "e");
        dict.put('ж', "zh");
        dict.put('з', "z");
        dict.put('и', "i");
        dict.put('й', "yo");
        dict.put('к', "k");
        dict.put('л', "l");
        dict.put('м', "m");
        dict.put('н', "n");
        dict.put('о', "o");
        dict.put('п', "p");
        dict.put('р', "r");
        dict.put('с', "s");
        dict.put('т', "t");
        dict.put('у', "u");
        dict.put('ф', "f");
        dict.put('х', "h");
        dict.put('ц', "c");
        dict.put('ч', "ch");
        dict.put('ш', "sh");
        dict.put('щ', "sch'");
        dict.put('ы', "y");
        dict.put('ь', "'");
        dict.put('э', "e'");
        dict.put('ю', "yu");
        dict.put('я', "ya");
        dict.put('a', "а");
        dict.put('b', "б");
        dict.put('c', "ц");
        dict.put('d', "д");
        dict.put('e', "у");
        dict.put('f', "ф");
        dict.put('g', "ж");
        dict.put('h', "ш");
        dict.put('i', "ш");
        dict.put('j', "дж");
        dict.put('k', "к");
        dict.put('l', "л");
        dict.put('m', "м");
        dict.put('n', "н");
        dict.put('o', "о");
        dict.put('p', "п");
        dict.put('q', "ку");
        dict.put('r', "р");
        dict.put('s', "с");
        dict.put('t', "т");
        dict.put('u', "у");
        dict.put('v', "в");
        dict.put('w', "в");
        dict.put('x', "икс");
        dict.put('y', "й");
        dict.put('z', "з"); //

        String results = "";
        for (int i = 0; i < lines.size(); i++) {
            char[] chars = lines.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                results += dict.getOrDefault(chars[j], lines.get(i).split("")[j] + "");
            }
            results += System.lineSeparator();
        }
        result.add(results);

        return this;
    }

    public StringHandler toSmall() {
        frip.put('А', "а");
        frip.put('Б', "б");
        frip.put('В', "в");
        frip.put('Г', "г");
        frip.put('Е', "е");
        frip.put('Д', "д");
        frip.put('Ж', "ж");
        frip.put('З', "з");
        frip.put('И', "и");
        frip.put('К', "к");
        frip.put('Л', "л");
        frip.put('М', "м");
        frip.put('Н', "н");
        frip.put('О', "о");
        frip.put('П', "п");
        frip.put('С', "с");
        frip.put('Т', "т");
        frip.put('Ь', "ь");
        frip.put('Ъ', "ъ");
        frip.put('Х', "х");
        frip.put('Ш', "ш");
        frip.put('Щ', "щ");
        frip.put('Э', "э");
        frip.put('Ю', "ю");
        frip.put('Я', "я");
        frip.put('A', "a");
        frip.put('B', "b");
        frip.put('C', "c");
        frip.put('D', "d");
        frip.put('E', "e");
        frip.put('F', "f");
        frip.put('G', "g");
        frip.put('H', "h");
        frip.put('I', "i");
        frip.put('J', "j");
        frip.put('K', "k");
        frip.put('L', "l");
        frip.put('M', "m");
        frip.put('N', "n");
        frip.put('O', "o");
        frip.put('P', "p");
        frip.put('Q', "q");
        frip.put('R', "r");
        frip.put('S', "s");
        frip.put('W', "w");
        frip.put('X', "x");
        frip.put('U', "u");
        frip.put('Z', "z");

        String results = "";
        for (int i = 0; i < lines.size(); i++) {
            char[] chars = lines.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                results += frip.getOrDefault(chars[j], lines.get(i).split("")[j] + "");
            }
            results += System.lineSeparator();
        }
        result.add(results);

        return this;

    }

    public StringHandler toBig() {
        String f = "";
        for (int i = 0; i < lines.size(); i++) {
            String s = lines.get(i);
            String[] tmpArr = s.split(" ");
            String result = "";
            for (int j = 0; j < tmpArr.length; j++) {
                if (tmpArr[j].length() > 1) {
                   // char oldFirst = tmpArr[j].charAt(0);
                    result += tmpArr[j].substring(0, 1).toUpperCase() + tmpArr[j].substring(1, tmpArr[j].length()) + " ";
                }
            }
            f += result + " ";
            f += System.lineSeparator();
        }
        result.add(f);
        return this;
    }

    public int cellOfRepeat(char f) {
        int k = 0;
        for (int i = 0; i < lines.size(); i++) {
            char[] chars = lines.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == f) {
                    k = k + 1;
                }
            }
        }
        System.out.println(k + "");
        return k;
    }

    public void writeToFile(File fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String line : result
            ) {
                writer.write(line);
                writer.newLine();
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
