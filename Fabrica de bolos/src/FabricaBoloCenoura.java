public class FabricaBoloCenoura extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloCenoura();
    }
}