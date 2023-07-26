package org.cubewhy.koth;

import cn.lizihao.koth.KothInterpreter;
import cn.lizihao.koth.exceptions.KothError;
import org.junit.jupiter.api.Test;

public class TestParse {
    private final String koth = "define shenQuan = \"LIZIHAO\";";

    @Test
    public void testParse() throws KothError {
        KothInterpreter interpreter = KothInterpreter.getInstance();
        interpreter.runScript(koth);
    }
}
