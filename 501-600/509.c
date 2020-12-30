int fib(int n){
	if(n == 0) {return 0;}
    	if(n == 1 || n == 2){return 1;}
	int* list = (int*)malloc(sizeof(int) * (n+1));
    	list[0] = 0;
    	list[1] = list[2] = 0;
    	for(int i = 3; i != n - 1; i++) {
        	list[i] = list[i - 1] + list[i - 2];
    	}
    	return list[n - 1];
}
