public class Main {
    public static void main(String[] args) {
        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();
        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();

        System.out.println("Fazendo bolos na confeitaria...");

        fabricaChocolate.fazerBolo();
        fabricaMorango.fazerBolo();
        fabricaCenoura.fazerBolo();
        fabricaAbacaxi.fazerBolo();
    }
}