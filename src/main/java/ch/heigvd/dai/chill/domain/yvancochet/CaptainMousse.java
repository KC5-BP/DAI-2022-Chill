package ch.heigvd.dai.chill.domain.yvancochet;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class CaptainMousse implements IProduct {

  public final static String NAME = "Captaine Mousse";
  public final static BigDecimal PRICE = new BigDecimal(5.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
