public class Getter_Setter {
    public static void main(String args[]){
        BankAccount b1 = new BankAccount();

        
        b1.setPassword("mySecret123");
        b1.setUsername("Ravi");

        
        System.out.println(b1.getPassword());
        System.out.println(b1.getUsername());
    }
}

class BankAccount {
    private String password;
    private String username;

   
    void setPassword(String newPassword) {
        this.password = newPassword;
    }

    
    String getPassword() {
        return this.password;
    }

 
    void setUsername(String newUsername) {
        this.username = newUsername;
    }

   
    String getUsername() {
        return this.username;
    }
}
