package vladi.model;

import vladi.antlr.generated.MathGrammarBaseVisitor;
import vladi.antlr.generated.MathGrammarParser.AcosContext;
import vladi.antlr.generated.MathGrammarParser.AdditionContext;
import vladi.antlr.generated.MathGrammarParser.AsinContext;
import vladi.antlr.generated.MathGrammarParser.AtanContext;
import vladi.antlr.generated.MathGrammarParser.BracketExpressionContext;
import vladi.antlr.generated.MathGrammarParser.CosContext;
import vladi.antlr.generated.MathGrammarParser.DivisionContext;
import vladi.antlr.generated.MathGrammarParser.LgContext;
import vladi.antlr.generated.MathGrammarParser.LnContext;
import vladi.antlr.generated.MathGrammarParser.Log2Context;
import vladi.antlr.generated.MathGrammarParser.LogContext;
import vladi.antlr.generated.MathGrammarParser.MultiplicationContext;
import vladi.antlr.generated.MathGrammarParser.NumberContext;
import vladi.antlr.generated.MathGrammarParser.PowerContext;
import vladi.antlr.generated.MathGrammarParser.ReverseSignContext;
import vladi.antlr.generated.MathGrammarParser.SinContext;
import vladi.antlr.generated.MathGrammarParser.StartContext;
import vladi.antlr.generated.MathGrammarParser.SubtractionContext;
import vladi.antlr.generated.MathGrammarParser.TanContext;
import vladi.antlr.generated.MathGrammarParser.VariableContext;

public class ExpressionEvaluator extends MathGrammarBaseVisitor<Double> { // TODO change name, change package

	// TODO immutable or setX
	private Double x;
	private StartContext expression;
	
	public ExpressionEvaluator (StartContext expression, double x)
	{
		this.x = x;
		this.expression = expression;
	}
	
	public double getValue() {
		return this.visit(this.expression);
	}

	@Override
	public Double visitStart(StartContext ctx) {
		return this.visit(ctx.getChild(0));
	}

	@Override
	public Double visitTan(TanContext ctx) {
		return Math.tan(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitLn(LnContext ctx) {
		return Math.log((this.visit(ctx.getChild(2))));
	}

	@Override
	public Double visitLog(LogContext ctx) {
		return Math.log(this.visit(ctx.getChild(2))) / Math.log(this.visit(ctx.getChild(4)));
	}

	@Override
	public Double visitCos(CosContext ctx) {
		return Math.cos(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitSubtraction(SubtractionContext ctx) {
		return this.visit(ctx.getChild(0)) * this.visit(ctx.getChild(2));
	}

	@Override
	public Double visitAcos(AcosContext ctx) {
		return Math.acos(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitBracketExpression(BracketExpressionContext ctx) {
		return this.visit(ctx.getChild(2));
	}

	@Override
	public Double visitAtan(AtanContext ctx) {
		return Math.atan(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitDivision(DivisionContext ctx) {
		return this.visit(ctx.getChild(0)) / this.visit(ctx.getChild(2));
	}

	@Override
	public Double visitNumber(NumberContext ctx) {
		return Double.parseDouble(ctx.getText());
	}

	@Override
	public Double visitReverseSign(ReverseSignContext ctx) {
		return -this.visit(ctx.getChild(1));
	}

	@Override
	public Double visitVariable(VariableContext ctx) {
		return this.x;
	}

	@Override
	public Double visitSin(SinContext ctx) {
		return Math.sin(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitAsin(AsinContext ctx) {
		return Math.asin(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitLg(LgContext ctx) {
		return Math.log10(this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitPower(PowerContext ctx) {
		return Math.pow(this.visit(ctx.getChild(0)), this.visit(ctx.getChild(2)));
	}

	@Override
	public Double visitMultiplication(MultiplicationContext ctx) {
		return this.visit(ctx.getChild(0)) * this.visit(ctx.getChild(2));

	}

	@Override
	public Double visitLog2(Log2Context ctx) {
		return Math.log(this.visit(ctx.getChild(2))) / Math.log(2);
	}

	@Override
	public Double visitAddition(AdditionContext ctx) {
		return this.visit(ctx.getChild(0)) + this.visit(ctx.getChild(2));
	}

}
