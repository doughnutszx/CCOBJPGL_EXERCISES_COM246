public class user {

    private String username;
    private String password;

    //
    user(String uname, String pword) {
    this.username = uname;
    this.password = pword;
    }

    // Get method
    public String getUsername(){
        return this.username;
    }
    // Get method
    public String getPassword(){
    return this.password;
    }

}
