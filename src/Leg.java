public class Leg {
    public Condition legCondition;

    @Override
    public String toString() {
        return "Leg is " + legCondition;
    }

    public Leg(Condition legCondition) {
        this.legCondition = legCondition;
    }
}
