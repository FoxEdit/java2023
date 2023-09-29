public class SteelFork extends Dish {
    private Material material = Material.metal;
    public String materialImpactSound() {
        return "Metal bump";
    }
    public Material getMaterial() {
        return material;
    }

    public void turnIntoMetalTrash() {
        System.out.println("The fork has been ruined and can no longer be used to eat food.");
        material = Material.recycled;
    }
}
