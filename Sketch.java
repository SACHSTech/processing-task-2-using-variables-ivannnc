import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 204, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  // sun
    fill(255, 255, 0);
    ellipse(width/8, height/8, (float)(width/5.3), (float)(height/5.3));

  // house
    strokeWeight(3);
    fill(92, 64, 51);
    square(width/2, (float)(height/1.7), (float)(width/3.4));
    triangle(width/2, (float)(height/1.69014085), (float)(width/1.53846154), height/3, (float)(width/1.2605042), (float)(height/1.69014085));
    fill(204, 204, 204);
    rect((float)(width/1.7), (float)(height/1.56), (float)(width/7.2), (float)(height/4.2));
    ellipse(425, 480, 25, 25);
    ellipse((float)(width/1.41), (float)(height/1.25), width/24, height/24);
  
  // tree
    fill(0, 153, 0);
    ellipse((float)(width/7.2), (float)(height/1.53846154), (float)(width/6.1), (float)(height/6.1));
    fill(92, 64, 51);
    rect(width/8, (float)(height/1.37), width/40, (float)(height/6.1));
    
	  
	// 
  }
  
  // define other methods down here.
}