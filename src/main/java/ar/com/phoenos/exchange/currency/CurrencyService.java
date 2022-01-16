package ar.com.phoenos.exchange.currency;

import java.util.Collection;

public interface CurrencyService {
    void validate(Currency currency) throws CurrencyException;
    boolean save(Currency currency) throws CurrencyException;
    Collection<Currency> getAll();
}
