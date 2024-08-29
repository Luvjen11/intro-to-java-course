package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    public boolean check(String filename) throws FilenameException {
        if (filename.isEmpty()){
            // throws FilenameException;
        } else if (filename.endsWith(".java")) {
            return true;
        } else {
            return false;
        }
    }

    public Map<String, Integer> map(List<String> filenames) {

        Map<String, Integer> fileMap = new HashMap<>();
    }

}
