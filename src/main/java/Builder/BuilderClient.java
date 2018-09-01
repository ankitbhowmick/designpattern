package Builder;

/**
 * @author ankitbhowmick@hotmail.com
 * 1/9/18 11:49 PM
 */
public class BuilderClient {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .setEmail("jon@example.com")
                .setNewsletter(true)
                .build();

        System.out.println(newAccount);
    }
}
