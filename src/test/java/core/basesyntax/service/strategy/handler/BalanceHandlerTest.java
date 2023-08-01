package core.basesyntax.service.strategy.handler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Operation;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class BalanceHandlerTest {
    private final OperationHandler operationHandler = new BalanceHandler();

    @Test
    public void process_validTransaction_Ok() {
        Storage.getStorage().clear();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 100);
        operationHandler.process(new FruitTransaction(Operation.BALANCE, "apple", 100));
        Map<String, Integer> actual = Storage.getStorage();
        assertEquals(expected, actual);
    }

}
