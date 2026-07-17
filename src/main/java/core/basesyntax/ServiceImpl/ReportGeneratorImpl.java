package core.basesyntax.ServiceImpl;

import java.util.Map;
import core.basesyntax.db.Storage;
import core.basesyntax.Service.ReportGenerator;

public class ReportGeneratorImpl implements ReportGenerator {
    private static final String HEADER = "fruit,quantity" + System.lineSeparator();

    @Override
    public String getReport() {
        StringBuilder builder = new StringBuilder();
        builder.append(HEADER);
        for (Map.Entry<String, Integer> entry : Storage.getFruits().entrySet()) {
            builder.append(entry.getKey())
                    .append(",")
                    .append(entry.getValue())
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }
}
