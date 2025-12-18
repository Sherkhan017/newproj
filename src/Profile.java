public class Profile {
    private int Age;
    private String UserName;
    private String ProfileINfo;
    public Profile(int Age, String UserName, String ProfileINfo) {
        this.Age = Age;
        this.UserName = UserName;
        this.ProfileINfo = ProfileINfo;
    }
    void verifyProfile(){
     if (Age < 18) {
        System.out.println("You are not able to register");
    }
    else {
        System.out.println("Age: " + Age);
    }
    if (UserName == null) {
        System.out.println("Enter your name please!");
    }
    else {
        System.out.println("UserName: " + UserName);
    }
    if (ProfileINfo == null) {
        System.out.println("Enter your profile please!");
    }
    else {
        System.out.println("ProfileINfo: " + ProfileINfo);
    }
    }
    public int getAge() {
        return Age;
    }
    public String getUserName() {
        return UserName;
    }
    public String getProfileINfo() {
        return ProfileINfo;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setUserName(String UserName) {
        this.UserName = UserName;

    }
    public void setProfileINfo(String ProfilePicture) {
        this.ProfileINfo = ProfilePicture;
    }
}
