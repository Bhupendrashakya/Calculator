Class Calculator{
public static int add(int a , int b){
return a+b; 
}
public static int substract(int a , int b){
return a-b; 
}
public static int multiply(int a , int b){
return a*b; 
}
public static int divide(int a , int b){
return a/b; 
}
public static void main(String[] args){
int a = 4; 
int b = 6 ; 
Calculator cal=new Calculator();
cal.add(a,b); 
cal.substract (a,b); 
cal.multiply(a,b);
cal.divide(a,b);
}

}