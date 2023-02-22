public class Gryffindor extends HogwartsStudent {
    private int nobility;
    private int bravery;
    private int honor;

    public Gryffindor(int power, int transgression, int nobility, int bravery, int honor) {
        super(power, transgression);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public java.lang.String toString() {
        return "Gryffindor: " + "nobility=" + nobility + " bravery=" + bravery + " honor=" + honor;
    }

    private int bestStudent() {
        return this.nobility + this.bravery + this.honor;
    }
    public boolean best(Gryffindor gStudent) {
        return this.bestStudent() > gStudent.bestStudent();
    }
}

