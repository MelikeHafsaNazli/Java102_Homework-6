package sigortaYönetimSistemi;


public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Account account = accountManager.login();
        System.out.println("Hoþgeldiniz " + account.getUser().getFname() + " " +
                account.getUser().getLname());
        account.addAddress("Ýnönü / Eskiþehir");
        account.addAddress("Ayvacýk / Çanakkale");
        account.addAddress("Çerkezköy / Tekirdað");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();
    }
}
