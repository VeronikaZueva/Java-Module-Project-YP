public class Product {




     public String addInMenu(String dish, int command) {
        StringBuilder menu = new StringBuilder();
        while(true) {
            if(command==0) {menu = menu.append(dish); }
            else {return menu;}
        }

    }



}
