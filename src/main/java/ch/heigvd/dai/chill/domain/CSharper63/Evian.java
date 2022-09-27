package ch.heigvd.dai.chill.domain.CSharper63;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Evian implements IProduct {
    public final static String NAME = "Evian";
    public final static BigDecimal PRICE = new BigDecimal(12.4);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
