package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {
    public static void main(String[] args) {


    List<Product> productList = Arrays.asList(new Product("apple",1200),
            new Product("nokia",200),new Product("samsung",1100),
            new Product("Mi",700),new Product("micromax",1200));

    Map<Integer, List<Product>> groupByProductName = productList.stream().collect(Collectors.groupingBy(Product::getPrice));

    Map<Boolean, List<Product>> groupByProductPrice = productList.stream().collect(Collectors.partitioningBy(product -> product.getPrice()>1000));

        System.out.println(groupByProductName);
        System.out.println(groupByProductPrice);

}}
