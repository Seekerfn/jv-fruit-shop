package core.basesyntax.ServiceImpl.Strategy;

import core.basesyntax.Model.FruitTransaction;

public interface OperationStrategy {
    OperationHandler getHandler(FruitTransaction.Operation operation);
}
