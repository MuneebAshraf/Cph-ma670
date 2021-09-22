class DiceCup { //<>//
  //declare private vars
  private ArrayList<Die> cup;
  private ArrayList<Die>[] CupLines;
  
  
  //constructor
  public DiceCup () {
    cup = new ArrayList<Die>();
  }

  //method to add die to cup
  void addDie() {
    cup.add(newDie());
  }

  //method to call roll() method on each Die in cup
  void shake() {
    for (Die die : cup) {
      die.roll();
    }
  }

  //method to draw each Die in cup-line
  void draw(int x, int y, int dieSize) {

    
      
    //declare rows
    //rows will alwys be 6 as each row represent possible number of eyes (min 1, max 6)
    int rows = 6;

    //instantiate Array of ArrayLists with Dices
    CupLines = new ArrayList[rows];

    //instatiate each ArrayList of Dices in Array
    for (int i = 0; i<CupLines.length; i++) {
      CupLines[i] = new ArrayList<Die>();
    }

    //distance from center of one die to another is 1.5 die
    int distance = dieSize + dieSize/2;
    int eyesOnDie;

    //Loop through each Die in diceCup
    for (int i = 0; i < cup.size(); i++) {

      //get current Die in cup
      Die currentDie =  cup.get(i);
      //get number of eyes on current Die
      eyesOnDie = currentDie.getEyes();

      //decrement with 1 bc array starts with 0 And Put eachDie in corresponding ArrayList in Array
      CupLines[eyesOnDie-1].add(currentDie);
    }


    // Draw each ArrayList of dices in array
    
    //int lineNumber is var to place Die depending on number of eyes Die
    int lineNumber = 0;
    
    //for loop to go through each Arraylist in Array called Cuplines
    for (int i = 0; i < CupLines.length; i++) {
      
      //for loop to go through each Die in each ArrayList
      for (int j = 0; j < CupLines[i].size(); j++ ) {
        Die current = CupLines[i].get(j);
        //println(current.getEyes());

        current.draw(x+distance*j, y+lineNumber*distance, dieSize);
      }
      if (!CupLines[i].isEmpty())
        lineNumber++;
    }
  }

  //method to remove last Die in cup
  void removeDie() {
    cup.remove(cup.size()-1);
  }

  //method to create new Die and return Die
  Die newDie() {
    return new Die(randomColor(), randomColor());
  }


  //method to create random color with random value from 0 to 255 in RGB
  color randomColor() {
    return color((int)random(0, 256), (int)random(0, 256), (int)random(0, 256));
  }
}
