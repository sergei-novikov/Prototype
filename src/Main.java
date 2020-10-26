import prototype.CashBox;
import service.Basket;
import service.ListBook;


//Шаблон Prototype позволяет создавать новые объекты на основе некоторого объекта-прототипа
//при этом совсем не обязательно знать как необходимый объект устроен.
public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в мой маленький книжный магазин");
        System.out.println("Вам нужны книги или аудиокниги?\n");

        //Список книг
        ListBook listBook = new ListBook();
        listBook.openFile("book");
        listBook.readFile();
        listBook.printFile();
        listBook.closeFile();

        System.out.println("Желаете, что нибудь купить ?\n");

        //Выбор клиента
        listBook.choice(4);

        //Вывод корзины
        Basket.getBasket().showBasket();

        //Касса
        CashBox original = new CashBox("Сергей", "sergei@mail.ru");

        //Призводим оплату
        //У меня очень добрый магазин, в котором достаточно сказать пожалуйста, и вам продадут книгу
        original.pay("Пожалуйста"); //В случае оплаты нам выдадут чек

            //Копия чека (которую можно отправить на почту покупателю, либо же хранить в кэше)
            CashBox copy = (CashBox) original.copy();
            System.out.println(copy);



    }
}












