package ch.heigvd.dai.chill.domain.Leandro4002;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class BlueMoon implements IProduct {

    public final static String NAME = "Blue Moon";
    public final static BigDecimal PRICE = new BigDecimal(4.2);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
