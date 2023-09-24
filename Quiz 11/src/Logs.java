/*
Implement the public void createLogsTable(java.sql.Connection connection, int entriesCount) method
that creates a Logs table withe fields Id (INT) and Message (VARCHAR(1000)) and inserts entriesCount row
with ids from 1 to  entriesCount and empty message. Use the following connection string: jdbc:h2:mem:sample.

Himt: You can test locally the solution with the following Maven dependency for an embedded H2 database:
 https://mvnrepository.com/artifact/com.h2database/h2/2.2.222
*/


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Logs {
    public void createLogsTable(Connection connection, int entriesCount) {
        try {
            String createTableQuery = "CREATE TABLE Logs (Id INT PRIMARY KEY, Message VARCHAR(1000))";
            try (PreparedStatement createTableStatement = connection.prepareStatement(createTableQuery)) {
                createTableStatement.executeUpdate();
            }
            String insertQuery = "INSERT INTO Logs (Id, Message) VALUES (?, ?)";
            try (PreparedStatement insertStatement = connection.prepareStatement(insertQuery)) {
                for (int i = 1; i <= entriesCount; i++) {
                    insertStatement.setInt(1, i);
                    insertStatement.setString(2, "");
                    insertStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
