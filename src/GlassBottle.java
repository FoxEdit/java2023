public class GlassBottle extends Dish {

    private Material material = Material.glass;
    public String materialImpactSound() {
        return "Glass bump";
    }
    public Material getMaterial() {
        return material;
    }
    public void turnIntoGlassTrash() {
        System.out.println("Now you have a sharp bottle, be careful!");
        material = Material.recycled;
    }

}
