class Die {
  //declare private variables
  private color dieclr;
  private color eyeclr;
  private int eyes = (int)random(1, 7);

  //constructor that takes diecolor and color of eyes
  public Die (color dieclr, color eyeclr) {
    this.dieclr = dieclr;
    this.eyeclr = eyeclr;
  }

  //method to roll die and give eye count
  void roll() {
    eyes = (int)random(1, 7);
  }

  //getter for die eyes
  int getEyes() {
    return eyes;
  }

  //method to draw Die
  void draw(int x, int y, int size) {
    //set centermode for rect and ellipse
    rectMode(CENTER);
    ellipseMode(CENTER);
    
    
    //fills die with global var diecolor
    fill(dieclr);

    //draw die with input from user
    rect(x, y, size, size, 10);


    //size of eyes is relative to size of Die
    int eyesize = size/4;

    //fill with global var eyecolor
    fill(eyeclr);

    //switch depending on how many eyes the Die has
    switch(eyes) {
      //case for 1 eye and etc
    case 1:
      //center of dice
      ellipse(x, y, eyesize, eyesize);
      break;
    case 2:
      //move one first circle 1 "eyesize" back on x-axis and 1 "eyesize" up on y-axis
      ellipse(x-eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y+eyesize, eyesize, eyesize);
      break;
    case 3:
      ellipse(x-eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y+eyesize, eyesize, eyesize);
      ellipse(x, y, eyesize, eyesize);
      break;
    case 4:
      ellipse(x-eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y+eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x-eyesize, y+eyesize, eyesize, eyesize);
      break;
    case 5:
      ellipse(x, y, eyesize, eyesize);
      ellipse(x-eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y+eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x-eyesize, y+eyesize, eyesize, eyesize);
      break;
    case 6:
      ellipse(x-eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y+eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y-eyesize, eyesize, eyesize);
      ellipse(x-eyesize, y+eyesize, eyesize, eyesize);
      ellipse(x+eyesize, y, eyesize, eyesize);
      ellipse(x-eyesize, y, eyesize, eyesize);
      break;
    }
  }
}
