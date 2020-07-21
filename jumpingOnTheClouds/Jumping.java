 // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        while(i < c.length-2){
            if(c[i+2] == 0){
                i+=2;
                if(i == c.length-2)
                {
                    i--;
                }
            } else {
                i++;
            }
            jumps++;
        }  
        if(c.length == 2)
        {
            jumps++;
        }
        return jumps;
    }
