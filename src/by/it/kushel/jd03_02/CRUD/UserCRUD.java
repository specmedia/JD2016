package by.it.kushel.jd03_02.Crud;

import by.it.akhmelev.jd03_02.ConnectionCreator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserCRUD {

    public User create(User user) throws SQLException {
        user.setID(0);

        String createUserSQL = String.format(
                "insert into users(Login,Password,Email) values('%s','%s','%s');",
                user.getLogin(), user.getPassword(), user.getEmail()
        );
        try (

                Connection connection = ConnectionCreator.getConnection();
                Statement statement = connection.createStatement();
        ) {

            if (statement.executeUpdate(createUserSQL) == 1)
            {

                ResultSet resultSet = statement.executeQuery("SELECT LAST_INSERT_ID();");

                if (resultSet.next())
                    user.setID(resultSet.getInt(1));
            }
        } catch (SQLException e) {
            throw e;
        }
        return user;
    }

    public User read(int id) throws SQLException {
        User userResult = null;
        String readUserSQL = "SELECT * FROM users where ID=" + id;
        try (
                Connection connection = ConnectionCreator.getConnection();
                Statement statement = connection.createStatement();
        ) {
            final ResultSet resultSet = statement.executeQuery(readUserSQL);
            if (resultSet.next()) {
                userResult = new User(
                        resultSet.getInt("ID"),
                        resultSet.getString("Login"),
                        resultSet.getString("Email"),
                        resultSet.getString("Password"));
            }
        } catch (SQLException e) {
            throw e;
        }
        return userResult;
    }

    public User update(User user) throws SQLException {
        User userResult = null;
        String updateUserSQL = String.format(
                "UPDATE kushel.users SET Login = '%s', Password = '%s', Email = '%s' WHERE users.ID = %d",
                user.getLogin(), user.getPassword(), user.getEmail(), user.getID()
        );
        try (
                Connection connection = ConnectionCreator.getConnection();
                Statement statement = connection.createStatement();
        ) {
            if (statement.executeUpdate(updateUserSQL) == 1)
                userResult = user;
        } catch (SQLException e) {
            throw e;
        }
        return userResult;
    }

    public boolean delete(User user) throws SQLException {
        String deleteUserSQL = String.format("DELETE FROM kushel.users WHERE kushel.users.ID = %d", user.getID());
        try (
                Connection connection = ConnectionCreator.getConnection();
                Statement statement = connection.createStatement();
        ) {
            return (statement.executeUpdate(deleteUserSQL) == 1);
        } catch (SQLException e) {
            throw e;
        }
    }


}
