
public class Republican extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		if(!rightIsClear() && frontIsClear()) {
			move();
			}
	}

	@Override
	public void turnToTheNextSegment() {
		if(rightIsClear() ) {
			turnRight();
			move();
		}
		else {
			turnLeft();			
		}
	}

}
