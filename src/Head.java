public class Head {

    public Head(Condition headCondition) {
        this.headCondition = headCondition;
    }

    public Condition headCondition;

    @Override
    public String toString() {
        return "Head is " + headCondition;
    }
}
