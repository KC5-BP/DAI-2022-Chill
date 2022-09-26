package ch.heigvd.dai.chill.domain.Florianconti;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Follette implements IProduct {

  public final static String NAME = "Follette";
  public final static BigDecimal PRICE = new BigDecimal(3.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
