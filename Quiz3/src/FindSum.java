    public int[] findSum(int[] numbers, int n) {
        java.util.Map<Integer, Integer> complementMap = new java.util.HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = n - numbers[i];
            if (complementMap.containsKey(complement)) {
                int[] result = { numbers[i], complement };
                return result;
            }
            complementMap.put(numbers[i], i);
        }
        return new int[0];
}