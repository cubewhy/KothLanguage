package org.cubewhy.koth;

import cn.lizihao.koth.Koth;
import cn.lizihao.koth.exceptions.KothError;
import org.junit.jupiter.api.Test;

public class TestParse {
    private final String koth = "((1 + 1) * 3);";

    @Test
    public void testParse() throws KothError {
        Koth interpreter = Koth.getInstance();
        interpreter.runScript(koth);
    }
}
