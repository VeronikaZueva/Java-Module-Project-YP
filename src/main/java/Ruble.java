public class Ruble {

    public String recieveRuble(double rublePrice) {
        int resultPrice = (int)Math.floor(rublePrice);
        String ruble;
        if(resultPrice >= 11 && resultPrice <= 19) {
            ruble = " рублей";
            return ruble;
        }
        else {
        int lastNumber = resultPrice % 10;
        switch(lastNumber) {
            case 1 :
                ruble = " рубль";
                return ruble;
            case 2 :
            case 3 :
            case 4 :
                ruble = " рубля";
                return ruble;
            default :
                ruble = " рублей";
                return ruble;

        }
        }
    }
}
