package ch.heigvd.dai.chill.domain.alexisheig;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperbockTest {

  @Test
  void thePriceAndNameForSuperbockShouldBeCorrect() {
    Superbock beer = new Superbock();
    assertEquals(beer.getName(), Superbock.NAME);
    assertEquals(beer.getPrice(), Superbock.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSuperbock() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.alexisheig.Superbock";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Superbock.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
