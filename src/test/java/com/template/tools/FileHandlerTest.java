package com.template.tools;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FileHandlerTest {

    @Test
    public void doit_retourner_une_liste_string_a_partir_le_path_en_entree(){

        String path = "c:/users/awarin/.bashrc";

        List<String> list = FileHandler.openFileFromPath(path);

        Assertions.assertThat(list.size()).isNotZero();
        Assertions.assertThat(list).isInstanceOf(List.class);
    }

}
