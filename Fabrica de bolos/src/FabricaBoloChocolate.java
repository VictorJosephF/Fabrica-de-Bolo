public class FabricaBoloChocolate extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloChocolate();
    }
}
