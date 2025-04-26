package example.spring.core.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import example.Food_item.Fruit;
import example.dessert.Icecream;
import example.dessert.brownie.ChocolateBrownie;
import example.dessert.brownie.WalnetBrownie;

public class PureAnnotationBasedExampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig5.class);
		TestComponent tcObj = ctx.getBean(TestComponent.class);
		tcObj.testComponenet();
		System.out.println("\n-----------------------------------n");
		Fruit favFruit = ctx.getBean(Fruit.class);
		favFruit.tastFruit();
		System.out.println("\n-----------------------------------n");
		Icecream favIcecream = ctx.getBean(Icecream.class);
		favIcecream.getFavIcecream();
		System.out.println("\n-----------------------------------n");
		WalnetBrownie borwnie = ctx.getBean(WalnetBrownie.class);
		borwnie.getWalnetBrownie(); // or
		WalnetBrownie borwnie1 = (WalnetBrownie) ctx.getBean("walnetb"); // by id declared
		borwnie1.getWalnetBrownie();

		System.out.println("\n-----------------------------------n");
		ChocolateBrownie Chocoborwnie = ctx.getBean(ChocolateBrownie.class);
		Chocoborwnie.getChocolateBrownie();
	}
}
