package ch.heigvd.dai.chill.domain.arlien;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class BlooBeer implements IProduct {

  public final static String NAME = "Bloo Beer (Boris Johnson Limited Edition)";
  public final static BigDecimal PRICE = new BigDecimal(9.99);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
