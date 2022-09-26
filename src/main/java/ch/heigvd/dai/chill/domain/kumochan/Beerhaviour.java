package ch.heigvd.dai.chill.domain.kumochan;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class Beerhaviour implements IProduct {

  public final static String NAME = "Beerhaviour";
  public final static BigDecimal PRICE = new BigDecimal(100.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
