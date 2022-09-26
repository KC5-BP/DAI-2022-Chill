package ch.heigvd.dai.chill.domain.azzen;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeffeTest {

    @Test
    void thePriceAndNameForLeffeShouldBeCorrect() {
        Leffe beer = new Leffe();
        assertEquals(beer.getName(), Leffe.NAME);
        assertEquals(beer.getPrice(), Leffe.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLeffe() {
        Bartender alexis = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.azzen.Leffe";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = alexis.order(request);
        BigDecimal expectedTotalPrice = Leffe.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
