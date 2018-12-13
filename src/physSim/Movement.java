package physSim;

public class Movement implements Runnable {
	TreeFunction movementLawX = null;
	TreeFunction movementLawY = null;
	Body body = null;
	
	public Movement(Body body, TreeFunction movementLawX, TreeFunction movementLawY) {
		this.body = body;
		this.movementLawX = movementLawX;
		this.movementLawY = movementLawY;
	}
	
	@Override
	public void run() {
		Point bodyPos = body.getPosition();
		
		TreeFunction lawWithStartingX = new TreeFunction();
		lawWithStartingX.setData("+");
		TreeFunction x0 = new TreeFunction();
		x0.setData("number");
		x0.setValue(bodyPos.getX());
		lawWithStartingX.setBranch1(x0);
		lawWithStartingX.setBranch2(this.movementLawX);
		this.movementLawX = lawWithStartingX;
		
		TreeFunction lawWithStartingY = new TreeFunction();
		lawWithStartingY.setData("+");
		TreeFunction y0 = new TreeFunction();
		y0.setData("number");
		y0.setValue(bodyPos.getY());
		lawWithStartingY.setBranch1(y0);
		lawWithStartingY.setBranch2(this.movementLawY);
		this.movementLawY = lawWithStartingY;
		
		double dTime = 0.01;
		for (int i = 0; i < 1000; i++)
		{
			this.body.setPosition(new Point(this.movementLawX.operate(i * dTime), this.movementLawY.operate(i * dTime)));
			long beginningTime = System.currentTimeMillis();
			while (true)
			{
				try 
				{
					Thread.sleep((long)(dTime * 200));					
				}
				catch (InterruptedException e)
				{
					
				}
				long currentTime = System.currentTimeMillis();
				if (currentTime - beginningTime > (dTime) * 1000)
				{
					break;
				}
			}
		}
		
		
		
	}

}
