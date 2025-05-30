package Array;

public class trappedRainwater {
    public static void rainWater(int height[]){
        int n=height.length;

        // Calculate left Max boundary array
        int leftMax[]=new int [n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        // Calculate right Max Boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max( height[i],rightMax[i+1]);
        }
        int trappeWater=0;
        //loop
        for(int i=0;i<n;i++){
            
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            trappeWater+=waterLevel-height[i];
        }
        System.out.println("rain1234567rain = "+trappeWater); ;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        rainWater(height);
    }
}
