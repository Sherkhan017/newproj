class ImagePost extends Post {
    private String imageUrl;
    public ImagePost(int likes, String author, String content, String imageUrl) {
        super(likes, author, content);
        this.imageUrl = imageUrl; }
    @Override
    void showPostinfo() {
        super.showPostinfo();
        System.out.println("Image URL: " + imageUrl);
    }
}