#ifndef PRIME_COUNT_CONSOLE_H
#define PRIME_COUNT_CONSOLE_H

/* Shared input and timing support. The algorithm is in the other files. */
#ifndef _WIN32
#define _POSIX_C_SOURCE 200809L
#endif

#include <ctype.h>
#include <errno.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#ifdef _WIN32
#include <windows.h>
#else
#include <time.h>
#endif

/* This bound keeps divisor * divisor and number++ within a 32-bit int. */
#define MAX_LIMIT 1000000000

static int read_limit(int argc, char *argv[])
{
    char buffer[128];
    const char *text;
    if (argc == 1)
    {
        printf("Upper limit (0..%d): ", MAX_LIMIT);
        fflush(stdout);
        if (!fgets(buffer, sizeof buffer, stdin) || (!strchr(buffer, '\n') && !feof(stdin)))
        {
            fprintf(stderr, "Invalid input.\n");
            exit(EXIT_FAILURE);
        }
        text = buffer;
    }
    else if (argc == 2)
    {
        text = argv[1];
    }
    else
    {
        fprintf(stderr, "Usage: %s [limit]\n", argv[0]);
        exit(EXIT_FAILURE);
    }

    errno = 0;
    char *end;
    long value = strtol(text, &end, 10);
    if (end == text || errno == ERANGE || value < 0 || value > MAX_LIMIT)
    {
        fprintf(stderr, "Enter an integer from 0 to %d.\n", MAX_LIMIT);
        exit(EXIT_FAILURE);
    }
    while (isspace((unsigned char)*end))
    {
        end++;
    }
    if (*end != '\0')
    {
        fprintf(stderr, "Invalid input.\n");
        exit(EXIT_FAILURE);
    }
    return (int)value;
}

/* Elapsed wall time, using a monotonic clock on each platform. */
static double now_seconds(void)
{
#ifdef _WIN32
    LARGE_INTEGER ticks, frequency;
    if (!QueryPerformanceFrequency(&frequency) || !QueryPerformanceCounter(&ticks))
    {
        fprintf(stderr, "Timer unavailable.\n");
        exit(EXIT_FAILURE);
    }
    return (double)ticks.QuadPart / (double)frequency.QuadPart;
#else
    struct timespec time;
    if (clock_gettime(CLOCK_MONOTONIC, &time) != 0)
    {
        perror("clock_gettime");
        exit(EXIT_FAILURE);
    }
    return time.tv_sec + time.tv_nsec / 1e9;
#endif
}
#endif
