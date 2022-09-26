package ch.heigvd.dai.chill.domain.p_gillet;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class SuperMousse implements IProduct {

  public final static String NAME = "Super Mousse";
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
