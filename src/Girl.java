public class Girl {
    String gerl1;
    String gerl2;
    String gerl3;
    String boobs1;
    String boobs2;
    String boobs3;

    Girl(String gerl1, String gerl2, String gerl3, String boobs1, String boobs2, String boobs3) {
        this.gerl1 = gerl1;
        this.gerl2 = gerl2;
        this.gerl3 = gerl3;
        this.boobs1 = boobs1;
        this.boobs2 = boobs2;
        this.boobs3 = boobs3;
    }

    public String getInfo() {
        String resalt1 = "Девчуля " + gerl1 + " " + boobs1;
        String resalt2 = "Девчуля " + gerl2 + " " + boobs2;
        String resalt3 = "Девчуля " + gerl3 + " " + boobs3;
        return (resalt1 + resalt2 + resalt3);

    }

}
