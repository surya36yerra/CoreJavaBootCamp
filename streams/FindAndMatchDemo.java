package streams;

import java.util.List;
import java.util.Optional;

public class FindAndMatchDemo {

    public static void main(String[] args) {

        List<Item> items= getItems();

        boolean allinStock = items.stream().allMatch(Item::isInStock);
        System.out.println(allinStock);

        boolean anyOutOfStock = items.stream().anyMatch(Item::isOutStock);
        System.out.println(anyOutOfStock);

        boolean noneMatch = items.stream().noneMatch(item -> item.getPrice()>5000);
        System.out.println(noneMatch);

        Optional<Item> randomItem= items.stream().filter(item -> item.getPrice()>1000).findAny();
        System.out.println(randomItem);

        Optional<Item> firstItem= items.stream().filter(item -> item.getPrice()<1000).findFirst();
        System.out.println(firstItem);
    }

    private static List<Item> getItems(){
        return List.of(
                new Item("laptop",1200,true,false),
                new Item("mobile",800,false,true),
                new Item("camera",12000,true,false),
                new Item("watch",300,true,false)
        );
    }
}
