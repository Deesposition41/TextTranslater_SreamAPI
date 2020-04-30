/*import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        //ArrayList<Integer>; //у int - Integer
        HashMap<Character, String> dict = new HashMap<>();
        // String s = "Утки плывут на пляж";
        HashMap<Character, String> jels = new HashMap<>();
        //русско-англ
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
        dict.put('я', "ya");
        dict.put('ж', "zh");
        dict.put('ф', "f");
        dict.put('и', "i");
        dict.put('г', "g");
        dict.put('л', "l");
        dict.put('у', "u");
        dict.put('т', "t");
        dict.put('к', "k");
        dict.put('п', "p");
        dict.put('в', "v");
        dict.put('н', "n");
        dict.put('а', "a");
        dict.put('ы', "y");
        dict.put('У', "U");

        jels.put('А', "а");
        jels.put('Б', "б");
        jels.put('В', "в");
        jels.put('Г', "г");
        jels.put('Д', "д");
        jels.put('Е', "е");
        jels.put('Ж', "ж");
        jels.put('З', "з");
        jels.put('И', "и");
        jels.put('К', "к");
        jels.put('Л', "л");
        jels.put('М', "м");
        jels.put('Н', "н");
        jels.put('О', "о");
        jels.put('П', "п");
        jels.put('Р', "р");
        jels.put('С', "с");
        jels.put('Т', "т");
        jels.put('Ь', "ь");
        jels.put('Ъ', "ъ");
        jels.put('Ы', "ы");
        jels.put('Х', "х");
        jels.put('Ц', "ц");
        jels.put('Щ', "щ");
        jels.put('Ш', "ш");
        jels.put('Э', "э");
        jels.put('Ю', "ю");
        jels.put('Я', "я");
       /* ArrayList<String> lines = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            //
        }*/ /*
        File file = new File("C://Users//PackardBell//Downloads//file.txt");
        File file1 = new File("C://Users//PackardBell//Downloads//file1.txt");
        File notes=new File("C://Users//PackardBell//Downloads//notes.txt");
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> lines1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            String line = "";
            while ((line = reader.readLine()) != null) {
                char[] chars = line.toCharArray();

                for (int i = 0; i < chars.length; i++) {
                    line += dict.getOrDefault(chars[i], chars[i] + "");

                }
                lines.add(line);

            }
        } catch (IOException e) {
            System.out.println("Error" + e);
        }


        try {
            String linet = "";
            while ((linet = reader.readLine()) != null) {
                char[] chars1 = linet.toCharArray();
                for (int i = 0; i < chars1.length; i++) {
                    linet += jels.getOrDefault(chars1[i], chars1[i] + "");
                }

                lines1.add(linet);
            }
        } catch (IOException e) {
            System.out.println("Error" + e);
        }
      /*  char[] chars = s.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += dict.getOrDefault(chars[i], chars[i] + "");
        }
        System.out.println(result);*/
//dict.get('я');
// System.out.println(dict.get('ы'));//можем оборащаться только к ключам
//System.out.println(dict.get('!'));
//char c = 'ф';
//System.out.println(dict.getOrDefault(c,c+" "));


//Символьная арифметика в Java
       /*char c = (char) ('a' + 2);
        System.out.println((char) 64);
        System.out.println(c);*/
// System.out.println((char) 65);

      /*  try (BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt"))) {
            char c1 = (char) 21;
            writer.write(c1);
            writer.flush();//выгрузить буфер
            writer.close();//закрыть файл после использования

        } catch (IOException e) {
            e.printStackTrace();
        }*/ /*
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
            for (int i = 0; i < lines.size(); i++) {
                writer.write(lines.get(i));
                writer.write(lines1.get(i));
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
*/

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        File file = new File("src//File.txt");
        File file1 = new File("src//1.txt");

        ArrayList<String> arrayList = (ArrayList<String>) StringHandler.FileInList(file).stream()
                .map(StringHandler::toSmall)
                .collect(Collectors.toList());
        StringHandler.writeToFile(file1, arrayList);
        //  StringHandler.FileInList(file).stream()
        //      .map(StringHandler::toSmall)
        //       .collect(Collectors.toList());
        //  .forEach(StringHandler::writeToFile);


        // .collect(Collectors.toList()).stream()
        // .map(StringHandler::writeToFile);






      /*  new StringHandler(file)
                .translate()
                .toSmall()
                .toBig()
                .writeToFile(file1);
        new StringHandler(file)
                .cellOfRepeat('а');
*/


    }
}


