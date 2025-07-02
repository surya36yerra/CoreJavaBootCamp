package Udemy;


//applicable only to numeric types int,byte,short and long
public class WrapperClassCaching {

    public static void main(String[] args) {
        Integer obj1 = 16;
        Integer obj2 = 128;
        //here same object will be created in heap memory and its stored under cache if number falls between -128 and 127

        Integer obj3 = 121;
        Integer obj4 = 121;

        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj4);
    }

}
