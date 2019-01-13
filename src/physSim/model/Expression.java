package physSim.model;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import antlr.MathExpressionVisitor;
import antlr.MathGrammarLexer;
import antlr.MathGrammarParser;
import antlr.MathGrammarParser.StartContext;
import physSim.Point;
import physSim.interfaces.IExpression;

public class Expression implements IExpression {
	private MathExpressionVisitor visitor;
	private StartContext expressionX;
	private StartContext expressionY;
	
	public Expression (String movementLawX, String movementLawY)
	{
		CharStream inputStreamX = CharStreams.fromString(movementLawX);
		MathGrammarLexer lexerX = new MathGrammarLexer(inputStreamX);
		CommonTokenStream tokenStreamX = new CommonTokenStream(lexerX);
		MathGrammarParser parserX = new MathGrammarParser(tokenStreamX);
		MathGrammarParser.StartContext startContextX = parserX.start();
		this.expressionX = startContextX;
		
		CharStream inputStreamY = CharStreams.fromString(movementLawY);
		MathGrammarLexer lexerY = new MathGrammarLexer(inputStreamY);
		CommonTokenStream tokenStreamY = new CommonTokenStream(lexerY);
		MathGrammarParser parserY = new MathGrammarParser(tokenStreamY);
		MathGrammarParser.StartContext startContextY = parserY.start();
		this.expressionY = startContextY;
		
		MathExpressionVisitor visitor = new MathExpressionVisitor();
		this.visitor = visitor;
	}
	@Override
	public Point calc(double t) {
		return new Point(this.visitor.calc(this.expressionX, t), this.visitor.calc(this.expressionY, t));
	}

}
