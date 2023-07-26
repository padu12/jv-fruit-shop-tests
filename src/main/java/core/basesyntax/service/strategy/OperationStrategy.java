package core.basesyntax.service.strategy;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.handlers.OperationHandler;

public interface OperationStrategy {
    OperationHandler getOperationHandler(FruitTransaction.Operation operation);
}