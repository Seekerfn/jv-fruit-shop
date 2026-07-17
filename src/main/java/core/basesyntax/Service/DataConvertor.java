package core.basesyntax.Service;

import java.util.List;

import core.basesyntax.Model.FruitTransaction;

public interface  DataConvertor {
    
    List<FruitTransaction> convertToTransaction(List<String> list);
}
