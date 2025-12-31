import java.util.Objects;

abstract class Post {
    private int LikesCount;
    private String postAuthor;
    private String postContent;

    public Post(int LikesCount, String postAuthor, String postContent) {
        this.LikesCount = LikesCount;
        this.postAuthor = postAuthor;
        this.postContent = postContent;
    }

    void showPostinfo()
    {
    }

    public int getLikesCount() {
        return LikesCount;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public String getPostContent() {
        return postContent;
    }

    @Override
    public String toString() {
        return "Post{" +
                "likes=" + LikesCount +
                ", author='" + postAuthor + '\'' +
                ", content='" + postContent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        Post post = (Post) o;

        return postAuthor.equals(post.postAuthor)
                && postContent.equals(post.postContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postAuthor, postContent);
    }
}


