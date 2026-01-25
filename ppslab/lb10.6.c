/*
 
 To print the last n characters of a file. Input ‘file name’ and ‘n’ value from console.
 
 */
#include <stdio.h>

int main()
{
    FILE *fp;
    char fname[50];
    int n, count = 0;
    char ch;

    printf("Enter file name: ");
    scanf("%s", fname);

    printf("Enter n: ");
    scanf("%d", &n);

    fp = fopen(fname, "r");
    if(fp == NULL)
        return 1;

    while((ch = getc(fp)) != EOF)
        count++;

    if(n > count)
        n = count;

    fseek(fp, -n, SEEK_END);

    while((ch = getc(fp)) != EOF)
        putchar(ch);

    fclose(fp);

    return 0;
}

