#include <stdio.h>


int main()
    {
        char letter;
        int num1, num2 ; 
        
        print
        
        printf("Enter any one keyboard charater: ");
        scanf("%c", &letter);
        printf("Enter two integers seperated by a space: ");
        scanf("%d  %d", &num1,&num2);

        printf("Numbers input: %d and %d", num1, num2);
        printf(" Letter input: %c", letter );
        printf(" Stored at %p \n ", &letter);


        return 0;   
    }