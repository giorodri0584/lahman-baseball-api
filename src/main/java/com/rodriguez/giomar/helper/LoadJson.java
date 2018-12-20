package com.rodriguez.giomar.helper;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.nio.file.Files;

public class LoadJson {
    public static String from(String filename) throws Exception{
        File file = new ClassPathResource("json/" + filename).getFile();
        String json = new String(Files.readAllBytes(file.toPath()));
        return json;
    }
}
