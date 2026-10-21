package software.ulpgc.katas;

import software.ulpgc.katas.io.UrlEmployeeReader;
import software.ulpgc.katas.model.Employee;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Main {
    static void main() throws MalformedURLException {
        URL url = new URL("https://raw.githubusercontent.com/sachin365123/CSV-files-for-Data-Science-and-Machine-Learning/refs/heads/main/Employee%20Dataset%20-%20TSV.txt?utm_source=chatgpt.com");
        UrlEmployeeReader reader = new UrlEmployeeReader(url);
        List<Employee> employees = reader.readALL();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
