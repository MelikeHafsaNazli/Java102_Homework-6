package sigortaY�netimSistemi;


public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Account account = accountManager.login();
        System.out.println("Ho�geldiniz " + account.getUser().getFname() + " " +
                account.getUser().getLname());
        account.addAddress("�n�n� / Eski�ehir");
        account.addAddress("Ayvac�k / �anakkale");
        account.addAddress("�erkezk�y / Tekirda�");
        account.addInsurance(new CarInsurance());
        account.showUserInfo();
    }
}
