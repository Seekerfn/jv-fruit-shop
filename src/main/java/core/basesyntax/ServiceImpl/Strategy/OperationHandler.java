package core.basesyntax.ServiceImpl.Strategy;

import core.basesyntax.Model.FruitTransaction;

public interface OperationHandler {

    void apply(FruitTransaction transaction);
}
