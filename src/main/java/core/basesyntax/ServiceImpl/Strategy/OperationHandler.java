package core.basesyntax.serviceimpl.strategy;

import core.basesyntax.model.FruitTransaction;

public interface OperationHandler {

    void apply(FruitTransaction transaction);
}
