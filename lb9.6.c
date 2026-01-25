/*
Define a structure for a cricket player with members for player name, team name, and
batting average. Write a program to input data for multiple players and sort them by
batting average. (Use the concept of array and structures)
*/
#include <stdio.h>

int main()
{
    struct player
    {
        char name[50];
        char team[50];
        float avg;
    };

    int n;
    printf("Enter the number of players: ");
    scanf("%d", &n);
    getchar();
    struct player p[n];

    for (int i = 0; i < n; i++)
    {
        printf("\nPlayer %d:\n", i + 1);
        printf("Enter name: ");
        scanf("%[^\n]%*c", p[i].name);

        printf("Enter team: ");
        scanf("%[^\n]%*c", p[i].team);

        printf("Enter batting average: ");
        scanf("%f%*c", &p[i].avg);

        printf("\n");
    }

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            if (p[j].avg < p[j + 1].avg)
            {
                struct player temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }

    printf("\nPlayers sorted by batting average (descending):\n");
    for (int i = 0; i < n; i++)
    {
        printf("\nName: %s\n", p[i].name);
        printf("Team: %s\n", p[i].team);
        printf("Average: %.2f\n", p[i].avg);
        printf("\n");
    }

    return 0;
}
