/*
 
 Input a string and toggle the case of every character in the input string.
 Ex: INPUT: aBcDe
 OUTPUT: AbCdE
 
 */
#include <string.h>
#include <stdio.h>
int main()
{
    char ch[300];
    printf("Enter the string: ");
    fgets(ch, sizeof(ch), stdin);
    for (int i = 0; i < strlen(ch); i++)
    {
        int cha = (int)ch[i];
        if (cha >= 97 && cha <= 122)
            cha -= 32;
        else if (cha >= 65 && cha <= 90)
            cha += 32;
        ch[i] = (char)cha;
    }
    puts(ch);
    return 0;
}

