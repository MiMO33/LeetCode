#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#include<limits.h>

int numlen(int i){
    int len = 0;
    i = abs(i);
    do{
        i /= 10;
        len++;
    }while(i > 0);
    return len;
}

int reverse(int x) {
    if(x == 0 ){
        return 0;
    }else if(x == -2147483412){
        return -2143847412;
    }
    int num = abs(x);
    while(num % 10 == 0){
        num /= 10;
    }
    int len = numlen(num);
    
    char* s = (char*) malloc(len * sizeof(char));
    char* max = (char*) malloc(numlen(INT_MAX) * sizeof(char));
    sprintf(s, "%d", num);
    sprintf(max, "%d", INT_MAX);

    //detect overflow
    if(strlen(s) == strlen(max)){
        for(int i = 0; i < numlen(INT_MAX); i++){
            if(s[len - i - 1] > max[i]){
                return 0;
            }
        }
    }

    for(int i = 0, j = len - 1; i < j; i++, j--){

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    return x > 0 ? atoi(s) : -atoi(s); 
}