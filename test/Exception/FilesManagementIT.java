/*
 * For the class FilesManagement.java without main, I create JUnit based unitary tests using TDD.
 */
package Exception;

import exception.FilesManagement;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit based unitary tests using TDD
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
        String content = "";
        FilesManagement instance = new FilesManagement();
        instance.writeStringFile(file, content);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of readStringFile method, of class FilesManagement.
     */
    @Test
    public void testReadStringFile() throws Exception {
        System.out.println("readStringFile");
        String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\Star Wars.txt";
        FilesManagement instance = new FilesManagement();
        String expResult = "";
        String result = instance.readStringFile(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of addStringToFile method, of class FilesManagement.
     */
    @Test
    public void testAddStringToFile() throws Exception {
        System.out.println("addStringToFile");
        String file = "C:\\Users\\Doru\\Documents\\JAVA\\7\\Star Wars.txt";
        String content = "";
        FilesManagement instance = new FilesManagement();
        instance.addStringToFile(file, content);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
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
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
