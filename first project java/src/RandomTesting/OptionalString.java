package RandomTesting;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalString {

    public static void main(String[] args) {
       String s = null;
       String s1 = "hello";
//       System.out.println(s.equals(s1));
       Optional<String> stringOptional = Optional.ofNullable(null);
        System.out.println(stringOptional.equals(s1));
        stringOptional = Optional.of("hello");
        System.out.println(stringOptional.get());
        System.out.println(stringOptional.orElse(null).equals(s1));
    }

}

