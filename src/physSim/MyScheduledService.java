package physSim;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import lombok.AllArgsConstructor;
import physSim.interfaces.IExpression;

@AllArgsConstructor
public class MyScheduledService extends ScheduledService<Point> {
	public final static double ONE_SECOND = 1000;
	final private IExpression movementLaw;
	private long beginningTime;

	public MyScheduledService(IExpression movementLaw)
	{
		this.movementLaw = movementLaw;
		this.beginningTime = System.currentTimeMillis();
	}
	
	@Override
	protected Task<Point> createTask() {
		Task<Point> task = new Task<Point>() {
			
			@Override
			protected Point call() throws Exception {
				if (isCancelled())
				{
					return null;
				}
				long currentTime = System.currentTimeMillis();
				double dTime = (currentTime - beginningTime) / ONE_SECOND;
				
				return movementLaw.calc(dTime);
			}
		};
		return task;
	}

}
