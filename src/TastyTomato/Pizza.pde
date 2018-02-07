void setup() {
}
  
void draw() {


size(2000, 2000);

fill(206, 204, 167);
ellipse(400, 300, 300, 300);

fill(203, 93, 76);
ellipse(400, 300, 250, 250);

fill(229, 219, 12);
ellipse(400, 300, 200, 200);


pepperoni.resize(10, 10);
PImage pepperoni = loadImage("pepperoni.gif");
image(pepperoni, 400, 300);

}