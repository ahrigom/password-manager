
public class Account {
    private String website;
    private String username;
    private String password;

    // Constructor (saves the website, username, and password into the specific variables)
    public Account(String website, String username, String password){
        this.website = website;
        this.username = username;
        this.password = password;
    }

    // Getters (retrieve that values of the private instance variables)
    public String getWebsite(){
        return website;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
