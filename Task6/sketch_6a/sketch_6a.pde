void isTen(int a, int b) {
  if(a==10 || b ==10 || a+b==10) 
    println("Success!");
   else 
    println("Failure!");
  
}
int a = int(random(10));
int b = int(random(10));
//result gives 10 and sucess is printet
void setup() {
println(a+" "+b);
isTen(a,b);
}
