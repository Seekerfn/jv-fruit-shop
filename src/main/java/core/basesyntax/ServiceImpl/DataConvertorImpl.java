package core.basesyntax.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import core.basesyntax.Model.FruitTransaction;
import core.basesyntax.Service.DataConvertor;

public class DataConvertorImpl implements DataConvertor {

    @Override
    public List<FruitTransaction> convertToTransaction(List<String> list) {
        List<FruitTransaction> fruitList = new ArrayList<>();
        for (String item : list) {
            String[] items = item.split(",");
            if (items[0].equals("type")) {
                continue;
            }
            fruitList.add(new FruitTransaction(FruitTransaction.Operation.getOperationByCode(items[0]), items[1], Integer.parseInt(items[2])));

        }
        return fruitList;
    }
}
