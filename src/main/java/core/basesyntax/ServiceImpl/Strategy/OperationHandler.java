package core.basesyntax.ServiceImpl.Strategy;

import java.util.Map;
import core.basesyntax.Model.FruitTransaction;

public interface OperationHandler {
    void apply(FruitTransaction transaction);
}
