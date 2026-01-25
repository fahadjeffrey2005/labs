/*
 
 To open and read a sentence from a file and display the same on the console.
 
 */
#include <stdio.h>

int main()
{
    FILE *fp1;
    fp1 = fopen("DATA.DAT", "r");

    if (fp1 == NULL)
    {
        printf("File not found!");
        return 1;
    }

    int count = 0;
    char ch;

    while ((ch = getc(fp1)) != EOF)
        count++;

    rewind(fp1);
    char sent[count + 1];

    for (int i = 0; i < count; i++)
        sent[i] = getc(fp1);

    sent[count] = '\0';

    printf("The sentence is:\n%s", sent);

    fclose(fp1);
    return 0;
}

