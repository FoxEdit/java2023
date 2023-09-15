
public class Human {
    private Condition generalCondition;
    private Leg leftLeg, rightLeg;
    private Hand leftHand, rightHand;
    private Body body;
    private Head head;

    public Human(Condition generalCondition,
                 Condition leftLegCondition,
                 Condition rightLegCondition,
                 Condition leftHandCondition,
                 Condition rightHandCondition,
                 Condition bodyCondition,
                 Condition headCondition) {
        this.leftLeg = new Leg(leftLegCondition);
        this.rightLeg = new Leg(rightLegCondition);
        this.leftHand = new Hand(leftHandCondition);
        this.rightHand = new Hand(rightHandCondition);
        this.body = new Body(bodyCondition);
        this.head = new Head(headCondition);
        this.generalCondition = generalCondition;
    }

    public Condition getGeneralCondition() {
        return generalCondition;
    }

    public Condition getBody() {
        return body.bodyCondition;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Head getHead() {
        return head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setGeneralCondition(Condition generalCondition) {
        this.generalCondition = generalCondition;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    @Override
    public String toString() {
        return "Human:" +
                "\ngeneralCondition: " + generalCondition +
                "\n leftLeg: " + leftLeg +
                "\n rightLeg: " + rightLeg +
                "\n leftHand: " + leftHand +
                "\n rightHand: " + rightHand +
                "\n body: " + body +
                "\n head: " + head;
    }
}
