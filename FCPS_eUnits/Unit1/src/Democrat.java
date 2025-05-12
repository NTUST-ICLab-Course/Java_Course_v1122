
public class Democrat extends MazeEscaper {

	@Override
	public void walkDownCurrentSegment() {
		// TODO Auto-generated method stub
		if(!leftIsClear() && frontIsClear()) {
			move();
		}
	}

	@Override
	public void turnToTheNextSegment() {
		// TODO Auto-generated method stub
		if(leftIsClear()) {
			turnLeft();
			move();
		}
		else {
			turnRight();
		}
	}

}
