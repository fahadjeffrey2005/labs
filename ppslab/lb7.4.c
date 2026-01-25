// to find and delete a substring in a given input


#include <stdio.h>
#include <string.h>
int main()
{
    int chlen, dellen;
    char ch[300], del[300];
    printf("Enter the string: ");
    fgets(ch, sizeof(ch), stdin);
    chlen = strlen(ch);

    printf("Enter the word to be deleted: ");
    fgets(del, sizeof(del), stdin);
    dellen = strlen(del);

    for (int i = 0; i <= chlen - dellen; i++)
    {
        int match = 1;
        for (int j = 0; j < dellen; j++)
        {
            if (ch[i + j] != del[j])
            {
                match = 0;
                break;
            }
        }

        if (match)
        {
            for (int k = i; k <= chlen - dellen; k++)
            {
                ch[k] = ch[k + dellen];
            }
            chlen -= dellen;
            i--;
        }
    }

    printf("%s", ch);
    return 0;
}

