package vladi.controller;

import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;
import lombok.AllArgsConstructor;
import vladi.model.Point;
import vladi.model.SpaceLaw;

@AllArgsConstructor
public class MyScheduledService extends ScheduledService<Point> {
	public final static Double ONE_SECOND = 1000.0;
	final private SpaceLaw movementLaw;
	private Long beginningTime;

	public MyScheduledService(SpaceLaw movementLaw)
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
				Long currentTime = System.currentTimeMillis();
				Double dTime = (currentTime - beginningTime) / ONE_SECOND;
				
				return movementLaw.calcPosition(dTime);
			}
		};
		return task;
	}

}
