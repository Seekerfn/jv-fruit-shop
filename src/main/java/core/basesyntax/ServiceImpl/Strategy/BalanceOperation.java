package core.basesyntax.serviceimpl.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.db.Storage;

public class BalanceOperation implements OperationHandler {

    @Override
    public void apply(FruitTransaction transaction) {
        Storage.getFruits().put(transaction.getFruit(), transaction.getQuantity());
    }
}
