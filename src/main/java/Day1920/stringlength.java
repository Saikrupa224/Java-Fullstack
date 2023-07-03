package Day1920;
import java.util.Optional;

public class stringlength {

        public static Optional<Integer> getStringLength(String input) {
            if (input == null) {
                return Optional.empty();
            } else {
                return Optional.of(input.length());
            }
        }

        public static void main(String[] args) {
            String input = "saikrupa";
            Optional<Integer> length = getStringLength(input);
            if (length.isPresent()) {
                System.out.println("Length of the string: " + length.get());
            } else {
                System.out.println("Input string is null.");
            }
        }
    }


