package com.horizen.transaction;

import java.util.List;

public interface TransactionIncompatibilityChecker
{
    <T extends BoxTransaction> boolean isTransactionCompatible(T newTx, List<T> currentTxs);

    boolean isMemoryPoolCompatible();
}