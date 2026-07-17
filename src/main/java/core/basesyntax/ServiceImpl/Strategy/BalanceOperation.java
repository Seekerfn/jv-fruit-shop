package core.basesyntax.ServiceImpl.Strategy;

import core.basesyntax.Model.FruitTransaction;
import core.basesyntax.db.Storage;

public class BalanceOperation implements OperationHandler{
    @Override
    public void apply(FruitTransaction transaction) {
        Storage.getFruits().put(transaction.getFruit(), transaction.getQuantity());
    }
}
