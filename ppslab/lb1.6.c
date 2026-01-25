/*Write a C program to input radius, compute and display the
 volume and surface area of a sphere.*/
#include <stdio.h>
#include <math.h>

int main()
 {
    float radius, volume, surface_area, pi = 3.14159;

    printf("Enter radius of the sphere: ");
    scanf("%f", &radius);
    if (radius < 0) 
    {
        printf("Radius cannot be negative.\n");
        return 1;
    }
    else 
    {
        volume = (4.0/3.0) * pi * pow(radius, 3);
        surface_area = 4 * pi * pow(radius, 2);

        printf("Volume of the sphere = %.2f\n", volume);
        printf("Surface area of the sphere = %.2f\n", surface_area);
    }

    return 0;
}