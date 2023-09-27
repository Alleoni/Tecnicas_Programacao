package io.ada.mbnakaya.aula3;

public class ValidaQuemNaoFazNada implements Validador {
    @Override
    public Boolean valida(Animal animal) {
        return (!animal.podeAndar() && !animal.podeVoar());
    }
}
