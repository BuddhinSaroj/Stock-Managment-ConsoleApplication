import java.util.HashMap;

public class RegisteredUsers {

    private String userName;
    private String userPassword;
    private HashMap<String,String> loginDetails = new HashMap<String,String>();

//    HashMap<String,String> loginDetails = new HashMap<String,String>();

    RegisteredUsers(){
//        loginDetails.put(userName,userPassword);
//        loginDetails.put("user02","abc");
//        loginDetails.put("user03","abc123");
    }

    public HashMap<String, String> getLoginDetails() {
        return loginDetails;
    }

    public void setLoginDetails(String key,String value) {
        this.loginDetails.put(key,value);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
