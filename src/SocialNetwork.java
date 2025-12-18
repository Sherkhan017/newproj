public class SocialNetwork {
    private int FollowersCount;
    private int PostsCount;
    private int FollowingCount;

    public SocialNetwork(int FollowersCount, int PostsCount, int FollowingCount) {
        this.FollowersCount = FollowersCount;
        this.PostsCount = PostsCount;
        this.FollowingCount = FollowingCount;

    }
void showSocialNetworkinfo() {
    System.out.println("Followers: " + FollowersCount);
    System.out.println("Posts: " + PostsCount);
    System.out.println("Following: " + FollowingCount);
}
public int getFollowersCount() {

        return FollowersCount;
}
public int getPostsCount() {
        return PostsCount;
}
public int getFollowingCount() {
        return FollowingCount;

}
public void setFollowersCount(int FollowersCount) {
        this.FollowersCount = FollowersCount;

}
public void setPostsCount(int PostsCount) {
        this.PostsCount = PostsCount;
}

public void setFollowingCount(int FollowingCount) {
        this.FollowingCount = FollowingCount;
}

}

