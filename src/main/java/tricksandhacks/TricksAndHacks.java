package tricksandhacks;

import java.util.Optional;
import java.util.function.Supplier;

public class TricksAndHacks {
    /**
     * usage example: dealWithNPE(() -> obj.getNested().getInner().getFoo())
     *      .ifPresentOrElse(val -> processSuccess(val), () -> processError());
     */
    public static <T> Optional<T> dealWithNPE(Supplier<T> resolver) {
        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        }
        catch (NullPointerException e) {
            return Optional.empty();
        }
    }
}
