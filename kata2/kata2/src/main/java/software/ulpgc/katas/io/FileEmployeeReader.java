package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;

import java.io.File;
import java.util.List;

public abstract class FileEmployeeReader implements EmployeeReader {

    public final File file;

    public FileEmployeeReader(File file){
        this.file = file;
    }

    @Override
    public List<Employee> readALL() {
        return List.of();
    }

}
