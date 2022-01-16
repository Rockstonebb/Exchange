package ar.com.phoenos.exchange.currency;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    private String id;
    private String name;
    private String acronym;
    private String symbol;

    public Currency() {
    }

    public Currency(String name, String acronym, String symbol) {
        this.name = name;
        this.acronym = acronym;
        this.symbol = symbol;
    }


}
