package core.basesyntax.Service;

import core.basesyntax.Model.FruitTransaction;
import java.util.List;

public interface DataConvertor {

    List<FruitTransaction> convertToTransaction(List<String> list);
}
