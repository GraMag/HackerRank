	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int valley = 0;
        int hiking = 0;

        if(n >= 2 && n<= Math.pow(10,6) && s.contains("D") || s.contains("U")) {
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) == 'D') {
                    hiking--;
                } else if (s.charAt(i) == 'U') {
                    hiking++;
                    if(hiking == 0) {
                        valley++;
                    }
                }
            }
        }

        return valley;
    }