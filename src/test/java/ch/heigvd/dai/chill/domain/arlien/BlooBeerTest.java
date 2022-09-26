package ch.heigvd.dai.chill.domain.arlien;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BlooBeerTest {

  @Test
  void thePriceAndNameForPunkIPAShouldBeCorrect() {
    BlooBeer beer = new BlooBeer();
    assertEquals(beer.getName(), BlooBeer.NAME);
    assertEquals(beer.getPrice(), BlooBeer.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForPunkIPA() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.arlien.BlooBeer";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = BlooBeer.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
