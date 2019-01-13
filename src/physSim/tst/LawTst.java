package physSim.tst;

import physSim.Point;
import physSim.interfaces.IExpression;

public class LawTst implements IExpression {

	@Override
	public Point calc(double t) {
		return new Point (t, 20 * Math.sin(t));
	}

}
