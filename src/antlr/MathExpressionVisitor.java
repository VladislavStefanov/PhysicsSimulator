package antlr;

import antlr.MathGrammarParser.AcosContext;
import antlr.MathGrammarParser.AdditionContext;
import antlr.MathGrammarParser.AsinContext;
import antlr.MathGrammarParser.AtanContext;
import antlr.MathGrammarParser.BracketExpressionContext;
import antlr.MathGrammarParser.CosContext;
import antlr.MathGrammarParser.DivisionContext;
import antlr.MathGrammarParser.LgContext;
import antlr.MathGrammarParser.LnContext;
import antlr.MathGrammarParser.Log2Context;
import antlr.MathGrammarParser.LogContext;
import antlr.MathGrammarParser.MultiplicationContext;
import antlr.MathGrammarParser.NumberContext;
import antlr.MathGrammarParser.PowerContext;
import antlr.MathGrammarParser.ReverseSignContext;
import antlr.MathGrammarParser.SinContext;
import antlr.MathGrammarParser.StartContext;
import antlr.MathGrammarParser.SubtractionContext;
import antlr.MathGrammarParser.TanContext;
import antlr.MathGrammarParser.VariableContext;

public class MathExpressionVisitor extends MathGrammarBaseVisitor<Double> {
	
	private Double x;
	
	public double calc(StartContext expression, double x)
	{
		this.x = x;
		return this.visit(expression);
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
