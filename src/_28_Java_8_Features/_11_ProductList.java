package _28_Java_8_Features;

import java.util.Arrays;
import java.util.List;

public class _11_ProductList {
	public static void main(String[] args) {

		_10_Product p1 = new _10_Product(1, "Pen", 10, 50);
		_10_Product p2 = new _10_Product(2, "Pencil", 10, 40);
		_10_Product p3 = new _10_Product(3, "Marker", 10, 100);
		_10_Product p4 = new _10_Product(4, "Sharpner", 10, 80);
		_10_Product p5 = new _10_Product(5, "Eraser", 10, 30);

		List<_10_Product> plist = Arrays.asList(p1, p2, p3, p4, p5);

		// case-insensitive check so "Pen", "Pencil" etc. actually match
		plist.stream()
			.filter(n -> n.getName().toLowerCase().startsWith("p"))
			.forEach(n->System.out.println(n));

		plist.stream()
			.map(n->n.getName())
			.forEach(n->System.out.println(n));

		plist.stream()
			.map(n -> n.getPrice() + 50)
			.forEach(n->System.out.println(n));
	}
}