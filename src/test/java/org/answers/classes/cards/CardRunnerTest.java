package org.answers.classes.cards;

import org.junit.jupiter.api.Test;

class CardRunnerTest {

    @Test
    void init() throws Exception {
        CardRunner.main(new String[]{"arg1", "arg2", "arg3"});
    }
}
