package prototype;

import service.Basket;

//Реализация паттерна Prototype на пример копии чека за покупку
public class CashBox extends Basket implements Copyable {
    private String name;
    private String email;
    private  String product;

   public CashBox(String name, String email){
       this.name = name;
       this.email = email;
       this.product = buy;
   }


   public void pay(String str){
       if (str.equals("Пожалуйста")){
           System.out.println(toString());
       }
       else System.out.println("Может в другой раз");
   }

    @Override
    public Object copy() {
           CashBox copy = new CashBox(name, email);
           return copy;
    }

    @Override
    public String toString() {
        return "Чек{" +
                "Имя='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Книга ='" + product + '\'' +
                '}';
    }
}
