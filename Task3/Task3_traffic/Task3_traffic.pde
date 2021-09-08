color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 255, 0);
color gray = color(75, 75, 75);
color background = color(88, 88, 88);
color top = gray;
color mid = gray;
color bot = gray;
int active = 1;

void setup() {
  size(210, 500);
}

void draw() {
  fill(background);
  rect(5, 5, 200, 500);

  fill(top);
  circle(100, 100, 150);
  fill(mid);
  circle(100, 250, 150);
  fill(bot);
  circle(100, 400, 150);
  setColor();
}

void setColor() {
  switch(active) {
  case 1:
     delay(1000);
    top = gray;
    mid = yellow;
    active = 2;
    break;
  case 2:
     delay(1000);
     mid = gray;
     bot = green;
     active=3;
         break;
  case 3:
    delay(1000);
    bot = gray;
    top = red;
    active = 1;
    break;
}
};
