/*
 * Stack traces Contact Repository
 */
package exception;

/**
 * Stack traces Contact Repository
 *
 * @author Doru
 */
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileWriter;

public class ExampleContactRepository {

    static class ContactRepository {

        String file;

        ContactRepository(String file) {
            this.file = file;
        }

        void saveContact(String name, String email) {
            String row = name + "," + email + "\n";
            writeRow(row);
        }

        void writeRow(String row) {
            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
                out.write(row);
                out.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ContactRepository repo = new ContactRepository("C:\\Users\\Doru\\Documents\\JAVA\\7\\file.txt");
        repo.saveContact("Adrian", "123");
    }
}
