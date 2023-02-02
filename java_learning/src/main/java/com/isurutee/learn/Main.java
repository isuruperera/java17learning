package com.isurutee.learn;

import com.isurutee.learn.Records.RecordsExample;
import com.isurutee.learn.SwitchExpressions.SwitchExpressionsExample;
import com.isurutee.learn.TextBlocks.TextBlocksExample;
import com.isurutee.learn.common.IExample;

public class Main {
    public static void main(String[] args) {
        IExample textBlocksExample = new TextBlocksExample();
        textBlocksExample.runExample();

        IExample switchExpressionExample = new SwitchExpressionsExample();
        switchExpressionExample.runExample();

        IExample recordsExample = new RecordsExample();
        recordsExample.runExample();
    }
}