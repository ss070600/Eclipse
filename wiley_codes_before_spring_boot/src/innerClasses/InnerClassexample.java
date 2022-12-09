package innerClasses;
class Brand{
	String brandName;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	class Product{
		String prodDesc;
		int prodQuantity;
		public int getProdQuantity() {
			return 100;
		}
	public void display() {
		System.out.println(brandName);
	}
		
		
	}
	class AnotherProduct{
		String prodDesc;
		int prodQuantity;
		public int getProdQuantity() {
			return 200;
		}
	}
}

public class InnerClassexample {

	public static void main(String[] args) {
		Brand brand = new Brand();
		brand.setBrandName("nokia");
		Brand.Product product = brand.new Product();
		
		Brand.AnotherProduct anotherProduct = brand.new AnotherProduct();
		
		System.out.println(product.getProdQuantity());
		product.display();
		System.out.println(anotherProduct.getProdQuantity());

	}

}
