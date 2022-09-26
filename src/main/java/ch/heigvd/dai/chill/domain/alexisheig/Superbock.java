package ch.heigvd.dai.chill.domain.alexisheig;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Superbock implements IProduct {

  public final static String NAME = "Superbock";
  public final static BigDecimal PRICE = new BigDecimal(3.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
