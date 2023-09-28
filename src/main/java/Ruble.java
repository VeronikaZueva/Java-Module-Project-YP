public class Ruble {

    public String recieveRuble(double rublePrice) {
        int resultPrice = (int)Math.floor(rublePrice);

        if(resultPrice >= 11 && resultPrice <= 19) {
            return " рублей";
        }
        else {
        int lastNumber = resultPrice % 10;
        switch(lastNumber) {
            case 1 :
                return " рубль";
            case 2 :
            case 3 :
            case 4 :
                return " рубля";
            default :
                return " рублей";

        }
        }
    }
}
