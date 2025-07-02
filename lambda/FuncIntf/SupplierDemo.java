package java.lambda.FuncIntf;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> LocalDate.now().getMonthValue();
        System.out.println(supplier.get());

        Supplier<Integer> supplier2 = () -> LocalDate.now().getDayOfMonth();
        System.out.println(supplier2.get());

        Supplier<String> supplier3 = () -> LocalDate.now().getDayOfWeek().name();
        System.out.println(supplier3.get());
    }
}
