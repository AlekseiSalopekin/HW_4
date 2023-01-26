import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.Integer.valueOf;

public class HW4 {

    public static void main(String[] args) {
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> midllename = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();

        String str = "";
        try {
//            FileWriter writer = new FileWriter("fm.sql");
//            writer.append("Hello World!");
//            writer.flush();

            FileReader reader = new FileReader("fm.sql");
            while (reader.ready()){
                str+=(char)reader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] strings = str.split("\r\n");
        for (int i = 0; i < strings.length; i++) {
            String[] ar = strings[i].split(" ");
//            System.out.println(ar[0] + " " + ar[1].charAt(0) + "." + ar[2].charAt(0) + "." + " " + ar[3] + " " + ar[4]);
            surname.add(ar[0]);
            name.add(ar[1].charAt(0)+".");
            midllename.add(ar[2].charAt(0)+".");
            age.add(Integer.valueOf(ar[3]));
            gender.add(ar[4].equals("М") ? true : false);
            index.add(i);

        }

        for (int i = 0; i < index.size(); i++) {
            System.out.print(surname.get(index.get(i)) + " ");
            System.out.print(name.get(index.get(i)) + " ");
            System.out.print(midllename.get(index.get(i)) + " ");
            System.out.print(age.get(index.get(i)).toString() + " ");
            System.out.print(gender.get(index.get(i)) ? "М" : "Ж");
            System.out.println();

        }
//        System.out.println(str);


    }

}
