package reviews.resturants;

/*import java.util.Collection;
import java.util.HashMap;
import java.util.Map;*/

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class RestaurantPopulator implements CommandLineRunner{
	
	@Resource
	public CategoryRepository categoryRepository;

	@Resource
	public ReviewRepository reviewRepository;

	@Override
	public void run(String... args) throws Exception {

		Category italian = new Category(1L, "Italian");
		categoryRepository.save(italian);
		Category mexican = new Category(2L, "Mexican");
		categoryRepository.save(mexican);
		Category asian = new Category(3L, "Asian");
		categoryRepository.save(asian);
		Category american = new Category(4L, "American");
		categoryRepository.save(american);

		Review restaurant = new Review(0L, "Outback Steakhouse", "/images/OutbackSteakhouse.jpg", "American",
				"Outback has been one of favorite for years, but a sign on the door may change that. My ribeye was was cooked perfect to the point that the knife wasn't hardly needed. The salads were large and fresh and the bread was fresh. My problem is a new sign saying no firearms allowed. If this is a store by store decision, I guess I will have to find a new favorite restaurant",
				"614-755-9926", "6000 E Main St, Columbus, OH 43213", "Mon-Thu: 11:00am  10:00pm",
				" Fri-Sat: 11:00am - 11:00pm", "Sun: 11:00am-  9:00pm");

		reviewRepository.save(restaurant);

		Review restaurant1 = new Review(1L, "J. Alexander's", "/images/J.Alexanders.jpg", "American",
				"Delicious as usual! Never a disappointment. I read the menu every time and every time I get the same thing because it is so amazing. The drink-a fleur de lis. The appetizer-deviled eggs. The salad-Is a Alex but it's the dressing that makes it a standout, champagne vinaigrette. The main-Filet, it just melts. I take home half my dinner just so I can have dessert-Carrot cake and French press coffee. If you have never been here make a reservation pronto. There is quite a variety to pick from. Sushi sandwiches, even chicken tenders. It is always a nice evening out. My husbands favorite part is the cold bottle of water they bring to the table. He smiles every time they set it down.",
				"(614) 847-1166", "7550 Vantage Dr\r\n" + "Columbus, OH 43235", "Mon-Thu: 11:00am - 10:00pm",
				"Fri-Sat: 11:00am - 11:00pm", "Sun: 10:30am - 9:00pm");
		reviewRepository.save(restaurant1);

		Review restaurant2 = new Review(2L, "Chile Verde", "/images/ChileVerde.jpg", "Mexican",
				"atisfy your cravings for authentic New Mexican cuisine right here at Chile Verde Cafe. Our food is a unique fusion of Native American and Latino cultures, featuring the most exotic flavors that will certainly delight any palate.",
				"614-442-6630", "4852 Sawmill Rd, Columbus, OH 43235", "Mon-Thu: 11:00am  9:00pm",
				"Fri-Sat: 11:00am  10:00pm", "Sun: Closed");
		reviewRepository.save(restaurant2);

		Review restaurant3 = new Review(3L, "Condados Tacos", "/images/CondadosTacos.jpg", "Asian",
				"Great tacos and a fantastic happy hour Monday through Friday. Have had issues with the wait staff messing up the checks repeatedly, and it can get loud in there during peak times. Otherwise it's a good place for some casual tacos and tequila.",
				"614-928-3909", "1227 N High St, Columbus, OH 43201", "Mon-Thur: 11:00am - 2:00am",
				"Fri-Sat: 11:00am - 2:00am", "Sun: 11:00am - 2:00am");
		reviewRepository.save(restaurant3);

		Review restaurant4 = new Review(4L, "Bravo Cucina Italiana", "/images/BravoCrosswoods.jpg", "Italian",
				"Bring your appetite and your zest for life to our BRAVO Cucina Italiana Italian Restaurant at our Crosswoods location, and you can experience your own little slice of Italy right here in Columbus Ohio. Enjoy traditional classics with a twist in an elegant, family-friendly setting that's perfect for any occasion. It's all right here waiting at BRAVO Cucina Italiana, the best Italian Restaurant in Columbus.",
				"(614) 888-3881", "7470 Vantage Drive\r\n" + "Columbus, OH 43235", "Mon-Thu: 11:30am - 9:30pm",
				"Fri-Sat: 11:30am - 10:00pm", "Sun: 11:00am - 9:00pm");
		reviewRepository.save(restaurant4);

		Review restaurant5 = new Review(5L, "Buci Di Bepo", "/images/BuciDiBepo.jpg", "Italian",
				"The restaurant decoration is fabulous.. They walk you through the kitchen before seating, I recommend picking one entree for two because the portions are HUGE there is no way that you can have a 3 course meal with these portions. I would definitely go back to this restaurant when I am craving for Italian and very hungry!",
				"614-621-3287", "343 N Front St Columbus, Ohio 43215", " Mon-Thu: 11:00am - 10:00pm",
				"Fri-Sat: 11:00am - 11:00pm", "Sun: 11:00am - 9:00pm");
		reviewRepository.save(restaurant5);

		Review restaurant6 = new Review(6L, "Sushi Time", "/images/SushiTime.jpg", "Asian",
				"Great quality for the price. I'm not a sushi expert so I really like what they offer me. All you can eat lunch menu has less options than dinner menu but it is cheaper. Lunch is about $13 and dinner about $23. You don't have to do the all you can eat option and just buy at menu price.",
				"614-372-5228", "2653 N High St, Columbus, OH 43202", "Mon-Thu:	10:30pm10:00pm",
				"Fri-Sat:	10:30am  11:00pm", " Sun: 11:30am  10:00pm");
		reviewRepository.save(restaurant6);

		Review restaurant7 = new Review(7L, "House of Japan", "/images/HouseOfJapan.jpg", "Asian",
				"This place is great.  I have been coming here for 7 years. Rocky is my favorite chef.  I love when  I I get him and some kids at the table.  He always makes it's fun.",
				"614-781-1776", "8701 Sancus Blvd, Columbus, OH 43240", "Mon-Thu: 11:30am2:pm, 5:00pm  9:30pm",
				"Fri-Sat: 10:30am - 11:00pm", " Sun: 11:30am - 10:00pm");
		reviewRepository.save(restaurant7);
	}

	/*Map<Long, Category> categories = new HashMap<>();

	Map<Long, Review> reviews = new HashMap<>();

	public Collection<Review> findAllReviews() {
		return reviews.values();
	}

	public Review findOneReview(Long id) {
		return reviews.get(id);
	}

	public Collection<Category> findAllCategories() {
		return categories.values();
	}

	public Category findOneCategory(Long id) {
		return categories.get(id);
	}*/
}


