package cn.lizihao.koth.utils;

import java.io.*;
import java.nio.file.Files;

public class FileUtils {
    public static String readFile(File file) throws IOException {
        StringBuffer sb = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Files.newInputStream(file.toPath())))) {
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        }
        return sb.toString();
    }
}
