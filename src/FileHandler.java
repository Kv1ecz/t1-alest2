import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    public ArrayList<String> reader(String path) throws IOException {
        ArrayList<String> linhas = new ArrayList<>();
        BufferedReader buffRead = new BufferedReader(new java.io.FileReader(path));
        String fileAsString = "";
        String line = "";
        while (true) {
            if (line != null) {
                linhas.add(line);
            } else
                break;
            line = buffRead.readLine();
        }
        buffRead.close();

        return linhas;
    }
}
