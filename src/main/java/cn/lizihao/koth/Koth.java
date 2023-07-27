package cn.lizihao.koth;

import cn.lizihao.koth.exceptions.KothError;
import cn.lizihao.koth.expr.AstPrinter;
import cn.lizihao.koth.expr.Expr;
import cn.lizihao.koth.interpreter.Interpreter;
import cn.lizihao.koth.parser.Parser;
import cn.lizihao.koth.token.Token;
import cn.lizihao.koth.token.TokenScanner;
import cn.lizihao.koth.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Koth {
    private final static Koth instance = new Koth();

    private static final Interpreter interpreter = new Interpreter();

    public static Koth getInstance() {
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
        List<Token> tokens = scanner.scanTokens();
        Parser parser = new Parser(tokens);
        Expr expression = parser.parse();

        if (expression != null) {
            interpreter.interpret(expression);
        }
    }
}
