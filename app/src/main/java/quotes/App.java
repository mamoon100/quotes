/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            JsonReader reader = new JsonReader(new FileReader("src/main/resources/recentquotes.json"));
            reader.beginArray();
            ArrayList<Qoute> allQoutes = new ArrayList<>();
            while (reader.hasNext()) {
                Qoute qoute = gson.fromJson(reader, Qoute.class);
                allQoutes.add(qoute);
            }
            reader.endArray();
            if (args.length > 0) {
                switch (args[0]) {
                    case "author":
                        qouteByAuthor(args[1], allQoutes);
                        break;
                    case "contains":
                        qouteByWord(args[1], allQoutes);
                        break;
                    default:
                        break;
                }
            } else {
                int randomQouteIndex = (int) (Math.random() * allQoutes.size());
                System.out.println(allQoutes.get(randomQouteIndex).toString());
            }

        } catch (IOException e) {
            System.out.println("Wrong file path");
//            e.printStackTrace();
        }
    }

    public static ArrayList<Qoute> qouteByAuthor(String name, ArrayList<Qoute> qoutes) {
        ArrayList<Qoute> tempQoute = new ArrayList<>();
        for (Qoute q : qoutes) if (q.getAuthor().contains(name)) tempQoute.add(q);
        int randomQouteIndex = (int) (Math.random() * tempQoute.size());
        System.out.println(tempQoute.get(randomQouteIndex));
        // the return list is only for testing.
        return tempQoute;
    }

    public static ArrayList<Qoute> qouteByWord(String word, ArrayList<Qoute> qoutes) {
        ArrayList<Qoute> tempQoute = new ArrayList<>();
        for (Qoute q : qoutes) if (q.getText().contains(word)) tempQoute.add(q);
        int randomQouteIndex = (int) (Math.random() * tempQoute.size());
        System.out.println(tempQoute.get(randomQouteIndex));
        // the return list is only for testing.
        return tempQoute;
    }

    
}
