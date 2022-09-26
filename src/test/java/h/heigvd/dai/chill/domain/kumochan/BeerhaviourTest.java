package h.heigvd.dai.chill.domain.kumochan;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.domain.kumochan.Beerhaviour;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeerhaviourTest {

  @Test
  void thePriceAndNameForBeerhaviourShouldBeCorrect() {
    Beerhaviour beer = new Beerhaviour();
    assertEquals(beer.getName(), Beerhaviour.NAME);
    assertEquals(beer.getPrice(), Beerhaviour.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.kumochan.Beerhaviour";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Beerhaviour.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
