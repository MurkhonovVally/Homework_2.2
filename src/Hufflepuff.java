public class Hufflepuff extends HogwartsStudent {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Hufflepuff(int power, int transgression, int industriousness, int loyalty, int honesty) {
        super(power, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Hufflepuff: " + "industriousness=" + industriousness + " loyalty=" + loyalty + " honesty=" + honesty;
    }
    private int bestStudent() {
        return this.industriousness + this.loyalty + this.honesty;
    }
    public boolean best(Hufflepuff gStudent) {
        return this.bestStudent() > gStudent.bestStudent();
    }

}
