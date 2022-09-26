package ch.heigvd.dai.chill.domain.moi1023;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeinekenTest {

  @Test
  void thePriceAndNameForHeinekenShouldBeCorrect() {
    Heineken beer = new Heineken();
    assertEquals(beer.getName(), Heineken.NAME);
    assertEquals(beer.getPrice(), Heineken.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForHeineken() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.moi1023.Heineken";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Heineken.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
