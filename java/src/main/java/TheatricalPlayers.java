public class TheatricalPlayers {

    public String print(Invoice invoice) {
        var totalAmount = new TotalAmountCalculator().getTotalAmount(invoice);
        int volumeCredits = new VolumeCreditsCalculator().getVolumeCredits(invoice);
        return new ResultFormatter().getResult(invoice, totalAmount, volumeCredits);
    }

}
