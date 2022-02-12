public class Main {

    public static void main(String[] args) {
        // ある会社
        // 請求書を作成したい
        // 請求書の作成にはマネーフォワードを使う
        // 請求書の作成には請求先の相手の名前と金額が必要
        // 請求結果を標準出力する
        Account account = new Account("田中", new MoneyForward());
        String closingResult = account.closing(100000);
        System.out.println("締め処理の請求結果：" + closingResult);

        System.out.println("200,000円の送金が必要になった");
        String createInvoiceResult = account.createInvoiceInTime(200000);
        System.out.println("請求結果：" + createInvoiceResult);

        System.out.println("山田さんにはMisocaで請求書を送る");
        Account accountForYamada = new Account("山田", new Misoca());
        String yamadaClosingResult = accountForYamada.closing(300000);
        System.out.println("山田さんへの請求結果：" + yamadaClosingResult);
    }
}
