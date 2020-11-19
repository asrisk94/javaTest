package kh.java.inherit.product;

public class ProductAfterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop d = new Desktop("삼성", "삼성데스크탑", 1_500_000, 
					"windows10", "27인치모니터", "기계식키보드");
		SmartPhone s = new SmartPhone("애플", "아이폰12", 1_000_000, 
						"ios", "kt");
		Television tv = new Television("LG", "롤러블", 3_000_000, 75);

		System.out.println(d.getProductInfo());
		System.out.println(s.getProductInfo());
		System.out.println(tv.getProductInfo());

	}

}
