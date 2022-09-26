package ch.heigvd.dai.chill.domain.moi1023;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Heineken implements IProduct {

  public final static String NAME = "Heineken";
  public final static BigDecimal PRICE = new BigDecimal(2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
