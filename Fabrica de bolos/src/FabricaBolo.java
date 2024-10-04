public abstract class FabricaBolo {
    public void fazerBolo() {
        Bolo bolo = criarBolo();
        bolo.preparar();
    }

    protected abstract Bolo criarBolo();
}

