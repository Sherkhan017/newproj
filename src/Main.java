public class Main {
    public static void main(String[] args){
        Profile n1 = new Profile(17,"@sherkhan","student");
        Post p1 = new Post(1000,"@sherkhan","My Holiday");
        SocialNetwork s1 =  new SocialNetwork(100,5,90);
        n1.verifyProfile();
        p1.showPostinfo();
        s1.showSocialNetworkinfo();
    }

}