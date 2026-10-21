package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;
import software.ulpgc.katas.model.Gender;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class UrlEmployeeReader implements EmployeeReader {

    private final URL url;

    public UrlEmployeeReader(URL url){
        this.url = url;
    }
    @Override
    public List<Employee> readALL() {
        try{
            return loadFrom(url.openStream());
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private List<Employee> loadFrom(InputStream is) throws IOException{
        try (Reader reader = new InputStreamReader(is)){
            return loadFrom(reader);

        }
    }

    private List<Employee> loadFrom(Reader reader) throws IOException{
        return loadFrom((InputStream) new BufferedReader(reader).lines().toList());
    }

    private List<Employee> loadFrom(List<String> lines){
        List<Employee> list = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++){
            list.add(loadFrom(lines.get(i)));
        }
        return list;
    }
    private Employee loadFrom(String line){
        return loadFrom(line.split("\t"));
    }
    private Employee loadFrom(String[] fields){
        return new Employee(fields[0], genderOf(fields[5]));
    }
    private Gender genderOf(String field){
        return field.isEmpty() ? null: Gender.valueOf(field);
    }
}
