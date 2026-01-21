import dao.ProfileDAO;
import dao.PostDAO;

public class Main {
    public static void main(String[] args) throws Exception {

        ProfileDAO profileDAO = new ProfileDAO();
        PostDAO postDAO = new PostDAO();

        profileDAO.insertProfile(6700, 20, "@demo", "test user");
        profileDAO.getAllProfiles();

        postDAO.insertPost(5600, 2000, "Demo", "Hello JDBC");
        postDAO.getPopularPosts(1000);
    }
}

