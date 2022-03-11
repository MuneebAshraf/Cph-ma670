//declare var s
DiceCup cup = new DiceCup();

//update values here for how many dices and size and start position
// best output is only to update number of dices
int dices = 1;
int dieSizes = 100;
int diePosX = width/dieSizes+dieSizes ;
int diePosY = height/dieSizes+dieSizes;

void setup () {
  background(100);
  size(1200, 1000);
  DieAndCup();
  cup.draw(diePosX, diePosY, dieSizes);
}

// add number of dices to Cup
void DieAndCup() {
  for (int i = 0; i < dices; i++) {

    //add die to cup
    cup.addDie();
  }
  //shake dices in cup
  cup.shake();
}

void draw() {
  //uncomment - run - og tryk på en tast for Epilipi-anfald
//keyPressed();
}



void keyPressed() {
  println("test");
  if (keyCode == ENTER) {
    background(100);
    cup.shake();
    cup.draw(diePosX, diePosY, dieSizes);
  } 
  
    if ( keyCode == DOWN) {
    background(100);
    cup.removeDie();
    cup.shake();
    cup.draw(diePosX, diePosY, dieSizes);
  }
  
   if ( keyCode == UP) {
    background(100);
    cup.addDie();
    cup.shake();
    cup.draw(diePosX, diePosY, dieSizes);
  }
}
