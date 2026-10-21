package software.ulpgc.katas;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Main2 {
    static void main() throws MalformedURLException {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt?utm_source=chatgpt.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        File file = new File("employees.tsv");
        try (InputStream is = url.openStream();
             OutputStream os = new FileOutputStream(file)){
            os.write(is.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
