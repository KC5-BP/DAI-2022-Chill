package ch.heigvd.dai.chill.domain.vino89;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeroniTest {

  @Test
  void thePriceAndNameForPeroniShouldBeCorrect() {
    Peroni beer = new Peroni();
    assertEquals(beer.getName(), Peroni.NAME);
    assertEquals(beer.getPrice(), Peroni.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPeroni() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.vino89.Peroni";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Peroni.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
