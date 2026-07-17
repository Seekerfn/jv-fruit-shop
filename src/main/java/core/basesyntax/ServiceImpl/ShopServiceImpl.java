package core.basesyntax.serviceimpl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.ShopService;
import core.basesyntax.serviceimpl.strategy.OperationHandler;
import core.basesyntax.serviceimpl.strategy.OperationStrategy;

import java.util.List;

public class ShopServiceImpl implements ShopService {

    private final OperationStrategy operationStrategy;

    public ShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        for (FruitTransaction transaction : transactions) {
            OperationHandler operationHandler = operationStrategy.getHandler(transaction.getOperation());
            operationHandler.apply(transaction);
        }
    }
}
