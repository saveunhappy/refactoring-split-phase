public class VolumeCreditsCalculator {
    public int getThisCredits(Invoice invoice) {
        var volumeCredits = 0;
        for (var perf : invoice.performances) {
            var thisCredits = Math.max(perf.audience - 30, 0);
            if ("comedy".equals(perf.play.type)) thisCredits += Math.floor((double) perf.audience / 5);

            volumeCredits += thisCredits;
        }
        return volumeCredits;
    }
}
