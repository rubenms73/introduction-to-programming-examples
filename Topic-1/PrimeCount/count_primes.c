#include "console.h"

/* Count primes in [2, limit] by trying divisors up to the square root. */
int count_primes(int limit)
{
    int count = 0;
    int number = 2;

    while (number <= limit)
    {
        int divisor = 2;
        while (divisor * divisor <= number && number % divisor != 0)
        {
            divisor++;
        }
        if (divisor * divisor > number)
            count++;
        number++;
    }
    return count;
}

int main(int argc, char *argv[])
{
    int limit = read_limit(argc, argv);

    double start = now_seconds();
    int count = count_primes(limit);
    double elapsed = now_seconds() - start;

    printf("Primes up to %d: %d\n", limit, count);
    printf("Calculation time: %.6f s\n", elapsed);
    return 0;
}
