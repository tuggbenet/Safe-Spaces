#include <stdio.h>
#include <string.h>
#include <stdlib.h>
 
int main()
{
    char input[100];
    int count = 0;
 
    printf("Welcome to the safe space! Please enter your message:\n");
 
    while (count < 2000)
    {
        scanf("%s", &input);
 
        /* If user enters "exit" then break / terminate the program */
        if (strcmp(input, "exit") == 0)
        {
            break;
        }
 
        int length = strlen(input);
 
        /* capitalizes all the characters from the string */
        for (int i = 0; i < length; i++)
        {
            input[i] = toupper(input[i]);
        }
 
        printf("You entered: %s\n", input);
 
        count++;
    }
    printf("Thank you for participating in our safe space!\n");
    return 0;
}