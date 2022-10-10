
package Models;


/**
 *
 * @author Lynde Kidd
 */
public class AccountService {
    
    
    private String login1;
    private String login2;
    private String password;

    public AccountService() {
        login1 = "abe"; 
        login2 = "barb";
        password = "password";
    }

    public AccountService(String username1, String username2, String password) {
        this.login1 = login1;
        this.login2 = login2;
        this.password = password;
    }

    public String getUsername1() {
        return login1;
    }

    public void setUsername1(String username1) {
        this.login1 = login1;
    }

    public String getUsername2() {
        return login2;
    }

    public void setUsername2(String username2) {
        this.login2 = login2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

    