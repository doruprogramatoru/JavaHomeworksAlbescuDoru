/*
 * For the class FilesManagement.java, without main, I create JUnit based unitary tests.
 */
package Exception;

import exception.FilesManagement;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit based unitary test
 *
 * @author Doru
 */
public class FilesManagementIT {

    public FilesManagementIT() {
    }

    /**
     * Test of writeStringFile method, of class FilesManagement.
     */
    @Test
    public void testWriteStringFile() throws Exception {
        System.out.println("writeStringFile");
        String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\Star Wars.txt";
        String content = "Use the Force, Luke! ";
        FilesManagement instance = new FilesManagement();
        instance.writeStringFile(file, content);
    }

    /**
     * Test of readStringFile method, of class FilesManagement.
     */
    @Test
    public void testReadStringFile() throws Exception {
        System.out.println("readStringFile");
        String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\Star Wars.txt";
        FilesManagement instance = new FilesManagement();
        String expResult = "Use the Force, Luke! May the Force be with you!";
        String result = instance.readStringFile(file);
        assertEquals(expResult, result);
    }

    /**
     * Test of addStringToFile method, of class FilesManagement.
     */
    @Test
    public void testAddStringToFile() throws Exception {
        System.out.println("addStringToFile");
        String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\Star Wars.txt";
        String content = "May the Force be with you!";
        FilesManagement instance = new FilesManagement();
        instance.addStringToFile(file, content);
    }

    /**
     * Test of deleteFileContent method, of class FilesManagement.
     */
    @Test
    public void testDeleteFileContent() throws Exception {
        System.out.println("deleteFileContent");
        String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\Star Wars.txt";
        FilesManagement instance = new FilesManagement();
        instance.deleteFileContent(file);
    }

}
