int input = 35;
boolean isNegative=false;

if (input<0) {
  input *= -1;
  isNegative = true;
}

for (int i = input; i>=0 ; i--) {
  if (i == 6) {
     if(isNegative){
      println("minus-six");
    } else {
        println("six");
    }
  } else if (input/2==i) {
    println("HALF!");
  } else {
    if(isNegative){
      println("-"+i);
    } else {
       println(i);
    }
  }
}
