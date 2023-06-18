package bg.jug;

class CollectionUtilsTest {

    @org.junit.jupiter.api.Test
    void search_NumberNotPresent_RetrunsFalse() {
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5);
        Integer number = 6;
        boolean result = CollectionUtils.search(numbers, number);
        org.junit.jupiter.api.Assertions.assertFalse(result);
    }

    @org.junit.jupiter.api.Test
    void search_NumberPresent_ReturnsTrue() {
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5);
        Integer number = 3;
        boolean result = CollectionUtils.search(numbers, number);
        org.junit.jupiter.api.Assertions.assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void search_NullList_ThrowsRuntimeException() {
        java.util.List<Integer> numbers = null;
        Integer number = 5;
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            CollectionUtils.search(numbers, number);
        });
    }

    @org.junit.jupiter.api.Test
    void search_NullNumber_ThrowsRuntimeException() {
        java.util.List<Integer> numbers =java.util.Arrays.asList(1, 2, 3, 4, 5);
        Integer number = null;
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            CollectionUtils.search(numbers, number);
        });
    }
}
