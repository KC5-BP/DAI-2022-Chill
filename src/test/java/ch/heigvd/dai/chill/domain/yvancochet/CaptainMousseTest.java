package ch.heigvd.dai.chill.domain.yvancochet;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CaptainMousseTest {

  @Test
  void thePriceAndNameForCaptainMousseShouldBeCorrect() {
    CaptainMousse beer = new CaptainMousse();
    assertEquals(beer.getName(), CaptainMousse.NAME);
    assertEquals(beer.getPrice(), CaptainMousse.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCaptainMousse() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.yvancochet.CaptainMousse";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = CaptainMousse.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
