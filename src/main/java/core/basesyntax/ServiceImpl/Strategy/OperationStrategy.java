package core.basesyntax.serviceimpl.strategy;

import core.basesyntax.model.FruitTransaction;

public interface OperationStrategy {

    OperationHandler getHandler(FruitTransaction.Operation operation);
}
