package by.anton.shapes.reader;

import by.anton.shapes.exception.CustomReaderException;
import by.anton.shapes.exception.EmptyStringException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.anton.shapes.validator.EmptyStringValidator.*;

public class DataRectangleReader {
    public List<String> readDataFromFile(String fileAddress)
            throws CustomReaderException{

        Path path = Paths.get(fileAddress);

        if(!Files.exists(path)){
            throw new CustomReaderException();
        }

        List<String> data;
        try(Stream<String> strings = Files.lines(path)) {
            data = strings.collect(Collectors.toList());
        } catch (IOException e) {
            throw new CustomReaderException();
        }
        return data;
    }
}
