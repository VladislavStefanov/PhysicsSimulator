package vladi.model;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import vladi.antlr.generated.MathGrammarLexer;
import vladi.antlr.generated.MathGrammarParser;
import vladi.antlr.generated.MathGrammarParser.StartContext;

public class MovementLaw implements SpaceLaw {
	private StartContext movementLawX;
	private StartContext movementLawY;
	private Point position0;
	public MovementLaw (String movementLawX, String movementLawY, Point position0)
	{
		this.movementLawX = this.createMovementLaw1D(movementLawX);
		this.movementLawY = this.createMovementLaw1D(movementLawY);
		this.position0 = position0;
	}
	@Override
	public Point calcPosition(double t) {
		ExpressionEvaluator expressionEvaluatorX = new ExpressionEvaluator(this.movementLawX, t);
		ExpressionEvaluator expressionEvaluatorY = new ExpressionEvaluator(this.movementLawY, t);
		return new Point(expressionEvaluatorX.getValue() + this.position0.getX(), expressionEvaluatorY.getValue() + this.position0.getY());
	}
	
	private StartContext createMovementLaw1D(String movementLaw1D)
	{
		CharStream inputStream = CharStreams.fromString(movementLaw1D);
		MathGrammarLexer lexer = new MathGrammarLexer(inputStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		MathGrammarParser parser = new MathGrammarParser(tokenStream);
		MathGrammarParser.StartContext startContext = parser.start();
		return startContext;
	}

}
