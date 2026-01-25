/*
 
 To read a file and write into another file converting all characters to upper case.
 
 */
#include <stdio.h>
#include <ctype.h>

int main()
{
    FILE *fp1, *fp2;
    char ch;

    fp1 = fopen("SOURCE.DAT", "r");
    fp2 = fopen("DEST.DAT", "w");

    if(fp1 == NULL || fp2 == NULL)
        return 1;

    while((ch = getc(fp1)) != EOF)
        putc(toupper(ch), fp2);

    fclose(fp1);
    fclose(fp2);

    return 0;
}
