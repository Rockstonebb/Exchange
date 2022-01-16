package ar.com.phoenos.exchange.currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("currency")
public class CurrencyRestApiController {
//https://stackabuse.com/get-http-post-body-in-spring/
    @Autowired
    private CurrencyService currencyService;

    @PostMapping("new") // TODO
    public String newCurrency(@RequestBody Currency currency) throws CurrencyException {
        return String.valueOf(currencyService.save(currency));
    }

    @GetMapping("getAll")
    public Collection<Currency> getAll(){
        return currencyService.getAll();
    }
}
