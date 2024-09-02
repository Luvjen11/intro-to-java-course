package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()){
            throw new FilenameException("Insert a file please!");
        } else if (filename.endsWith(".java")) {
            return true;
        } else {
            return false;
        }
    }

    public Map<String, Integer> map(List<String> filenames) {

        Map<String, Integer> fileMap = new HashMap<>();

        for (String filename : filenames) {

               if (filename == null || filename.isEmpty()){
                   fileMap.put(filename, -1);
                } else if (filename.contains(".java")) {
                   fileMap.put(filename, 1);
                } else {
                   fileMap.put(filename, 0);
                }
        }
        return fileMap;
    }

}
