package core.basesyntax.ServiceImpl.Strategy;

import java.util.Map;

import core.basesyntax.Model.FruitTransaction;

public class OperationStrategyImpl implements OperationStrategy {

    private Map<FruitTransaction.Operation, OperationHandler> operationHandlers;

    public OperationStrategyImpl(Map<FruitTransaction.Operation, OperationHandler> operationHandlers) {
        this.operationHandlers = operationHandlers;
    }

    @Override
    public OperationHandler getHandler(FruitTransaction.Operation operation) {
        return this.operationHandlers.get(operation);
    }
}
