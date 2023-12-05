
package utilities;

/**
 *
 * @author yuyu
 * @param <E> type of the value need to check
 */
public interface ValidationChecker<E> {

    /**
     * Callback for check validation
     *
     * @param value
     * @return true | false
     */
    boolean checker(E value);
}
