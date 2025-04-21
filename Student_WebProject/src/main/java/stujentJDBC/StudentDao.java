package stujentJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentDao implements JDBCDao<Student, Integer> {

    @Override
    public Collection<Student> getAll() {
        Collection<Student> allStudents = new ArrayList<>();
        String sqlQuery = "SELECT * FROM student";
        try (Connection dbConnection = AutoLoading.buildConnection();
             Statement stmt = dbConnection.createStatement();
             ResultSet rs = stmt.executeQuery(sqlQuery)) {

            while (rs.next()) {
                int id = rs.getInt("rollno");
                String name = rs.getString("name");
                String city = rs.getString("city");
                Student student = new Student(id, name, city);
                allStudents.add(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return allStudents;
    }

    @Override
    public Student getOne(Integer sid) {
        Student foundStudent = null;
        String sqlQuery = "SELECT * FROM student WHERE rollno = ?";
        try (Connection dbConnection = AutoLoading.buildConnection();
             PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)) {

            pstmt.setInt(1, sid);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("rollno");
                String name = rs.getString("name");
                String city = rs.getString("city");
                foundStudent = new Student(id, name, city);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return foundStudent;
    }

    @Override
    public void add(Student student) {
        String sqlQuery = "INSERT INTO student(name, city) VALUES(?, ?)";
        try (Connection dbConnection = AutoLoading.buildConnection();
             PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)) {

            pstmt.setString(1, student.getsName());
            pstmt.setString(2, student.getsCity());

            int count = pstmt.executeUpdate();
            System.out.println(count + " record(s) added.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Student student) {
        String sqlQuery = "UPDATE student SET name = ?, city = ? WHERE rollno = ?";
        try (Connection dbConnection = AutoLoading.buildConnection();
             PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)) {

            pstmt.setString(1, student.getsName());
            pstmt.setString(2, student.getsCity());
            pstmt.setInt(3, student.getId());

            int count = pstmt.executeUpdate();
            System.out.println(count + " record(s) updated.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer sid) {
        String sqlQuery = "DELETE FROM student WHERE rollno = ?";
        try (Connection dbConnection = AutoLoading.buildConnection();
             PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery)) {

            pstmt.setInt(1, sid);
            int count = pstmt.executeUpdate();

            if (count > 0) {
                System.out.println(count + " student(s) deleted.");
            } else {
                System.out.println("No student found with ID: " + sid);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
