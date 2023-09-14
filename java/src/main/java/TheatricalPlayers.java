public class TheatricalPlayers {
    private TotalAmountCalculator totalAmountCalculator;

    private VolumeCreditsCalculator volumeCreditsCalculator;

    private ResultFormatter resultFormatter;

    public TheatricalPlayers(TotalAmountCalculator totalAmountCalculator, VolumeCreditsCalculator volumeCreditsCalculator, ResultFormatter resultFormatter) {
        this.totalAmountCalculator = totalAmountCalculator;
        this.volumeCreditsCalculator = volumeCreditsCalculator;
        this.resultFormatter = resultFormatter;
    }

    public String print(Invoice invoice) {
        var totalAmount = totalAmountCalculator.getTotalAmount(invoice);
        var volumeCredits = volumeCreditsCalculator.getThisCredits(invoice);
        return resultFormatter.getResult(invoice, totalAmount, volumeCredits);
    }

}
