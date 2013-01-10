/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospiceapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author workstation
 */
public class StudentDAO {
    Connection connection = null;
        PreparedStatement ptmt = null;
        ResultSet resultSet = null;

        public StudentDAO() {

        }

        private Connection getConnection() throws SQLException {
                Connection conn;
                conn = ConnectionFactory.getInstance().getConnection();
                return conn;
        }

        public void add(Student studentInstance) {
                try {
                        String queryString = "INSERT INTO students(name, EGN, course, "
                                + "specialty, address, isOrphan, isMarried, isLonelyParent, hasRelatives, "
                                + "achievement, status) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                        connection = getConnection();
                        ptmt = connection.prepareStatement(queryString);
                        ptmt.setString(1, studentInstance.getName());
                        ptmt.setInt(2, studentInstance.getEGN());
                        ptmt.setInt(3, studentInstance.getCourse());
                        ptmt.setString(4, studentInstance.getSpecialty());
                        ptmt.setString(5, studentInstance.getAddress());
                        ptmt.setInt(6, studentInstance.getIsOrphan());
                        ptmt.setInt(7, studentInstance.getIsMarried());
                        ptmt.setInt(8, studentInstance.getIsLonelyParent());
                        ptmt.setInt(9, studentInstance.getHasRelatives());
                        ptmt.setDouble(10, studentInstance.getAchievement());
                        ptmt.setInt(11, studentInstance.getStatus());
                        ptmt.executeUpdate();
                        System.out.println("Data Added Successfully");
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (ptmt != null)
                                        ptmt.close();
                                if (connection != null)
                                        connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        } catch (Exception e) {
                                e.printStackTrace();
                        }

                }

        }

        public void update(Student studentInstance) {

                try {
                        String queryString = "UPDATE student SET name=?, SET EGN=?,"
                                + " SET course=?, SET specialty=?, SET address=?,"
                                + " SET isOrphan=?, SET isMarried=?, SET isLonelyParent=?,"
                                + " SET hasRelatives=?, SET achievement=?,"
                                + " SET status=? WHERE idNumber=?";
                        connection = getConnection();
                        ptmt = connection.prepareStatement(queryString);
                        ptmt.setString(1, studentInstance.getName());
                        ptmt.setInt(2, studentInstance.getEGN());
                        ptmt.setInt(3, studentInstance.getCourse());
                        ptmt.setString(4, studentInstance.getSpecialty());
                        ptmt.setString(5, studentInstance.getAddress());
                        ptmt.setInt(6, studentInstance.getIsOrphan());
                        ptmt.setInt(7, studentInstance.getIsMarried());
                        ptmt.setInt(8, studentInstance.getIsLonelyParent());
                        ptmt.setInt(9, studentInstance.getHasRelatives());
                        ptmt.setDouble(10, studentInstance.getAchievement());
                        ptmt.setInt(11, studentInstance.getStatus());
                        ptmt.executeUpdate();
                        System.out.println("Table Updated Successfully");
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (ptmt != null)
                                        ptmt.close();
                                if (connection != null)
                                        connection.close();
                        }

                        catch (SQLException e) {
                                e.printStackTrace();
                        } catch (Exception e) {
                                e.printStackTrace();

                        }
                }
        }

        public void delete(int idNumber) {

                try {
                        String queryString = "DELETE FROM student WHERE idNumber=?";
                        connection = getConnection();
                        ptmt = connection.prepareStatement(queryString);
                        ptmt.setInt(1, idNumber);
                        ptmt.executeUpdate();
                        System.out.println("Data deleted Successfully");
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (ptmt != null)
                                        ptmt.close();
                                if (connection != null)
                                        connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        } catch (Exception e) {
                                e.printStackTrace();
                        }

                }

        }

        public void findAll() {
                try {
                        String queryString = "SELECT * FROM student";
                        connection = getConnection();
                        ptmt = connection.prepareStatement(queryString);
                        resultSet = ptmt.executeQuery();
                        while (resultSet.next()) {
                                System.out.println("idNumber " + resultSet.getInt("idNumber")
                                                + ", Name " + resultSet.getString("Name") +
                                                ", EGN " + resultSet.getInt("EGN") + 
                                                ", Course " + resultSet.getInt("Course") + 
                                                ", Specialty " + resultSet.getString("Specialty") +
                                                ", Address "  + resultSet.getString("Address") +
                                                ", isOrphan " + resultSet.getInt("isOrphan") +
                                                ", isMarried " + resultSet.getInt("isMarried") +
                                                ", isLonelyParent " + resultSet.getInt("isLonelyParent") +
                                                ", hasRelatives " + resultSet.getInt("hasRelatives") +
                                                ", achievement " + resultSet.getDouble("achievement") +
                                                ", status " + resultSet.getInt("status"));
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                } finally {
                        try {
                                if (resultSet != null)
                                        resultSet.close();
                                if (ptmt != null)
                                        ptmt.close();
                                if (connection != null)
                                        connection.close();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        } catch (Exception e) {
                                e.printStackTrace();
                        }

                }
        }
}