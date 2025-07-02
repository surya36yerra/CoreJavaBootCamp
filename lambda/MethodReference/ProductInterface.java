package java.lambda.MethodReference;

import streams.Product;

@FunctionalInterface
public interface ProductInterface {

    public Product getProduct(String name, int price);

}
