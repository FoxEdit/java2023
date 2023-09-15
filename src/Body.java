public class Body {

    @Override
    public String toString() {
        return "Body is " + bodyCondition;
    }

    public Body(Condition bodyCondition) {
        this.bodyCondition = bodyCondition;
    }

    public Condition bodyCondition;

}
