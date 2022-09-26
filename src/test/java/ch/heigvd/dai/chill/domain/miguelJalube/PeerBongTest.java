package ch.heigvd.dai.chill.domain.miguelJalube;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeerBongTest {

  @Test
  void thePriceAndNameForPeerBongShouldBeCorrect() {
    PeerBong beer = new PeerBong();
    assertEquals(beer.getName(), PeerBong.NAME);
    assertEquals(beer.getPrice(), PeerBong.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPeerBong() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.miguelJalube.PeerBong";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = PeerBong.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
