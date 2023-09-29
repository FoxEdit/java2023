public class Main {
    public static void main(String[] args) {
        SteelFork fork = new SteelFork();
        GlassBottle bottle = new GlassBottle();
        WoodenPlate plate = new WoodenPlate();

        System.out.println("fork: " + fork.materialImpactSound() +
                "\nbottle: " + bottle.materialImpactSound() +
                "\nplate: " + plate.materialImpactSound());
    }
}