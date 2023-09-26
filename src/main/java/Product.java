public class Product {
    StringBuilder menu = new StringBuilder();

     public void addInMenu(String dish, int command) {
        while(command == 1) {
            menu.append(dish);
            System.out.println("Блюдо добавлено в список");
        }
            String resultMenu = menu.toString();
            System.out.println(resultMenu);


    }



}
