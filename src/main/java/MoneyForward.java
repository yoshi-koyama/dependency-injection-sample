public class MoneyForward implements InvoiceProcessor {

    @Override
    public String createInvoice(String toWhom, int amountInYen) {
        return toWhom + "様に" + amountInYen + "円をMoneyForwardで請求しました";
    }
}
