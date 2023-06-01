/** Write a class Interval with a public void init(String interval)
 * that creates an Interval instance corrsesponding to the interval which might be open
 * (i.e. (2,3)) or closed (i.e. [4,5]) or open/closed at just one end.
 * The start/end of the interval might also be ommited assuming infinity.
 * The class contains the isStartOpened(boolean), isEndOpened(boolean), start (Integer) and end (Integer) fields
 * with proper getters and setters. Use the regular expressions API for the parsing.*/

public class Question19 {
    public class Interval {
        private boolean isStartOpened;
        private boolean isEndOpened;
        private Integer start;
        private Integer end;

        public void init(String interval) {
            String regex = "(\\(|\\[)(-?\\d*\\.?\\d*),(-?\\d*\\.?\\d*)(\\)|\\])";
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
            java.util.regex.Matcher matcher = pattern.matcher(interval);

            if (matcher.matches()) {
                String startBracket = matcher.group(1);
                String startValue = matcher.group(2);
                String endValue = matcher.group(3);
                String endBracket = matcher.group(4);

                this.isStartOpened = startBracket.equals("(");
                this.isEndOpened = endBracket.equals(")");
                this.start = startValue.isEmpty() ? null : Integer.parseInt(startValue);
                this.end = endValue.isEmpty() ? null : Integer.parseInt(endValue);
            } else {
                throw new IllegalArgumentException("Invalid interval format");
            }
        }

        public boolean isStartOpened() {
            return isStartOpened;
        }

        public boolean isEndOpened() {
            return isEndOpened;
        }

        public Integer getStart() {
            return start;
        }

        public Integer getEnd() {
            return end;
        }

        public void setEndOpened(boolean endOpened) {
            isEndOpened = endOpened;
        }

        public void setStartOpened(boolean startOpened) {
            isStartOpened = startOpened;
        }

        public void setStart(Integer start) {
            this.start = start;
        }

        public void setEnd(Integer end) {
            this.end = end;
        }
    }
}
