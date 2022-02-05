import ru.shop.model.Apple;
import ru.shop.service.BasketOnArray;
import ru.shop.model.Kivi;
import ru.shop.model.Product;
import ru.shop.service.BasketOnList;
import ru.shop.service.BasketOnSet;
import ru.shop.service.ShopService;

import java.util.Random;

public class ShopRunApp {

    public static void main(String[] args) {
        ShopService s = new ShopService();
        /*Kivi kivi = new Kivi();
        BasketOnSet myBasket = new BasketOnSet();
        myBasket.addProduct(kivi);

        for ( int i = 0 ; i < 10000; i++) {
            myBasket.addProduct(selectAnyProduct());
        }
        // s.buy(apple);

        for (int i = 0 ; i < myBasket.getProducts().length; i++){
            System.out.println("Index: + " + i + "Product: " + myBasket.getProducts()[i]);

        }
    }




    private static Product selectAnyProduct() {
        Random r = new Random();
        int i = r.nextInt(100);
        if ( i % 2 == 0) {
            return new Apple("Зеленое яблоко");
        }
        return new Kivi(); */
    }


}
