package cn.lizihao.koth.exceptions;

import cn.lizihao.koth.token.Token;

public class KothRuntimeError extends RuntimeException {
    public final Token token;

    public KothRuntimeError(Token token, String message) {
        super(message);
        this.token = token;
    }
}
