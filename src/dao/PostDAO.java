package dao;

import database.connectionDB;
import java.sql.*;

public class PostDAO {

    public void insertPost(int id, int likes, String author, String content)
            throws SQLException {

        String sql =
                "INSERT INTO Post (postID, LikesCount, PostAuthor, PostContent) VALUES (?, ?, ?, ?)";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setInt(2, likes);
        ps.setString(3, author);
        ps.setString(4, content);

        ps.executeUpdate();
        conn.close();
    }

    public void updateLikes(int postId, int newLikes)
            throws SQLException {

        String sql =
                "UPDATE Post SET LikesCount = ? WHERE postID = ?";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, newLikes);
        ps.setInt(2, postId);

        ps.executeUpdate();
        conn.close();
    }

    public void deletePost(int postId) throws SQLException {

        String sql = "DELETE FROM Post WHERE postID = ?";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, postId);
        ps.executeUpdate();
        conn.close();
    }

    public void getPopularPosts(int minLikes)
            throws SQLException {

        String sql = "SELECT * FROM Post WHERE LikesCount > ?";

        Connection conn = connectionDB.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, minLikes);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("postID") + " " +
                            rs.getString("PostAuthor") + " " +
                            rs.getInt("LikesCount")
            );
        }

        conn.close();
    }
}
