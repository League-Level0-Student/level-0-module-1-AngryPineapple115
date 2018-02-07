//week one

void setup() {
   size(500, 500);
}
void draw() {
  fill (203, 78, 78);
    background(255, 255, 255);
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (64, 129, 71);
    rect(176, 103, 12, 32);
    
    if(mousePressed) {
      fill (255, 255, 255);
    ellipse (80, 200, 145, 145);
    ellipse (275, 200, 145, 145);
    }
}