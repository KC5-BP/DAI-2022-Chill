package ch.heigvd.dai.chill.domain.miguelJalube;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class PeerBong implements IProduct {

  public final static String NAME = "Peer Bong";
  public final static BigDecimal PRICE = new BigDecimal(42.0);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
