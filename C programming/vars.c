#include <stdio.h> 

    int main()
    {
        int num = 200;
        double pi = 3.141592543;
        
        printf("Integer is %d", num);
        printf("Values are %d and %f \n", num, pi);
        printf("%%7d displays %7d \n", num);
        printf("%%7d displays %7d \n", num);
        printf("Pi is aproximately %1.10f \n", pi);
        printf("Right-aligned %20.3f rounded pi \n", pi);
        printf("Left-aligned %-20.3f rounded pi \n", pi);


        return 0; 
    }