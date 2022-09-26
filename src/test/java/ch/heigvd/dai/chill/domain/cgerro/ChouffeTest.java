package ch.heigvd.dai.chill.domain.cgerro;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChouffeTest {

  @Test
  void thePriceAndNameForChouffeShouldBeCorrect() {
    Chouffe beer = new Chouffe();
    assertEquals(beer.getName(), Chouffe.NAME);
    assertEquals(beer.getPrice(), Chouffe.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForChouffe() {
    Bartender roman = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.cgerro.Chouffe";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = roman.order(request);
    BigDecimal expectedTotalPrice = Chouffe.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
