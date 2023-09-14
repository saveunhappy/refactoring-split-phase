public class TotalAmountCalculator {
    int getTotalAmount(Invoice invoice) {
        var totalAmount = 0;
        for (var perf : invoice.performances) {
            var thisAmount = 40000;
            if (perf.audience > 30) {
                thisAmount += 1000 * (perf.audience - 30);
            }
            totalAmount += thisAmount;
        }
        return totalAmount;
    }
}
