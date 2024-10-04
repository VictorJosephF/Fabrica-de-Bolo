public class FabricaBoloAbacaxi extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloAbacaxi();
    }
}
