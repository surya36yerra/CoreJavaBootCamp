package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThemDemo {
    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product("apple",1200),
        new Product("nokia",200),new Product("samsung",1100),
        new Product("Mi",700),new Product("micromax",1200));


        String maxPriceProduct = productList.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                (productOption->productOption.isPresent()?productOption.get().getName():"none")
        ));

        String minPriceProduct = productList.stream().collect(Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Product::getPrice)),
                (productOption->productOption.isPresent()?productOption.get().getName():"none")
        ));

        System.out.println(maxPriceProduct);
        System.out.println(minPriceProduct);

    }
}
