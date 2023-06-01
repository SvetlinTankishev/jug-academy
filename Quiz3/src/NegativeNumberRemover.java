public java.util.List<Integer> removeNegatives(java.util.List<Integer> numbers) {
        java.util.List<Integer> result = new java.util.ArrayList<>();
        for (int number : numbers) {
        if (number >= 0) {
        result.add(number);
        }
        }
        return result;
        }