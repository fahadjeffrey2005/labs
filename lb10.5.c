/*
 
 To count and display the number of characters, words and lines of a file.
 
 */
#include <stdio.h>

int main()
{
    FILE *fp;
    char ch;
    int chars = 0, words = 0, lines = 0, inWord = 0;

    fp = fopen("DATA.DAT", "r");
    if(fp == NULL)
        return 1;

    while((ch = getc(fp)) != EOF)
    {
        chars++;

        if(ch == '\n')
            lines++;

        if(ch == ' ' || ch == '\n' || ch == '\t')
            inWord = 0;
        else if(inWord == 0)
        {
            inWord = 1;
            words++;
        }
    }

    fclose(fp);

    printf("Characters: %d\n", chars);
    printf("Words: %d\n", words);
    printf("Lines: %d\n", lines);

    return 0;
}

