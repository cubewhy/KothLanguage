package cn.lizihao.koth.exceptions;

import cn.lizihao.koth.token.Token;

public class KothParseError extends RuntimeException {
    public KothParseError(Token token, String message) {
        super(token.toString() + ": " + message);
    }
}
