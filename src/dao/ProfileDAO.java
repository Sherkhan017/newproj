package dao;

import database.connectionDB;
import java.sql.*;

public class ProfileDAO {

    public void insertProfile(int id, int age, String username, String info)
            throws SQLException {

        String sql =
                "INSERT INTO Profile (profileID, Age, Username, Profileinfo) VALUES (?, ?, ?, ?)";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setInt(2, age);
        ps.setString(3, username);
        ps.setString(4, info);

        ps.executeUpdate();
        conn.close();
    }

    public void updateProfileInfo(int id, String newInfo)
            throws SQLException {

        String sql =
                "UPDATE Profile SET Profileinfo = ? WHERE profileID = ?";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, newInfo);
        ps.setInt(2, id);

        ps.executeUpdate();
        conn.close();
    }

    public void deleteProfile(int id) throws SQLException {

        String sql = "DELETE FROM Profile WHERE profileID = ?";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, id);
        ps.executeUpdate();
        conn.close();
    }

    public void getAllProfiles() throws SQLException {

        String sql = "SELECT * FROM Profile";

        Connection conn = connectionDB.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("profileID") + " " +
                            rs.getString("Username") + " " +
                            rs.getInt("Age")
            );
        }

        conn.close();
    }
}
