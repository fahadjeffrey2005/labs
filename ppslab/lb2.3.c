//compute the roots of a quadratic equation using switch case statement n = (-b+/- sqrt(b^2-4ac)/2a)
#include <stdio.h>
#include <math.h>

int main() {
    float a, b, c, d, r1, r2, real, im;
    int caseType;

    printf("Enter coefficients a, b, and c of quadratic equation (ax^2 + bx + c = 0): ");
    scanf("%f %f %f", &a, &b, &c);

    if (a == 0) 
    {
        printf("Coefficient 'a' cannot be zero for a quadratic equation.\n");
        return 1;
    }

    d = pow(b,2) - 4 * a * c;


    if (d > 0)
        caseType = 1; 
    else if (d == 0)
        caseType = 2; 
    else
        caseType = 3;

    
    switch (caseType) 
    {
        case 1: 
            r1 = (-b + sqrt(d)) / (2 * a);
            r2 = (-b - sqrt(d)) / (2 * a);
            printf("Two distinct real roots:\n");
            printf("Root 1 = %.2f\n", r1);
            printf("Root 2 = %.2f\n", r2);
            break;

        case 2: 
            r1 = -b / (2 * a);
            printf("One real, repeated root:\n");
            printf("Root = %.2f\n", r1);
            break;

        case 3: 
            real = -b / (2 * a);
            im = sqrt(-d) / (2 * a);
            printf("Complex roots:\n");
            printf("Root 1 = %.2f + %.2fi\n", real, im);
            printf("Root 2 = %.2f - %.2fi\n", real, im);
            break;

        default:
            printf("Unexpected error in determining root type.\n");
            break;
    }

    return 0;
}