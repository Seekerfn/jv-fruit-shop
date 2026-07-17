package core.basesyntax.Service;

import core.basesyntax.Model.FruitTransaction;
import java.util.List;

public interface ShopService {

    void process(List<FruitTransaction> transactions);
}
