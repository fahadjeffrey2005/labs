//Count the number of words in a sentence.
#include <stdio.h>
#include <string.h>
int main()
{
    char ch[300];
    int count =1;
    printf("Enter the string: ");
    fgets(ch, sizeof(ch), stdin);
    for (int i=0;i<strlen(ch); i++)
    {
        if (ch[i]==' ' && ch[i+1] != ' ' && ch[i+1] != '\0')
            count++;
    }
    printf("Number of words: %d\n", count);
    return 0;
}
