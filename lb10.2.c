/*
 To write a line of text into an existing file
*/
#include <stdio.h>

int main()
{
    FILE *fp;
    fp = fopen("DATA.DAT", "a");   

    if(fp == NULL)
    {
        printf("Error opening file!");
        return 1;
    }

    char text[100];

    printf("Enter a line of text to add to the file:\n");
    fgets(text, sizeof(text), stdin);

    fputs(text, fp);

    printf("Text successfully written to file.\n");

    fclose(fp);

    return 0;
}
