public class WoodenPlate extends Dish {
    private Material material = Material.wood;
    public String materialImpactSound() {
        return "Wooden bump";
    }
    public Material getMaterial() {
        return material;
    }
    public void turnIntoFirewood() {
        System.out.println("You charred the plate and now you have a ruined plate. It could have been charcoal.");
        material = Material.recycled;
    }
}
