package core.basesyntax.ServiceImpl;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import core.basesyntax.dao.FileReader;

public class FileReaderImpl implements FileReader {

    @Override    
    public List<String> read(String fileName){
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(fileName))){
            List<String> lines = new ArrayList<>();
            String line;
            while((line = reader.readLine()) != null){
                lines.add(line);
            }
        return lines;    

        } catch (Exception e) {
            throw new RuntimeException("Unable to read the file: " + e);
        }
        
        
    }
}
