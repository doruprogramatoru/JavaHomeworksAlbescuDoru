/*
 * eBooks Store
 */
package ebooksstore;

import java.sql.*;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * For eBooksStore database I used Prepared Statements
 *
 * @author Doru
 */
public class EbooksStore_PreparedStatement {

    /**
     * insertAuthors inserts a new record to AUTHORS table
     *
     * @param sISBN
     * @param sFirst_Name
     * @param sFamily_Name
     * @throws SQLException
     */
    public static void insertAuthors(String sISBN, String sFirst_Name, String sFamily_Name) throws SQLException {

        String user = "APP";
        String password = "APP";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String DML = "INSERT INTO AUTHORS (ISBN,FIRST_NAME,FAMILY_NAME)VALUES (?,?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sISBN);
            pstmnt.setString(2, sFirst_Name);
            pstmnt.setString(3, sFamily_Name);
            pstmnt.execute();

            System.out.println("A new author is inserted into AUTHORS table!");
            resultSet = statement.executeQuery("SELECT * FROM AUTHORS");

            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                String currentISBN = "";
                String currentFirst_Name = "";
                String currentFamily_Name = "";
                System.out.println("ISBN           FIRST_NAME      FAMILY_NAME");
                System.out.println("==========================================");
                do {
                    currentISBN = resultSet.getString(1);
                    currentFirst_Name = resultSet.getString(2);
                    currentFamily_Name = resultSet.getString(3);
                    //System.out.println(currentISBN + "   " + currentFirst_Name + "   " + currentFamily_Name);
                    StringBuilder sb = new StringBuilder();
                    Formatter formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s   %2$-14s %3$-25s ", currentISBN, currentFirst_Name, currentFamily_Name);
                    System.out.println(sb.toString());
                    // display the content of table AUTHORS row by row
                } while (resultSet.next());
            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * insertBooks inserts a new record to BOOKS table
     *
     * @param sISBN
     * @param sTitle
     * @param sPublishing
     * @param sCategory
     * @param sPrice
     * @param sPages
     * @throws SQLException
     */
    public static void insertBooks(String sISBN, String sTitle, String sPublishing, String sCategory, float sPrice, int sPages) throws SQLException {

        String user = "APP";
        String password = "APP";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            //statement.execute("DELETE FROM EBOOKS WHERE ISBN='9786069267974'");
            String DML = "INSERT INTO EBOOKS (ISBN,TITLE,PUBLISHING,CATEGORY,PRICE,PAGES)VALUES (?,?,?,?,?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sISBN);
            pstmnt.setString(2, sTitle);
            pstmnt.setString(3, sPublishing);
            pstmnt.setString(4, sCategory);
            pstmnt.setFloat(5, (float) sPrice);
            pstmnt.setInt(6, (int) sPages);
            pstmnt.execute();

            System.out.println("A new book is inserted into BOOKS table!");
            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");

            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                String currentISBN = "";
                String currentTitle = "";
                String currentPublishing = "";
                String currentCategory = "";
                double currentPrice = 0;
                int currentPages = 0;
                System.out.println("  ISBN            TITLE                  PUBLISHING                CATEGORY              PRICE     PAGES");
                System.out.println("==========================================================================================================");
                do {
                    currentISBN = resultSet.getString(1);
                    currentTitle = resultSet.getString(2);
                    currentPublishing = resultSet.getString(3);
                    currentCategory = resultSet.getString(4);
                    currentPrice = resultSet.getFloat(5);
                    currentPages = resultSet.getInt(6);
                    //System.out.println(currentISBN + "     " + currentTitle + "      " + currentPublishing + "       " + currentCategory + "       " + currentPrice + "       " + currentPages);
                    StringBuilder sb = new StringBuilder();
                    Formatter formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s   %2$-25s %3$-25s %4$-21s %5$-10s %6$-3s ", currentISBN, currentTitle, currentPublishing, currentCategory, currentPrice, currentPages);
                    System.out.println(sb.toString());
                } while (resultSet.next());

            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * deleteBooks deletes a record from BOOKS table
     *
     * @param sISBN
     * @throws SQLException
     */
    public static void deleteBooks(String sISBN) throws SQLException {

        String user = "APP";
        String password = "APP";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            String DML = "DELETE FROM EBOOKS WHERE ISBN=? ";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sISBN);
            /*pstmnt.setString(2, sTitle);
            pstmnt.setString(3, sPublishing);
            pstmnt.setString(4, sCategory);
            pstmnt.setFloat(5, (float) sPrice);
            pstmnt.setInt(6, (int) sPages);;*/
            pstmnt.execute();

            System.out.println("The book number: " + sISBN + " was deleted from the database!");

            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");

            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                String currentISBN = "";
                String currentTitle = "";
                String currentPublishing = "";
                String currentCategory = "";
                double currentPrice = 0;
                int currentPages = 0;
                System.out.println("  ISBN            TITLE                  PUBLISHING                CATEGORY              PRICE     PAGES");
                System.out.println("==========================================================================================================");
                do {
                    currentISBN = resultSet.getString(1);
                    currentTitle = resultSet.getString(2);
                    currentPublishing = resultSet.getString(3);
                    currentCategory = resultSet.getString(4);
                    currentPrice = resultSet.getFloat(5);
                    currentPages = resultSet.getInt(6);
                    //System.out.println(currentISBN + "     " + currentTitle + "      " + currentPublishing + "       " + currentCategory + "       " + currentPrice + "       " + currentPages);
                    StringBuilder sb = new StringBuilder();
                    Formatter formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s   %2$-25s %3$-25s %4$-21s %5$-10s %6$-3s ", currentISBN, currentTitle, currentPublishing, currentCategory, currentPrice, currentPages);
                    System.out.println(sb.toString());
                } while (resultSet.next());

            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * displayBooks displays all the records from BOOKS table
     *
     * @param
     * @throws SQLException
     */
    public static void displayBooks() throws SQLException {

        String user = "APP";
        String password = "APP";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM EBOOKS");

            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                String currentISBN = "";
                String currentTitle = "";
                String currentPublishing = "";
                String currentCategory = "";
                double currentPrice = 0;
                int currentPages = 0;
                System.out.println("  ISBN            TITLE                  PUBLISHING                CATEGORY              PRICE     PAGES");
                System.out.println("==========================================================================================================");
                do {
                    currentISBN = resultSet.getString(1);
                    currentTitle = resultSet.getString(2);
                    currentPublishing = resultSet.getString(3);
                    currentCategory = resultSet.getString(4);
                    currentPrice = resultSet.getFloat(5);
                    currentPages = resultSet.getInt(6);
                    //System.out.println(currentISBN + "     " + currentTitle + "      " + currentPublishing + "       " + currentCategory + "       " + currentPrice + "       " + currentPages);
                    StringBuilder sb = new StringBuilder();
                    Formatter formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-13s   %2$-25s %3$-25s %4$-21s %5$-10s %6$-3s ", currentISBN, currentTitle, currentPublishing, currentCategory, currentPrice, currentPages);
                    System.out.println(sb.toString());
                } while (resultSet.next());

            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * addRating inserts a new Rating record to RATINGS table
     *
     * @param sISBN
     * @param sTitle
     * @param sRating
     * @param sUser
     * @throws SQLException
     */
    public static void addRating(String sISBN, String sTitle, Integer sRating, String sUser) throws SQLException {

        String user = "APP";
        String password = "APP";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
            String DML = "INSERT INTO RATINGS (ISBN, USER_RATINGS, USER_CNP, BOOK_TITLE)VALUES (?,?,?,?)";
            PreparedStatement pstmnt = connection.prepareStatement(DML);
            pstmnt.setString(1, sISBN);
            pstmnt.setInt(2, sRating);
            pstmnt.setString(3, sUser);
            pstmnt.setString(4, sTitle);
            pstmnt.execute();

            System.out.println("A book was rated!");
            resultSet = statement.executeQuery("SELECT * FROM RATINGS");
            //statement.execute("SELECT * FROM RATINGS");
            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                String currentISBN = "";
                Integer currentRating = 0;
                String currentUser = "";
                String currentTitle = "";

                System.out.println("    ISBN       RATINGS     USER_CNP             TITLE");
                System.out.println("==================================================================");
                do {
                    currentISBN = resultSet.getString(1);
                    currentRating = resultSet.getInt(2);
                    currentUser = resultSet.getString(3);
                    currentTitle = resultSet.getString(4);
                    System.out.println(currentISBN + "     " + currentRating + "     " + currentUser + "      " + currentTitle);
                } while (resultSet.next());

            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    /**
     * displayRecords displays all the records from BOOKS table, AUTHORS table and RATINGS table
     *
     * @param
     * @throws SQLException
     */
    public static void displayRecords() throws SQLException {

        String user = "APP";
        String password = "APP";
        String url = "jdbc:derby://localhost:1527/ebooksstore;create=true";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class driverClass = Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT EBOOKS.ISBN, EBOOKS.TITLE, AUTHORS.FIRST_NAME, AUTHORS.FAMILY_NAME, EBOOKS.PUBLISHING, EBOOKS.CATEGORY, EBOOKS.PRICE, EBOOKS.PAGES, RATINGS.USER_RATINGS\n"
                    + "FROM EBOOKS,AUTHORS, RATINGS\n"
                    + "WHERE EBOOKS.ISBN=AUTHORS.ISBN AND EBOOKS.ISBN=RATINGS.ISBN AND AUTHORS.ISBN=RATINGS.ISBN");

            boolean resultSetHasRows = resultSet.next();
            if (resultSetHasRows) {
                String currentISBN = "";
                String currentTitle = "";
                String currentFirst_Name = "";
                String currentFamily_Name = "";
                String currentPublishing = "";
                String currentCategory = "";
                String currentPrice = "";
                String currentPages = "";
                String currentRating = "";

                System.out.println("    ISBN             TITLE                  AUTHOR               PUBLISHING           CATEGORY       PRICE     PAGES    RATING");
                System.out.println("==================================================================================================================================");
                do {
                    currentISBN = resultSet.getString(1);
                    currentTitle = resultSet.getString(2);
                    currentFirst_Name = resultSet.getString(3);
                    currentFamily_Name = resultSet.getString(4);
                    currentPublishing = resultSet.getString(5);
                    currentCategory = resultSet.getString(6);
                    currentPrice = resultSet.getString(7);
                    currentPages = resultSet.getString(8);
                    currentRating = resultSet.getString(9);

                    //System.out.println(currentISBN + "     " + currentTitle+ "     " + currentFirst_Name + "     " + currentFamily_Name + "      " + currentPublishing + "      " + currentCategory + "       " + currentPrice + "       " + currentPages + "       " + currentRating);
                    StringBuilder sb = new StringBuilder();
                    Formatter formatter = new Formatter(sb, Locale.US);
                    formatter.format("%1$-14s %2$-22s %3$-11s %4$-15s %5$-18s %6$-15s %7$-10s %8$-10s %9$-3s", currentISBN, currentTitle, currentFirst_Name, currentFamily_Name, currentPublishing, currentCategory, currentPrice, currentPages, currentRating);
                    System.out.println(sb.toString());
                } while (resultSet.next());

            } else {
                System.out.println("No rows found in ResultSet");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            //insertAuthors("9786069267974", "DAN", "DUMITRESCU");
            //insertBooks("9786069267974", "JOCURI DE CAZINO", "SANDA", "ENTERTAINMENT", (float) 21.50, 160);
            //deleteBooks("9786069267974");
            //displayBooks();
            //addRating("9786069267974", "JOCURI DE CAZINO", 3, "2680507121212");
            displayRecords();
        } catch (SQLException ex) {
            Logger.getLogger(EbooksStore_PreparedStatement.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
