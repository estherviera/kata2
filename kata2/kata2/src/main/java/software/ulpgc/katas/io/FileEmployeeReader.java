package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;

import java.io.File;
import java.util.List;

public class FileEmployeeReader implements EmployeeReader {
    public FileEmployeeReader(File file) {
        this.file = file;
    }

    private final File file;

    @Override
    public List<Employee> readAll() {
        return List.of();
    }
}
