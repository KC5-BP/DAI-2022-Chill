package ch.heigvd.dai.chill.domain.Rouuuben;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class RouuubenBeer implements IProduct {

    public final static String NAME = "Rouuuben Beer";
    public final static BigDecimal PRICE = new BigDecimal(555.55);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
