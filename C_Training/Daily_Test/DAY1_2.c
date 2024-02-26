#include <stdio.h>
#include <string.h>

void moveZeroesToEnd(char* num) {
    int count = 0;
    int n = strlen(num);
    for (int i = 0; i < n; i++) {
        if (num[i] != '0') {
            num[count++] = num[i];
        }
    }
    while (count < n) {
        num[count++] = '0';
    }
}

int main() {
    int T;
    scanf("%d", &T);
    while (T--) {
        char num[11];
        scanf("%s", num);
        moveZeroesToEnd(num);
        printf("%s\n", num);
    }
    return 0;
}
