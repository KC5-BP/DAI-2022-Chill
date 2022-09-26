package ch.heigvd.dai.chill.domain.Rouuuben;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RouuubenBeerTest {

    @Test
    void thePriceAndNameForRouuubenBeerShouldBeCorrect() {
        RouuubenBeer beer = new RouuubenBeer();
        assertEquals(beer.getName(), RouuubenBeer.NAME);
        assertEquals(beer.getPrice(), RouuubenBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForRouuubenBeer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.Rouuuben.RouuubenBeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = RouuubenBeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
