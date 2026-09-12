#include "../console.h"

/* Implemented by the selected assembly file. No C prime-counting code. */
extern int count_primes(int limit);

int main(int argc, char *argv[]) {
    int limit = read_limit(argc, argv);

    double start = now_seconds();
    int count = count_primes(limit);
    double elapsed = now_seconds() - start;

    printf("Primes up to %d: %d\n", limit, count);
    printf("Elapsed time: %.6f s\n", elapsed);
    return 0;
}
