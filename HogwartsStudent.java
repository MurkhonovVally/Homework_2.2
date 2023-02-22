public class HogwartsStudent {
    private int power;
    private int transgression;
    public HogwartsStudent(int power, int transgression) {
        this.power = power;
        this.transgression = transgression;
    }

    public int getPower() {
        return power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "HogwartsStudent{" + "power=" + power + ", transgression=" + transgression + '}';
    }
}
