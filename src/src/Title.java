public abstract class Title {
    private String title;
    private String literatureType;
    static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public String getTitle() {
        return title;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    public abstract double calculatePoints();

    public double convertLiteratureType() {
        switch (literatureType) {
            case "BI":    return 3.0;
            case "TE":    return 3.0;
            case "LYRIK": return 6.0;
            case "SKØN":  return 1.7;
            case "FAG":   return 1.0;
            default: throw new IllegalArgumentException("Ukendt litteraturtype: " + literatureType);
        }
    }
}