package sethi.vishal.MyWebApp.classes;

import java.util.List;

import sethi.vishal.MyWebApp.entity.Product;
import sethi.vishal.MyWebApp.entity.Review;
import sethi.vishal.MyWebApp.entity.Seller;

public class MakeProductDisplay {
	 

	public ProductDisplay makeProduct(String id) {
		ProductDisplay finalPro = new ProductDisplay();
		GetProductWithId get = new GetProductWithId();
		Product product = get.getProduct(id);
		int no = product.getNo();
		List<String> images = get.getImageNames(no);
		List<String> colors = get.availColors(no);
		String brand = get.brandName(product.getBrand());
		List<Review> reviews = get.giveProductReview(no);
		String type = get.getType(product.getType());
		Seller seller = get.getSeller(product.getSeller());
		float price = product.getPrice();
		float dealPrice = price - (product.getDiscount()/(float)100)*price;
		
		
		
		finalPro.setAvail(product.getAvail());
		finalPro.setBrand(brand);
		finalPro.setColors(colors);
		finalPro.setDealPrice(dealPrice);
		finalPro.setDescription(product.getDiscription());
		finalPro.setId(product.getId());
		finalPro.setImages(images);
		finalPro.setName(product.getName());
		finalPro.setNo(product.getNo());
		finalPro.setPrice(price);
		finalPro.setRating(product.getRatings());
		finalPro.setReviews(reviews);
		finalPro.setSeller(seller);
		finalPro.setType(type);
		
		
		return finalPro;
	}

}
