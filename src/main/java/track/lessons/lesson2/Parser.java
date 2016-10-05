package track.lessons.lesson2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 *
 */
public class Parser {

    public Document parse(String data) {
        Document doc = new Document();
        doc.tokens = data.split(" ");
        return doc;
    }

    public static void main(String[] args) throws Exception {

        String path = "path/to/file";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String fileAsText = null;
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader buffer = new BufferedReader(in)) {
            fileAsText = buffer.lines().collect(Collectors.joining());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Parser parser = new Parser();
        Document doc = parser.parse(fileAsText);
    }
}
