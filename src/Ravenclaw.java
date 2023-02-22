public class Ravenclaw extends HogwartsStudent {
    private int smart;
    private int wisdom;
    private int witty;
    private int creativity;
    public Ravenclaw(int power, int transgression, int smart, int wisdom, int witty, int creativity) {
        super(power, transgression);
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Ravenclaw: " + "smart=" + smart + " wisdom=" + wisdom + " witty=" + witty + " creativity=" + creativity;
    }
    private int bestStudent() {
        return this.smart + this.wisdom + this.witty + this.creativity;
    }
    public boolean best(Ravenclaw gStudent) {
        return this.bestStudent() > gStudent.bestStudent();
    }
}
