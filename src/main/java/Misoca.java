public class Misoca implements InvoiceProcessor {

    @Override
    public String createInvoice(String toWhom, int amountInYen) {
        return toWhom + "様に" + amountInYen + "円をMisocaで請求しました";
    }
}
