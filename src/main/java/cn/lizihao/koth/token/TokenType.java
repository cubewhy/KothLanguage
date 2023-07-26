package cn.lizihao.koth.token;

public enum TokenType {
    // char tokens
    COMMA, DOT, // , .
    MINUS, PLUS, STAR, SLASH, SEMICOLON, // - + * / ;
    LEFT_BRACE, RIGHT_BRACE, // {, }
    LEFT_PAREN, RIGHT_PAREN, // (, )
    BANG, BANG_EQUAL, // !, !=
    EQUAL, EQUAL_EQUAL, // =, ==
    LESS, LESS_EQUAL, // <, <=
    GREATER, GREATER_EQUAL, // >, >=

    // keywords
    AND, OR, DEFINE, FALSE, TRUE, WHILE, FOR, RETURN, NONE, LZH, CLASS, FUNCTION,

    EOF, STRING, NUMBER, IDENTIFIER
}
