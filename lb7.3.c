// Check whether the given string is a palindrome or not.
#include <stdio.h>
#include <string.h>

int main() {
    char ch[300];
    printf("Enter the string: ");
    scanf("%[^\n]", ch);

    int len = strlen(ch);
    int flag = 1;

    for (int i = 0; i < len / 2; i++)
    {
        if (ch[i] != ch[len - i - 1])
        {
            flag = 0;
            break;
        }
    }

    if (flag)
        printf("The string is a palindrome.\n");
    else
        printf("The string is not a palindrome.\n");

    return 0;
}
