package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsNullCheck {
    public static void main(String[] args) {
//        List<String> countryNames = List.of("USA","India","canada","UK",null,null,"Germany");
//        List<String> capNames = countryNames.stream().
//                filter(Objects::nonNull).
//                        map(String::toUpperCase).collect(Collectors.toList());

        List<String> countryNames2 = Arrays.asList("USA", "India", "canada", "UK", null, null, "Germany");
        List<String> capNames2 = countryNames2.stream().
                filter(Objects::nonNull).
                map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(capNames2);


    }
}
