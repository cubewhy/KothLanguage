package cn.lizihao.koth;

import cn.lizihao.koth.exceptions.KothError;
import cn.lizihao.koth.token.Token;
import cn.lizihao.koth.token.TokenScanner;
import cn.lizihao.koth.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class KothInterpreter {
    private final static KothInterpreter instance = new KothInterpreter();

    public static KothInterpreter getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        // parse the command line
        if (args.length == 1) {
            try {
                getInstance().runScript(FileUtils.readFile(new File(args[0])));
            } catch (IOException | KothError e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("koth.jar <scripts> (endswith .kh)");
        }
    }

    public void runScript(String script) throws KothError {
        TokenScanner scanner = new TokenScanner(script);
        for (Token token : scanner.scanTokens()) {
            System.out.println(token);
        }
    }
}
