package binary.desafio;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		
		BinaryOperator<Double> calc1 =
				(preco, disconto) -> preco * (1 - disconto);
		double discountPrice = calc1.apply(p1.price, p1.discount);
		System.out.println(discountPrice);
		
		UnaryOperator<Double> calc2 =
				(imposto) -> imposto >= 2500 ? imposto * (1 + 0.085) : imposto;
		double taskPrice = calc2.apply(discountPrice);
		System.out.println(taskPrice);
		
		UnaryOperator<Double> calc3 = 
				(frete) -> frete >= 3000 ? frete + 100 : frete + 50;
		double fretePrice = calc3.apply(taskPrice);
		System.out.println(fretePrice);
		
		UnaryOperator<Double> calc4 =
				(round) -> Math.round(round * 100.0) / 100.0;
		double roundPrice = calc4.apply(fretePrice);
		System.out.println(roundPrice);
		
		Function<Double, String> finalmente = 
				(concatenado) -> "R$" + concatenado;
		String concPrice = finalmente.apply(roundPrice);
		
		System.out.println(concPrice);
	}

}
