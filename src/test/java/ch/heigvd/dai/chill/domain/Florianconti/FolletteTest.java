package ch.heigvd.dai.chill.domain.Florianconti;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FolletteTest {

  @Test
  void thePriceAndNameForFolletteShouldBeCorrect() {
    Follette beer = new Follette();
    assertEquals(beer.getName(), Follette.NAME);
    assertEquals(beer.getPrice(), Follette.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForFollette() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.Florianconti.Follette";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Follette.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
