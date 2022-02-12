public class TestInvoiceProcessor implements InvoiceProcessor{

    @Override
    public String createInvoice(String toWhom, int amountInYen) {
        return toWhom + "様に" + amountInYen + "円をTestInvoiceProcessorで請求しました";
    }
}
