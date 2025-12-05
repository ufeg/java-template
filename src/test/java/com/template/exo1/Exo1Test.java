package com.template.exo1;

import com.template.tools.FileHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Exo1Test {


    private Exo1 exo1;
    private final String PATH_EXO1 = "exo1/exo1-example.txt";


    @BeforeEach
    void setup(){
        exo1 = new Exo1();
    }

    @Test
    public void doit_retourner_liste(){
        exo1.processFile(FileHandler.openFileFromPath(FileHandler.PATH_GENERAL + PATH_EXO1));
    }
}
