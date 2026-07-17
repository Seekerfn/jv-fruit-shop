package core.basesyntax.serviceimpl.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.db.Storage;

public class ReturnOperation implements OperationHandler {

    @Override
    public void apply(FruitTransaction transaction) {
        int currentQuantity = Storage.getFruits().getOrDefault(transaction.getFruit(), 0);
        Storage.getFruits()
                .put(transaction.getFruit(), transaction.getQuantity() + currentQuantity);
    }
}
