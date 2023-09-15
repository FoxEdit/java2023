public class Hand {

    @Override
    public String toString() {
        return "Hand is " + handCondition;
    }

    public Hand(Condition handCondition) {
        this.handCondition = handCondition;
    }

    public Condition handCondition;
}
