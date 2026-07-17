package core.basesyntax.ServiceImpl;

import java.io.BufferedWriter;
import java.io.IOException;

import core.basesyntax.dao.FileWriter;

public class FileWriterImpl implements FileWriter {

    @Override
    public void write(String inputFile, String fileToRewrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new java.io.FileWriter(fileToRewrite))) {
            bufferedWriter.write(inputFile);
        } catch (IOException e) {
            throw new RuntimeException("Can't write data to the file " + fileToRewrite, e);
        }
    }

}
