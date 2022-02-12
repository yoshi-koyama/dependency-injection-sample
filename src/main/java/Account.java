public class Account {

    private InvoiceProcessor invoiceProcessor;

    private String name;

    public Account(String name, InvoiceProcessor invoiceProcessor) {
        this.name = name;
        this.invoiceProcessor = invoiceProcessor;
    }

    public String closing(int amountInYen) {
        String result = invoiceProcessor.createInvoice(name, amountInYen);
        return result;
    }

    public String createInvoiceInTime(int amountInYen) {
        String result = invoiceProcessor.createInvoice(name, amountInYen);
        return result;
    }
}
