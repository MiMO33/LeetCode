#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#include<limits.h>


char* reverseString(char* s) {
    int len = strlen(s);
    for(int i = 0, j = len - 1; i < len; i++, j--){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
    return s;
}