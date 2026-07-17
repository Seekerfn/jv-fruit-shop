package core.basesyntax.ServiceImpl.Strategy;

import core.basesyntax.Model.FruitTransaction;
import core.basesyntax.db.Storage;

public class ReturnOperation implements OperationHandler {
    @Override
    public void apply(FruitTransaction transaction) {
        int currentQuantity = Storage.getFruits().getOrDefault(transaction.getFruit(), 0);
        Storage.getFruits()
                .put(transaction.getFruit(), transaction.getQuantity() + currentQuantity);
    }
}
