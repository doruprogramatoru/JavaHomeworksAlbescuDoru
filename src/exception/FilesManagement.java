/*
 * Files Management
 */
package exception;

import java.io.*;
import java.io.IOException;

/**
 * Write a class named FilesManagement having four methods
 *
 * @author Doru
 */
public class FilesManagement {

// 1.First method write a string into a file specified as parameter
    public void writeStringFile(String file, String content) throws IOException {
        writeStringToFile(file, content, false);
    }

// 2.Second method read into a string, if exists, the whole content of a specified file as parameter
    public String readStringFile(String file) throws IOException {
        BufferedReader reader = null;
        String content = "";
        try {
            reader = createReader(file);
            String line = "";
            while ((line = reader.readLine()) != null) {
                content += line;
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return content;
    }

    // 3.The third method add a string content into an empty file specified as parameter
    public void addStringToFile(String file, String content) throws IOException {
        writeStringToFile(file, content, true);
    }

    // 4.The final method delete a content of a specified file as parameter
    public void deleteFileContent(String file) throws IOException {
        writeStringToFile(file, "", false);
    }

    private void writeStringToFile(String file, String content, boolean append) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = createWriter(file, append);
            writer.write(content);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    private BufferedWriter createWriter(String file, boolean append) throws IOException {
        return new BufferedWriter(new FileWriter(file, append));
    }

    private BufferedReader createReader(String file) throws IOException {
        return new BufferedReader(new FileReader(file));
    }
}
