public class Post {
    private int LikesCount;
    private String postAuthor;
    private String postContent;

    public Post(int LikesCount, String postAuthor, String postContent) {
        this.LikesCount = LikesCount;
        this.postAuthor = postAuthor;
        this.postContent = postContent;
    }
    void showPostinfo(){
        System.out.println("Likes: " + LikesCount);
        System.out.println("Author: " + postAuthor);
        System.out.println("Post Content: " + postContent);
    }

    public int getLikesCount() {
        return LikesCount;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getPostAuthor() {
        return postAuthor;
    }
    public void setLikesCount(int likesCount) {
        this.LikesCount = likesCount;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }
    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

}
