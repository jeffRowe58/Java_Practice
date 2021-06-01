package Oop;

public class User {
    public int id;
    private String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

    public User(String username, String password, String email, boolean isLoggedIn){
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLoggedIn = isLoggedIn;
    }

    public User(int id, String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(){};

        public String setPassword(String password){
        return this.password = password;
}

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getPassword(){
        return password;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void describeUser(){
        System.out.println("ID: " + this.id);
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Email: " + this.email);
    }

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "jeffRowe";
        testUser.password = "myPass";
        testUser.email = "jeffRowe@gmail.com";

//        System.out.println("Username: " + testUser.username);
//        System.out.println("Password: " + testUser.password);
//        System.out.println("Email: " + testUser.email);


        User user2 = new User(1,"codeup-dude", "gocodeup", "codeup@email.com");

//        System.out.println("Username: " + user2.username);
//        System.out.println("Password: " + user2.password);
//        System.out.println("Email: " + user2.email);
    }
}
