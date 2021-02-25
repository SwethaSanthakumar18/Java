class ForEach      
{ 
    public static void main(String[] arg) 
    { 
        { 
            float[] ratings = { 2.3f,4.9f,3.5f,1.5f,2.9f,3.1f};   
            float maxRating = maximum(ratings); 
            System.out.println("Maximum Rating is " + maxRating); 
        } 
    } 
    public static float maximum(float[] numbers) 
    {  
        float max = numbers[0];  
        for (float num : numbers)  
        { 
            if (num > max) 
            { 
                max = num; 
            } 
        } 
    return max; 
    } 
} 