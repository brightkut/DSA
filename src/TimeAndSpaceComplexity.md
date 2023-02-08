# Time and Space Complexity

---

### Time Complexity

time complexity will calculate time that code used for running program
. it is analyzed for 2 scenario including very large input size and worst case scenario.

***Step***

1. Drop lower order term
2. Drop all the constant multipliers

***Ex1***

`T(n) = 3n^3 + 2n + 1`

1. Drop lower order Term

`T(n) = 3n^3`
2. Drop all the constant multipliers

`T(n) = n^3`

***Type of time complexity***
1. Loop

```
for (int i = 0 ; i< 10 ; i++){ // n times O(n)

    c= a+b  // constant time O(1)
}
```

T(n) =  O(n) + O(1)   =  O(n)

2. Nested Loop

```
for(int i = 0 ; i < nums.length ; i++){ // n times O(n)
    
    for ( int j = 0 < nums.length ; j++){ // m times O(m)
           c = a+b; // constant time O(1)
    }
}
```

T(n) =  O(n) * (O(m) + O(1) )  =  O(n) * O(m) = O(n*m)

assume n = m  ,  T(n) = O(n^2) 

3. Sequential Statement

```
    int a , b  = 2 ; // constant time O(1)
    int c = 0 ;  // constant time O(1)
    
    for(int i = 0 ; i < nums.length ; i++){  // n times O(n)
          c = a+b; // constant time O(1)
    }
    
    for(int j = 0 ; j<nums.length ; j++) { // m times O(m)
        c++; // constant time O(1)
    }
```
T(n) =  O(1) + O(1) + O(n) + O(m) = O(n) + O(m)
     
assume n = m ; T(n) = O(n)

4. if-else Statement

```
   if(a>0){
       // T(n) = O(n)
       
       for(int i = 0 ; i < nums.length ; i++){  // n times O(n)
          c = a+b; // constant time O(1)
       }
   
   }else {
        // T(n) = O(n^2)
        
       for(int i = 0 ; i < nums.length ; i++){ // n times O(n)
           for ( int j = 0 < nums.length ; j++){ // m times O(m)
               c = a+b; // constant time O(1)
           }
       } 
   }
```

we will return the maximum time complexity of all condition so time complexity is O(n^2)
     