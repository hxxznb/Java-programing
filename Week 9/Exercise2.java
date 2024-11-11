public class Exercise2 {
    private String symbol;                 
    private String name;                   
    private double previousClosingPrice;   
    private double currentPrice;           

    public Exercise2(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }


    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }


    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }


    public String getSymbol() {
        return symbol;
    }


    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        Exercise2 stock = new Exercise2("ORCL", "Oracle Corporation");
        
        stock.setPreviousClosingPrice(34.5);
        
        stock.setCurrentPrice(34.35);
        
        System.out.printf("The price-change percentage for %s (%s) is %.2f%%\n",
                          stock.getName(), stock.getSymbol(), stock.getChangePercent());
    }
}
