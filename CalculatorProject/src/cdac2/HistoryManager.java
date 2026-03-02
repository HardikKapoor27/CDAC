package cdac2;
import java.io.*;
import java.util.*;

public class HistoryManager {

    private static final String FILE_NAME = "history.txt";

    public static void save(String record) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(record + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> read() {
        List<String> list = new ArrayList<>();
        File file = new File(FILE_NAME);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}