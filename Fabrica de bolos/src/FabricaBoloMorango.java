public class FabricaBoloMorango extends FabricaBolo {
    @Override
    protected Bolo criarBolo() {
        return new BoloMorango();
    }
}
