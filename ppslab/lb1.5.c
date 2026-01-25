/*Write a C program to input P, N and R, compute and display simple and compound interest. 
[Hint: SI = PNR/100, CI = P(1+R/100)^N*P]*/
#include <stdio.h>
#include <math.h>

int main()
 {
    float P, R, SI, CI;
    int N;

    printf("Enter Principal (P): ");
    scanf("%f", &P);
    printf("Enter Rate of Interest (R): ");
    scanf("%f", &R);
    printf("Enter Time (N in years): ");
    scanf("%d", &N);

    SI = (P * N * R) / 100;
    CI = P * pow((1 + R / 100), N) - P;

    printf("Simple Interest = %.2f\n", SI);
    printf("Compound Interest = %.2f\n", CI);

    return 0;
}
