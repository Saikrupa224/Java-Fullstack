package Day1920;
import java.util.Optional;
public class stringuppercase {

        public static Optional<String> toUpperCase(Optional<String> optionalString) {
            if (optionalString.isPresent()) {
                String string = optionalString.get();
                String uppercaseString = string.toUpperCase();
                return Optional.of(uppercaseString);
            } else {
                return Optional.empty();
            }
        }

        public static void main(String[] args) {
            Optional<String> optionalString = Optional.of("saikrupa");
            Optional<String> uppercaseOptional = toUpperCase(optionalString);
            if (uppercaseOptional.isPresent()) {
                System.out.println("Uppercase string: " + uppercaseOptional.get());
            } else {
                System.out.println("Input Optional is empty.");
            }
        }
    }

