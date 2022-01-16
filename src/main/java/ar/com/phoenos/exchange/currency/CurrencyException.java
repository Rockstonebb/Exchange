package ar.com.phoenos.exchange.currency;

public class CurrencyException extends Exception {
    public CurrencyException(String message) {
        super(message);
    }

    public CurrencyException(String message, Throwable cause) {
        super(message, cause);
    }
}
