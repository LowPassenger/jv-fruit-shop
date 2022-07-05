package core.basesyntax.service.impl;

import core.basesyntax.service.ReportCreatorService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReportCreatorServiceImpl implements ReportCreatorService {
    private static final String FILE_HEADER = "fruit,quantity" + System.lineSeparator();

    @Override
    public List<String> createReport(Map<String, Integer> fruitsMap) {
        List<String> lines = new ArrayList<>();
        lines.add(FILE_HEADER);
        for (Map.Entry<String, Integer> entry: fruitsMap.entrySet()) {
            lines.add(entry.getKey() + "," + entry.getValue());
            lines.add(System.lineSeparator());
        }
        lines.remove(lines.size() - 1);
        return lines;
    }
}