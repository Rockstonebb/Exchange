package ar.com.phoenos.exchange.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CurrencyServiceImpl implements CurrencyService {

    @Autowired
    CurrencyRepository repository;

    @Override
    public void validate(Currency currency) throws CurrencyException {
        if (repository.getById(currency.getId()).getName() != null) {
            throw new CurrencyException("Currency already exists");
        }
        if (currency.getName().equals(null) || currency.getName().equals("")) {
            throw new CurrencyException("Name cannot be null or empty");
        }
    }

    @Override
    public boolean save(Currency currency) throws CurrencyException {
        this.validate(currency);
        repository.save(currency);
        return true;
    }

    @Override
    public Collection<Currency> getAll() {
        return repository.findAll();
    }
}
