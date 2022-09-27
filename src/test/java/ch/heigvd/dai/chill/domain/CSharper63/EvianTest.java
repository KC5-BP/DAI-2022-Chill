package ch.heigvd.dai.chill.domain.CSharper63;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvianTest {


    @Test
    void thePriceAndNameForEvianShouldBeCorrect() {
        Evian beer = new Evian();
        assertEquals(beer.getName(), Evian.NAME);
        assertEquals(beer.getPrice(), Evian.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEvian() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.CSharper63.Evian";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Evian.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
