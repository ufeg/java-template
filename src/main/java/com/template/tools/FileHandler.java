package com.template.tools;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileHandler {

    public static final String PATH_GENERAL = "src/test/resources/";

    public static List<String> openFileFromPath(String path){
        try {
            return Files.readAllLines(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
