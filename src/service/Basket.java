package service;

import java.util.ArrayList;
import java.util.List;

public class Basket extends ListBook{

    private static volatile Basket basket = null;
     List<String> list = new ArrayList<>();

    public static Basket getBasket(){
        if(basket == null){
            synchronized (Basket.class){
                if (basket == null)
                    basket = new Basket();
            }
        }
        return basket;
    }

    public Basket(){

    }

    public void showBasket(){
       list.add(buy);
        System.out.println("Корзина");
        for(String str : list)
            System.out.println(str + "\n");
    }

}
