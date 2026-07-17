package core.basesyntax.Service;

import java.util.List;
import core.basesyntax.Model.FruitTransaction;

public interface ShopService {
    void process(List<FruitTransaction> transactions);
}
