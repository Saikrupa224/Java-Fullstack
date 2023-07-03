package main.MavenProejct;

import org.springframework.stereotype.Component;
@Component
public class Account {

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    private String AccountName;

    public String getAccountNumber() {

        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    private String AccountNumber;

}

