package com.spice;

import java.util.ArrayList;
import java.util.List;

import com.spice.model.BasketProduct;
import com.spice.model.SpiceBasket;
import com.spice.model.SpiceProduct;
import com.spice.model.SpiceRecipe;
import com.spice.model.SpiceUser;
import com.spice.repo.BasketRepository;
import com.spice.repo.ProductRepository;
import com.spice.repo.RecipeRepository;
import com.spice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpicesRUsApplication implements ApplicationRunner {

	//Get the productRepository instance injected and use it
	@Autowired
	private ProductRepository productRepository;

	//Get the userRepository instance injected and use it
	@Autowired
	private UserRepository userRepository;

	//Get the basketRepository instance injected and use it
	@Autowired
	private BasketRepository basketRepository;

	//Get the recipeRepository instance injected and use it
	@Autowired
	private RecipeRepository recipeRepository;

	//Inject PasswordEncoder as pe (to encode the password)
	@Autowired
	private PasswordEncoder pe;

	public static void main(String[] args) {
		
		SpringApplication.run(SpicesRUsApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		//Creating SpiceProduct Objects

		SpiceProduct s1 = new SpiceProduct();
		s1.setName("Cinnamon");
		s1.setDescription("Cinnamon, bushy evergreen tree of the laurel family (Lauraceae) and the spice derived from its bark. Cinnamon is native to Sri Lanka (formerly Ceylon), the neighbouring Malabar Coast of India, and Myanmar (Burma) and is also cultivated in South America and the West Indies. The spice, consisting of the dried inner bark, is brown in colour and has a delicately fragrant aroma and a warm sweet flavour. Cinnamon is used to flavour a variety of foods, from confections to curries to beverages, and is popular in bakery goods in many places.");
		s1.setFlavourDescription("The spice, consisting of the dried inner bark, is brown in colour and has a delicately fragrant aroma and a warm sweet and woodyflavour. Cinnamon has a slight citrusy note, and its spicy taste is often likened to the powerful punch of cloves. ");
		s1.setPairingDescription("Cinnamon is used to flavour a variety of foods, from confections to curries to beverages, and is popular in bakery goods in many places. Pairs really well with basil, lemon zest, mint, and anise. Foods: Pairs really well with guava, mango, berries, citrus fruits, and pork belly.");
		s1.setImage("https://www.cinnamononline.com/storage/2018/09/ceylon-cinnamonn.jpg");
		s1.setPrice(1.99f);
		s1.setWeight(25);
		s1.setSpicyLevel(0);
		productRepository.save(s1);

		SpiceProduct s2 = new SpiceProduct();
		s2.setName("Allspice");
		s2.setDescription("Allspice, (Pimenta dioica), also called Jamaican pepper or pimento, tropical evergreen tree of the myrtle family (Myrtaceae) and its berries, the source of a highly aromatic spice. The plant is native to the West Indies and Central America.");
		s2.setImage("https://cookingchew.com/wp-content/uploads/2020/05/Allspice-Substitute-CO487-FE.jpg");
		s2.setFlavourDescription("Allspice has a pleasantly warm, fragrant aroma. The name reflects the pungent taste, which resembles a peppery compound of cloves, cinnamon and nutmeg or mace.");
		s2.setPairingDescription("Allspice pairs well in dishes with other warm spices like ginger, cinnamon, cloves, and cumin, and is often used with fall ingredients like sweet potatoes, squash, and apples.");
		s2.setPrice(1.88f);
		s2.setWeight(25);
		s2.setSpicyLevel(1);
		productRepository.save(s2);

		SpiceProduct s3 = new SpiceProduct();
		s3.setName("Turmeric");
		s3.setDescription("Turmeric, (Curcuma longa), perennial herbaceous plant of the ginger family (Zingiberaceae), the tuberous rhizomes, or underground stems, of which have been used from antiquity as a condiment, a textile dye, and medically as an aromatic stimulant. Native to southern India and Indonesia, turmeric is widely cultivated on the mainland and in the islands of the Indian Ocean.");
		s3.setFlavourDescription("Fresh turmeric is crunchy, has gingery, citrus aromas and an agreeably earthy flavor with citrus overtones. Dried turmeric has a complex, rich, woody aroma with floral, citrus and ginger notes. The taste is slightly bitter and sour, moderately pungent, warm and musky.");
		s3.setPairingDescription("Turmeric combines well with chili, cilantro, cloves, coconut milk, coriander, cumin, curry leaf, fennel, galangal, garlic, ginger, kaffir lime leaves, lemon grass, mustard seeds, paprika and pepper. It is also good with beans, eggplant, eggs, fish, lentils, meat, poultry, rice, root vegetables and spinach.");
		s3.setImage("https://bakeitwithlove.com/wp-content/uploads/2021/06/Turmeric-Substitute-sq-500x500.jpg");
		s3.setPrice(0.85f);
		s3.setWeight(25);
		s3.setSpicyLevel(1);
		productRepository.save(s3);

		SpiceProduct s4 = new SpiceProduct();
		s4.setName("Star Anice");
		s4.setDescription("Star anise, dry fruits of the star anise tree (Illicium verum), used as a spice and source of pharmaceutical chemicals. The plant is indigenous to the southeastern part of China and to Vietnam. The flavour and uses of the fruit are similar to those of anise (Pimpinella anisum), to which is it is unrelated. The volatile, aromatic essential oil is commonly used for flavouring candies, liqueurs, and perfumes.");
		s4.setImage("https://sc04.alicdn.com/kf/U27a7e653c32b4987bb06f0611ad8a309L.jpg");
		s4.setFlavourDescription("Star anise has a mild and fragrant licorice flavor. It has been described as having a luxurious headiness along subtle sweet and herbal notes. It’s subtler than the medicinal taste of black jelly beans, but it can still overpower a dish if used immoderately. The flavour and uses of the fruit are similar to those of anise (Pimpinella anisum), to which is it is unrelated. The volatile, aromatic essential oil is commonly used for flavouring candies, liqueurs, and perfumes. ");
		s4.setPairingDescription("Although the flavor of star anise is generally thought of as sweet, it is commonly used in savory dishes; it pairs well with citrus, onions, poultry, beef, cinnamon, nutmeg, and ginger and should be used in small quantities.");
		s4.setPrice(0.85f);
		s4.setWeight(25);
		s4.setSpicyLevel(1);
		productRepository.save(s4);

		SpiceProduct s5 = new SpiceProduct();
		s5.setName("Paprika");
		s5.setDescription("Paprika is made from the dried, ground, ripened fruit pods of less pungent varieties of the Capsicum annum species. It is mildly flavored and prized for its brilliant red color. It is closely related to red pepper which also derives from the Capsicum annum species.");
		s5.setImage("https://media.istockphoto.com/photos/fresh-red-sweet-pepper-and-paprika-powder-picture-id501566876?k=20&m=501566876&s=612x612&w=0&h=wqrBqDibJdVBWQJUETGpY1WjJMOTL5ml-O8R8hESaEo%3D&fbclid=IwAR2N9ZUxWyj_tibTvm_pIMWh7Kor7kEJdXzw4ZF3PB3ro4ZTmWA0C4uRc0c");
		s5.setFlavourDescription("The aroma of paprika tends to be restrained and delicate; caramel notes, fruitiness or smokiness characterize some paprikas, while others have a nose prickling, light heat. Flavors vary from sweetly smoky to rounded and full-bodied, or gently pungent with bitter notes.");
		s5.setPairingDescription("Paprika is combined well with allspice, caraway, cardamom, garlic, ginger, oregano, parsley, pepper, rosemary, saff ron, thyme, turmeric, sour cream and yogurt.Good with beef and veal, white cheeses, chicken, duck, most legumes and vegetables, pork and rice. ");
		s5.setPrice(0.50f);
		s5.setWeight(25);
		s5.setSpicyLevel(2);
		productRepository.save(s5);

		SpiceProduct s6 = new SpiceProduct();
		s6.setName("Chilli Powder");
		s6.setDescription("Chili powder is a red-colored blend of powdered spices. While it contains some cayenne pepper for heat, it also has spices such as cumin, garlic powder, oregano, and paprika intended to lend the flavors expected in chili con carne.");
		s6.setImage("https://media.istockphoto.com/photos/composition-of-chili-pepper-dark-stone-background-from-slate-picture-id925529556?k=20&m=925529556&s=612x612&w=0&h=eyfWr8eDN3yQKel844_ypbi4IjQc010CjReFWt5G9Dw%3D&fbclid=IwAR18Tgvo5SEZhamym7au3kzC4RzrF60MEtMZ1l3Ou3sancDGVK_2TPj6B2w");
		s6.setFlavourDescription("Chili powder is mild to moderately spicy, depending on how much cayenne pepper makes up the mixture. The aromatic and savory spices in the blend create the flavor profile known as Tex-Mex. The blend might contain salt, which should be kept in mind when adding it to the pot or using it as a rub on barbequed or grilled meat.");
		s6.setPairingDescription("Chili powder is commonly used in traditional Latin American dishes like enchiladas and tacos. But a spoonful also adds a welcome kick to grilled meats, stew, soup, a pot of beans, and vegetables.");
		s6.setPrice(0.45f);
		s6.setWeight(25);
		s6.setSpicyLevel(3);
		productRepository.save(s6);

		SpiceProduct s7 = new SpiceProduct();
		s7.setName("Nutmeg");
		s7.setDescription("Nutmeg, (Myristica fragrans), tropical evergreen tree (family Myristicaceae) and the spice made of its seed. The tree is native to the Moluccas, or Spice Islands, of Indonesia and is principally cultivated there and in the West Indies. ");
		s7.setImage("https://cdnimg.webstaurantstore.com/uploads/blog/2018/10/blog_freshvsdriedherbs_in-blog-img3.jpg");
		s7.setFlavourDescription("Nutmeg have a similar rich, fresh, warm aroma. Nutmeg smells sweet but is more camphorous and pine-like than mace. The taste is warm and highly aromatic, and has hints of clove and a deeper, bittersweet, woody flavor.");
		s7.setPairingDescription("Nutmeg is combined well with cardamom, cinnamon, cloves, coriander,cumin, ginger, mace, pepper and thyme. Good with cabbage, carrots, cheese and cheese dishes, chicken, eggs, fish and seafood chowders, lamb, milk dishes,onion, potato, pumpkin pie, spinach, sweet potato and veal. ");
		s7.setPrice(3.00f);
		s7.setWeight(25);
		s7.setSpicyLevel(0);
		productRepository.save(s7);

		SpiceProduct s8 = new SpiceProduct();
		s8.setName("Cumin");
		s8.setDescription("Cumin, (Cuminum cyminum), also spelled cummin, annual plant of the parsley family (Apiaceae) and the spice made of its seedlike fruits. Native to the Mediterranean region, cumin is also cultivated in India, China, and Mexico and is used to flavour a variety of foods.It adds a warm flavor and works especially well in soups, stews, and curries.");
		s8.setFlavourDescription("The smell of cumin is strong and heavy, spicy-sweet with acrid but warm depth. The flavor is rich, slightly bitter, sharp, earthy, and warm, with a persistent pungency. Use sparingly.");
		s8.setPairingDescription("Cumin combines well with allspice, anise seed, bay, cardamom, chili, cinnamon, cloves, coriander, curry leaves, fennel seed, fenugreek, garlic, ginger, mace and nutmeg, mustard seed, oregano, paprika, pepper, thyme and turmeric. It is also good with beans, bread, cabbage, hard or pungent cheeses, chicken, eggplant, lamb, lentils, onions, potatoes, rice, sauerkraut and squash.");
		s8.setImage("https://www.thespruceeats.com/thmb/jjvqkrwNobsgCT29p_zR056Df-w=/1666x1666/smart/filters:no_upscale()/cumin-2500-56a20f715f9b58b7d0c623f6.jpg");
		s8.setPrice(1.90f);
		s8.setWeight(25);
		s8.setSpicyLevel(1);
		productRepository.save(s8);

		SpiceProduct s9 = new SpiceProduct();
		s9.setName("Saffron");
		s9.setDescription("Saffron, golden-coloured, pungent stigmas (pollen-bearing structures) of the autumn crocus (Crocus sativus), which are dried and used as a spice to flavour foods and as a dye to colour foods and other products. It is a powerful spice high in antioxidants. It has been linked to health benefits, such as improved mood, libido, and sexual function, as well as reduced PMS symptoms and enhanced weight loss.");
		s9.setFlavourDescription("Saffron has several different tasting notes: floral, honey-like, musky, mushroomy, pungent, fresh as the sea and bitter.");
		s9.setPairingDescription("Saffron combines well with cinnamon, cumin, cilantro, rosemary, thyme, paprika, as well as turmeric. It pairs well with flavors such as apples, almonds, cardamom, honey, poultry (particularly heritage chickens and squab), bone marrow, milk or cream (try it in ice cream!), cinnamon, lamb, seafood, garlic, white wine, vinegar, rose water, and citrus fruits.");
		s9.setImage("https://media.istockphoto.com/photos/top-view-of-red-saffron-threads-on-white-background-picture-id579774058?k=20&m=579774058&s=612x612&w=0&h=rcmr1Q5oojgvJlA47uPfP_StavtQl9l5bahxWrGbGWk=");
		s9.setPrice(7.99f);
		s9.setWeight(25);
		s9.setSpicyLevel(1);
		productRepository.save(s9);

		SpiceProduct s10 = new SpiceProduct();
		s10.setName("Sumac");
		s10.setDescription("Sumac berries grow on the Rhus Coriaria shrub, which is typically found in high plateau areas of the Mediterranean like Sicily, due to its wild, rocky lands. Sumac also grows in Turkey and can be found in parts of Iran. Once the berries are fully ripe, they are harvested, dried, and ground.");
		s10.setFlavourDescription(" The flavor of sumac is quite surprising as the deep red spice is reminiscent of fresh lemon juice. This sweet but sour taste is followed by an astringent powerful punch.");
		s10.setPairingDescription("Sumac blends exceptionally well with spices such as allspice, chili, thyme, and cumin. It is a versatile spice, and can be added to a meat rub, used as a flavoring in vegetable dishes (such as eggplant), and is the perfect seasoning for homemade hummus. Sumac is an ideal match for lamb and duck as it cuts through the fattiness of the meat. Similar to a squeeze of lemon juice over a finished recipe, sumac is at its best when sprinkled over a dish before serving. Sumac is also a good choice when looking to add a lemon flavor to a dish but don't want to add a liquid to the recipe.");
		s10.setImage("https://media.istockphoto.com/photos/sumac-in-a-glass-bottle-isolated-on-white-picture-id525801602?k=20&m=525801602&s=612x612&w=0&h=b9kZcjIBtCKU4oRY--woCI16YMLqwhYIyytXUNKPMQo=");
		s10.setPrice(1.75f);
		s10.setWeight(25);
		s10.setSpicyLevel(1);
		productRepository.save(s10);

		SpiceProduct s11 = new SpiceProduct();
		s11.setName("Vanilla");
		s11.setDescription("Vanilla is a spice from a long black pod which when opened reveals tiny black fragrant seeds that provide the most popular ice-cream flavoring in the world. It is native to Mexico coming from the fruit-bearing orchid named the vanilla plant. Vanilla is cured and dried in processing. The process of producing vanilla is labor-intensive as the plant needs to be individually hand-pollinated which has led to its expensive price.");
		s11.setFlavourDescription("The flavor of vanilla is distinctively sweet and perfumed with a hint of smoke which can be compared to caramel while the aroma is warm of wood and honey.");
		s11.setPairingDescription("Vanilla primarily has a sweet application and can be used as an individual flavoring or to enhance sweeter aspects of a dish. It combines well with anise, cardamon, cinnamon, nutmeg, and clove. The sweet use of vanilla means it compliments with ingredients including ice cream, cream, sugar, apple, raspberry, strawberry, rum, bourbon, white chocolate, lemon, yoghurt, pear, pomegranate, peach and honey.  ");
		s11.setImage("https://media.istockphoto.com/photos/vanilla-beans-picture-id528244683?k=20&m=528244683&s=612x612&w=0&h=7mNi3WWSimJ3jMcm4BIEuUsXcplemJkx5gQYkpcf_Mg=");
		s11.setPrice(4.50f);
		s11.setWeight(25);
		s11.setSpicyLevel(0);
		productRepository.save(s11);

		SpiceProduct s12 = new SpiceProduct();
		s12.setName("Oregano");
		s12.setDescription("Oregano, (Origanum vulgare), also called origanum or wild marjoram, aromatic perennial herb of the mint family (Lamiaceae) known for its flavourful dried leaves and flowering tops. Oregano is native to the hills of the Mediterranean countries and western Asia and has naturalized in parts of Mexico and the United States.");
		s12.setFlavourDescription("The aroma of oregano has a camphor note. The taste is pungent and described as earthy and green with some mint and hay. It can be slightly bitter.");
		s12.setPairingDescription("Garlic, onion, thyme, basil, parsley, and olive oil are common complementary seasoning partners with oregano. The spice can be used in more than just pizza and pasta sauce. The beautiful green herb adds a delicious, and perhaps unexpected, earthy flavor to several dishes including chicken, seafood, hamburgers, even beans.");
		s12.setImage("https://media.istockphoto.com/photos/oregano-picture-id466872720?k=20&m=466872720&s=612x612&w=0&h=Jnag6KIJjaTVUCxGmnwEPea_SY0D3xbeLXNN6r7ci1U=");
		s12.setPrice(0.95f);
		s12.setWeight(25);
		s12.setSpicyLevel(0);
		productRepository.save(s12);

		SpiceProduct s13 = new SpiceProduct();
		s13.setName("Coriander");
		s13.setDescription("Coriander (Coriandrum sativum), commonly known as Cilantro or Dhania, is a powerful herb with many health benefits. This plant is rich in micronutrients and nutritional elements. It contains dietary fibre, vitamins and minerals like calcium, magnesium, sodium and potassium");
		s13.setFlavourDescription("Floral and citrusy, coriander is a very fresh-tasting spice. Its mildly sweet, lemony flavor is often harnessed in conjunction with other spices in savory recipes.The small, creamy brown seeds of the coriander plant give dishes a warm, aromatic and slightly citrus flavour totally different to fresh coriander leaves.");
		s13.setPairingDescription("You’ll often see cumin and coriander paired together. Other combinations can be with basil, chervil, curry, sesame, saffron, pepper and thyme. The spice also pairs well with avocado, broccoli, cauliflower, coconut, corn,jicama, kohlrabi, mango, orange, papaya, pineapple, rockmelon, strawberry, sweet potato, and more");
		s13.setImage("https://media.istockphoto.com/photos/coriander-seeds-picture-id136967419?k=20&m=136967419&s=612x612&w=0&h=OiAcm7MFiK4aSC-kdbRALX2l_AJpAznZtawdNFCQOSs=");
		s13.setPrice(1.85f);
		s13.setWeight(25);
		s13.setSpicyLevel(0);
		productRepository.save(s13);

		SpiceProduct s14 = new SpiceProduct();
		s14.setName("Sesame");
		s14.setDescription("Sesame is crop that is grown for the oil in its seed. It is found in tropical and subtropical areas of Asia, Africa, and South America. Compared to similar crops, such as peanuts, soybean, and rapeseed, the seeds of sesame are believed to have the most oil. Sesame seeds are also rich sources of protein, vitamins, and antioxidants.");
		s14.setFlavourDescription("Sesame seeds have a mild, sweet, and nutty flavor and a satisfying crunch when eaten whole. They’re often baked or toasted to bring out a stronger almond-like flavor and aroma and make the seeds more evident in dishes. ");
		s14.setPairingDescription("You can combine sesame seeds with cardamom, cinnamon, cloves, oregano, as well as thyme. The seeds pair well with asparagus, broccolini, Brussels sprouts, chilli, coriander, cucumber, eggplant, garlic, ginger, lime, persimmon, spinach, sugar snap peas, yuzu, as well as zucchini.");
		s14.setImage("https://media.istockphoto.com/photos/sesame-seeds-picture-id1047603916?k=20&m=1047603916&s=612x612&w=0&h=-We-SmqZiMGeZzXSST30716tVmBOGrZdCOWLE5HRqHg=");
		s14.setPrice(1.50f);
		s14.setWeight(25);
		s14.setSpicyLevel(0);
		productRepository.save(s14);

		SpiceProduct s15 = new SpiceProduct();
		s15.setName("Bay Leaves");
		s15.setDescription("Bay leaves come from the bay laurel plant, an evergreen shrub that grows slowly in warm climates. The plants are grown for ornamental use and dried and used in cooking. The thick and leathery leaves are elongated with pointy ends. Most often, recipes call for dried bay leaves, which have a slightly stronger scent than fresh.");
		s15.setFlavourDescription("Since bay leaves aren't eaten, the flavor is more about what they bring to a recipe—and that is up for much debate. The spice adds a subtle depth of flavor. Bay leaves release their rich savory flavor slowly so add them to long-simmering soups, stews, pot roast, tomato sauce and slow cooker recipes.");
		s15.setPairingDescription("Bay leaves pair well with other flavors like allspice, basil, cardamom, chiles, cloves, fennel, ginger, garlic, onion, shallot, lemon, orange, marjoram, oregano, paprika, parsley, chervil, black pepper, rosemary, savory, sage, and thyme. ");
		s15.setImage("https://media.istockphoto.com/photos/close-up-of-dried-bay-leaves-laurus-nobilis-picture-id1269341115?k=20&m=1269341115&s=612x612&w=0&h=ltKsvbAlS9lOorMRRk33ygzsLw8REG5ob3k3m2kdU14=");
		s15.setPrice(2.00f);
		s15.setWeight(25);
		s15.setSpicyLevel(0);
		productRepository.save(s15);

		SpiceProduct s16 = new SpiceProduct();
		s16.setName("Cloves");
		s16.setDescription("Cloves are a spice made from the flower buds of an evergreen tree called, appropriately enough, the clove tree (Syzygium aromaticum). Clove flower buds are harvested in their immature state and then dried. Whole cloves are shaped like a small, reddish-brown spike, usually around 1 centimeter in length, with a bulbous top. Cloves can be used whole or ground, and they have a very strong, pungent flavor and aroma.");
		s16.setFlavourDescription("Cloves are a pungent warm spice with an intense flavor and aroma. The flavor comes from the compound eugenol. On the tongue, you'll detect sweetness, bitterness, and astringency (drying the mouth), with a noticeable amount of heat. Similar warm spices include nutmeg, cinnamon, and allspice.");
		s16.setPairingDescription("Cloves pair very well with other mouth-numbing flavors like citrus peel, star anise, and Sichuan peppercorns. The spice combines well with apple, beetroot, onion, orange, ginger, as well as pork meat.");
		s16.setImage("https://media.istockphoto.com/photos/cloves-picture-id175387917?k=20&m=175387917&s=612x612&w=0&h=OFFxsDWFm9MEXmd3-j57zYOn65HcZqw-UaG3l-eMu9s=");
		s16.setPrice(3.00f);
		s16.setWeight(25);
		s16.setSpicyLevel(1);
		productRepository.save(s16);

		
		//Creating example admin user account
		SpiceUser user = new SpiceUser();
		user.setUsername("root");
		user.setPassword(pe.encode("password"));
		user.setConfirmPassword(pe.encode("password"));
		user.setFirstName("John");
		user.setLastName("Smith");
		user.setEmail("john.smith@examplemail.com");
		user.setRoles("ROLE_ADMIN");
		userRepository.save(user);


		//Creating basket object
		SpiceBasket basket = new SpiceBasket();
		basket.setUser(user);
		List<BasketProduct> emptyBasket = new ArrayList<BasketProduct>();
		basket.setProducts(emptyBasket);
		basketRepository.save(basket);


		user.setBasket(basket);

		userRepository.save(user);

		Iterable<SpiceProduct> prods = productRepository.findAll();
		for (SpiceProduct spiceProduct : prods) {
			spiceProduct.setDiscount(1.00f);
			productRepository.save(spiceProduct);
		}


		//Creating Recipe items and Instructions

		//Recipe #1
		SpiceRecipe r1 = new SpiceRecipe();
		r1.setName("Holi gingerbread lamb");

		//Ingredients
		ArrayList<String> ingredientList = new ArrayList<>();
		ingredientList.add("1 large onion, roughly chopped");
		ingredientList.add("10cm/4in piece fresh root ginger, peeled and chopped");
		ingredientList.add("8 garlic cloves, roughly chopped");
		ingredientList.add("3 tbsp garam masala");
		ingredientList.add("1 tbsp ground cinnamon");
		ingredientList.add("450g/1lb thin gingernut biscuits");
		ingredientList.add("2 tbsp paprika");
		ingredientList.add("1 tbsp salt");
		ingredientList.add("6 tbsp vegetable oil");
		ingredientList.add("2kg/4lb 8oz leg of lamb");
		ingredientList.add("8 garlic cloves, roughly chopped");
		ingredientList.add("3 tbsp garam masala");
		ingredientList.add("1 tbsp ground cinnamon");
		ingredientList.add("450g/1lb thin gingernut biscuits");
		ingredientList.add("2 tbsp paprika");
		ingredientList.add("1 tbsp salt");
		ingredientList.add("6 tbsp vegetable oil");
		ingredientList.add("2kg/4lb 8oz leg of lamb");
		ingredientList.add("1kg/2lb 4oz floury potatoes, peeled and chopped to roast potato size");
		ingredientList.add("100ml/3½fl oz olive oil");
		ingredientList.add("2 garlic cloves, minced");
		ingredientList.add("2 tbsp brown sugar");
		ingredientList.add("1 tbsp salt, plus extra for boiling");
		ingredientList.add("1 tsp turmeric");
		ingredientList.add("1 tsp ground fenugreek");
		ingredientList.add("3 tbsp vegetable oil");
		ingredientList.add("1 tsp black mustard seeds");
		ingredientList.add("1 large dried red chilli");
		ingredientList.add("2 garlic cloves, crushed");
		ingredientList.add("1 sweetheart cabbage, chopped");
		ingredientList.add("½ tsp turmeric");
		ingredientList.add("⅛ tsp chilli powder");
		ingredientList.add("1 tsp brown sugar");
		ingredientList.add("pinch salt");
		ingredientList.add("½ lemon, juice only");
		ingredientList.add("½ tsp English mustard");


		r1.setIngredients(ingredientList);
		
		//Instructions 
		ArrayList<String> instructionList = new ArrayList<>();
		instructionList.add("1. To make the lamb, blend together all of the lamb ingredients, except the lamb, with 250ml/9fl oz water in a food processor or blender. Place the lamb in a large roasting tin. Score the leg of lamb and rub the paste all over the meat, pressing into the scored lines in the meat. Ideally, leave to marinate in the fridge overnight or leave for as long as possible. It can be cooked immediately but it is much better when left to absorb the spices.");
		instructionList.add("2. Preheat the oven to 180C/160C Fan/Gas 4. Add a cup of water to the tin and make a loose tent with some kitchen foil over the top. Roast for 2½–3 hours or until the lamb is tender and falling off the bone. Cover with the foil. ");
		instructionList.add("3. To make the potatoes, increase the oven heat to 240C/220C Fan/Gas 9. Bring a saucepan of salted water to the boil and par-boil the potatoes for 10-15 minutes. Drain the potatoes well and place into a roasting tin. Add the remaining ingredients and mix well, making sure the potatoes are well coated. Roast in the oven for 30 minutes.");
		instructionList.add("4. To make the greens, place a flat-bottomed wok over a high heat, add the oil and, once hot, add the mustard seeds. When they have finished spluttering, add the dried chilli and garlic and turn down the heat. Cook for a few seconds until the garlic is golden. Add the cabbage, turmeric, chilli powder, sugar, salt and about 2 tablespoons water. Stir-fry until the cabbage is just softened. Add the lemon juice and mustard and stir through.");
		instructionList.add("5. Serve the lamb with the turmeric potatoes and Bengali greens.");
		
		r1.setInstructions(instructionList);
		r1.setDescription("This delicious sweet, spiced lamb is a flavoursome and tasty twist on a classic roast dish. It's perfect for Holi celebrations or bringing oomph to your Sunday lunch.");
		r1.setSpiceDescription("Paprika, cinnamon, turmeric");
		r1.setSpicyLevel(0);
		r1.setImage("https://media.istockphoto.com/photos/raw-rack-of-lamb-picture-id174876120?k=20&m=174876120&s=612x612&w=0&h=jbv4cOm96JLXkv4EsP5LrnY-MLx8pW583xHruBaQJRo=");
		recipeRepository.save(r1);

		//Recipe #2 

		SpiceRecipe r2 = new SpiceRecipe();
		r2.setName("Escovitch fish");

		//Ingredients 

		ingredientList = new ArrayList<>();
		ingredientList.add("1 red snapper, gutted and scaled with head and tail left on");
		ingredientList.add("1 tsp allspice seeds, ground to a fine powder");
		ingredientList.add("260ml/9½fl oz vegetable oil, for frying");
		ingredientList.add("300ml/10fl oz malt vinegar");
	    ingredientList.add("1 large onion, thinly sliced into half moons");
		ingredientList.add("¼ Scotch bonnet chilli");
		ingredientList.add("3 peppers (1 red, 1 yellow and 1 green), sliced into 1cm/½in thick strips");
		ingredientList.add("1 large cho cho (available from Caribbean shops), sliced and heart removed");
		ingredientList.add("bunch of fresh thyme, leaves picked");
		ingredientList.add("3 spring onions, sliced");
		ingredientList.add("pinch of freshly ground black peppercorns");
		ingredientList.add("3 medium carrots, peeled into ribbons using a vegetable peeler");
		r2.setIngredients(ingredientList);

		//Instructions 

		instructionList = new ArrayList<>();
		instructionList.add("1. Make 2 deep slashes into each side of the fish. Sprinkle a few pinches of ground allspice all over the fish, rubbing it into the cuts and the cavity of the fish.");
		instructionList.add("2. Heat the vegetable oil in a large frying pan, until very hot. Gently lower the fish into the pan and leave to fry on one side for 7-10 minutes, until the snapper is golden brown and crisp. Turn the fish and cook on the other side, gently moving it around to ensure even cooking. Baste with the hot oil. Turn again and baste if necessary. Once cooked, carefuly lift out of the pan and leave to drain on a plate lined with kitchen paper. Leave to rest while you prepare the escovitch.");
		instructionList.add("3. Pour the vinegar into a large saucepan. Add the onion, chilli, peppers, cho cho, thyme, spring onions, a pinch of ground allspice and black pepper.");
		instructionList.add("4. Turn the heat to high, place a lid on the pan and steam for 10-15 minutes. Once the vegetables have begun to soften, turn off the heat, add the carrot ribbons and let the heat of the vegetables cook the ribbons for a further 5 minutes.");
		instructionList.add("5. Put some of the vegetables in the bottom of a large serving dish, place the fish on top and then put more vegetables on top of the fish and pour over some, but not all, of the juice from the pan. Can be eaten hot or cold.");

		r2.setInstructions(instructionList);
		r2.setDescription("A whole red snapper is shallow fried and served with escovitch, a traditional Caribbean vegetable dish.");
		r2.setSpiceDescription("Allspice, thyme, black peppercorn");
		r2.setSpicyLevel(2);
		r2.setImage("https://thatgirlcookshealthy.com/wp-content/uploads/2019/04/escovitch-fish2-4.jpg");
		recipeRepository.save(r2);

		//Recipe #3

		SpiceRecipe r3 = new SpiceRecipe();
		r3.setName("Pear Chutney");

		//Ingredients

		ingredientList = new ArrayList<>();
		ingredientList.add("200g demerara sugar");
		ingredientList.add("200ml cider vinegar");
		ingredientList.add("100ml perry (pear cider)");
		ingredientList.add("1 star anise");
		ingredientList.add("1 tsp ground cumin");
		ingredientList.add("2 red onions, chopped");
		ingredientList.add("1 tsp grated ginger");
		ingredientList.add("10 firm pears, peeled and chopped into bite-sized pieces");
		ingredientList.add("red chillies, halved (and deseeded if you prefer)");
		ingredientList.add("50g sultanas");
		r3.setIngredients(ingredientList);
		
		//Instructions

		instructionList = new ArrayList<>();
		instructionList.add("Put the sugar, cider vinegar, perry, star anise, cumin, red onions and ginger in a large saucepan and bring to the boil.");
		instructionList.add("Add the pears and chillies and simmer for 40 mins until the liquid is syrupy and the pears are just cooked. Stir in the sultanas, remove from the heat and leave to cool, then spoon into sterilised jars.");
		r3.setInstructions(instructionList);
		r3.setDescription("This warming, sweet sauce is easy to make and is a delicious way to add flavor to a variety of foods. It's traditionally served with naan or popadam, but you can pair it with Manchego cheese, put it on sandwiches, or even swirl it into a bit of yogurt for a delicious dip.");
		r3.setSpiceDescription("Nutmeg, allspice, saffron");
		r3.setSpicyLevel(1);
		r3.setImage("https://properfoodie.com/wp-content/uploads/2017/12/square-Pear-chutney-9.jpg");
		recipeRepository.save(r3);

		//Recipe #4

		SpiceRecipe r4 = new SpiceRecipe();
		r4.setName("Ratatouille");
		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("2 large aubergines");
		ingredientList.add("4 small courgettes");
		ingredientList.add("2 red or yellow peppers");
		ingredientList.add("4 large ripe tomatoes");
		ingredientList.add("5 tbsp olive oil");
		ingredientList.add("supermarket pack or small bunch basil");
		ingredientList.add("1 medium onion, peeled and thinly sliced");
		ingredientList.add("3 garlic cloves, peeled and crushed");
		ingredientList.add("1 tbsp red wine vinegar");
		ingredientList.add("1 tsp sugar (any kind)");
		r4.setIngredients(ingredientList);
		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("Cut 2 large aubergines in half lengthways. Place them on the board, cut side down, slice in half lengthways again and then across into 1.5cm chunks. Cut the ends off 4 small courgettes, then across into 1.5cm slices.");
		instructionList.add("Peel 2 red or yellow peppers from stalk to bottom. Hold upright, cut around the stalk, then cut into 3 pieces. Cut away any membrane, then chop into bite-size chunks.");
		instructionList.add("Score a small cross on the base of each of 4 large ripe tomatoes, then put them into a heatproof bowl. Pour boiling water over, leave for 20 secs, then remove. Pour the water away, replace the tomatoes and cover with cold water. Leave to cool, then peel the skin away.");
		instructionList.add("Quarter the tomatoes, scrape away the seeds with a spoon, then roughly chop the flesh.");
		instructionList.add("Set a sauté pan over medium heat and when hot, pour in 2 tbsp olive oil. Brown the aubergines for 5 mins on each side until the pieces are soft. Set them aside.");
		instructionList.add("Fry the courgettes in another tbsp oil for 5 mins, until golden on both sides. Repeat with the peppers. Don’t overcook the vegetables at this stage");
		instructionList.add("Tear up the leaves from the bunch of basil and set aside. Cook 1 thinly sliced medium onion in the pan for 5 minutes. Add 3 crushed garlic cloves and fry for a further minute. Stir in 1 tbsp red wine vinegar and 1 tsp sugar, then tip in the tomatoes and half the basil.");
		instructionList.add("Return the vegetables to the pan with some salt and pepper and cook for 5 mins. Serve with basil.");
		r4.setInstructions(instructionList);
		//Other descriptions
		r4.setDescription("Our ratatouille recipe is great to have on hand for an easy lunch or jacket potato topping. Rich tomato sauce with soft aubergine, courgette and peppers – this vegetarian dish will be a favourite with everyone.");
		r4.setSpiceDescription("Black Pepper, basil, salt");
		r4.setSpicyLevel(0);
		r4.setImage("https://media.istockphoto.com/photos/disneys-movie-ratatouille-reproduced-food-picture-id1252702645?k=20&m=1252702645&s=612x612&w=0&h=1n0ZXrkl6BkeugNX7OEeAni7pd9SNTahf1btI7FFUKg=");
		recipeRepository.save(r4);

		//Recipe #5

		SpiceRecipe r5 = new SpiceRecipe();
		r5.setName("Dosrset apple cake");
		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("150g/5½oz unsalted butter, softened, plus extra for greasing");
		ingredientList.add("75g/2½oz caster sugar");
		ingredientList.add("75g/2½oz soft light brown sugar");
		ingredientList.add("¼ tsp ground nutmeg");
		ingredientList.add("¼ tsp ground cinnamon");
		ingredientList.add("¼ tsp fine salt, plus a pinch");
		ingredientList.add("1 tbsp vanilla extract");
		ingredientList.add("3 free-range eggs");
		ingredientList.add("175g/6oz plain flour");
		ingredientList.add("2 tsp baking powder");
		ingredientList.add("2 medium bramley apples, cored, peeled and cut into 1cm pieces");
		ingredientList.add("15g/½oz demerara sugar");
		
		r5.setIngredients(ingredientList);
		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. Preheat the oven to 190C/170C Fan/Gas 5. Grease and line a 20cm/8in cake tin with baking paper.");
		instructionList.add("2. Beat the butter, caster sugar, light brown sugar, nutmeg, cinnamon, salt and vanilla extract together in a stand mixer with paddle attachment, until light and fluffy. Add the eggs one at a time, beating well after each addition.");
		instructionList.add("3. Mix the flours, baking powder and a pinch of salt together in a separate bowl, then gradually mix into the butter, sugar and egg mixture with a spatula or wooden spoon, stirring well to make sure there are no pockets of flour. Mix the apple pieces together with the cornflour until well coated, then combine with the cake mixture.");
		instructionList.add("4. Quarter the tomatoes, scrape away the seeds with a spoon, then roughly chop the flesh.");
		instructionList.add("5. Tip the cake mixture into the prepared tin and sprinkle with the demerara sugar. Bake for 45 minutes, or until a skewer inserted into the middle comes out clean.");
		instructionList.add("6. Remove from the oven and allow to cool completely in the tin before serving with a cup of tea or a drizzle of cream.");

		r5.setInstructions(instructionList);

		//Other descriptions
		r5.setDescription("A classic British apple cake with a cup of tea on a cool autumn day is hard to beat. This simple recipe is full of warming spices and tangy apple, dusted with crunchy demerara sugar. Delicious!");
		r5.setSpiceDescription("Nutmeg, cinnamon, vanilla extract");
		r5.setSpicyLevel(0);
		r5.setImage("https://media.istockphoto.com/photos/fresh-baked-apple-pie-picture-id1354933542?k=20&m=1354933542&s=612x612&w=0&h=ue_UrMtDbiKG81MYQGGx4r9lRTaXAIM46MTVipG67ac=");
		recipeRepository.save(r5);

		//Recipe #6

		SpiceRecipe r6 = new SpiceRecipe();
		r6.setName("Venetian seafood risotto");
		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("1 slice of nutmeg");
		ingredientList.add("pinch coriander seeds");
		ingredientList.add("4 cloves");
		ingredientList.add("1cm/½in cinnamon stick");
		ingredientList.add("pinch ground ginger");
		ingredientList.add("1 green cardamom pod, seeds only");
		ingredientList.add("⅛ tsp turmeric");
		ingredientList.add("⅛ tsp chilli powder");
		ingredientList.add("100g/3½oz celery, sliced");
		ingredientList.add("25g/1oz button mushrooms, washed and sliced thyme sprig");
		ingredientList.add("1kg/2lb 4oz flatfish bones (such as brill, sole, plaice) or fillets");
		ingredientList.add("1250g/9oz prawn heads and shells");
		ingredientList.add("2 shallots, finely chopped");
		ingredientList.add("350g/12oz carnaroli rice");
		ingredientList.add("125ml/4fl oz dry white wine");
		ingredientList.add("150ml/5fl oz prawn stock");
		ingredientList.add("100g/3½oz small shrimps");
		ingredientList.add("knob of butter");

		r6.setIngredients(ingredientList);
		
		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. For the spice mix, grind all of the ingredients using a pestle and mortar or an electric grinder. Store in an airtight tin or box.");
		instructionList.add("2. For the fish stock, put all the ingredients except the fish bones into a large pan, add 2¼ litres/3¾ pints water and bring to the boil. Turn down the heat and simmer gently for 20 minutes. Add the fish bones (or fish fillet) and bring back up to a simmer, skimming off any scum as it rises to the surface. Simmer for a further 20 minutes. Strain through a sieve into a clean pan and simmer a little longer, if necessary, until reduced to about 1¼ litres/2 pints. Keep warm.");
		instructionList.add("3. For the prawn stock, heat the olive oil in a large pan over a medium heat. Add the garlic and the prawn heads and shells. Stir-fry for a couple of minutes before adding the tomato purée, salt and 300ml/10fl oz water. Cook for 10 minutes, then pass through a sieve, pushing down on the shells to extract as much of the prawn flavour as you can. Discard the shells, set the stock aside and keep warm.");
		instructionList.add("4. For the risotto, heat 3 tablespoons of the olive oil in a large frying pan over a medium heat. Fry the shallots and garlic gently until softened. Add the rice and fry it in the oil for 2 minutes, then add the Byzantine spice mix and stir it through the rice.");
		instructionList.add("5. Add the white wine, bring to a simmer and allow to evaporate, then add a ladle of the hot fish stock.");
		instructionList.add("6. When this has been absorbed, add the next ladle, and continue to do so, stirring after each addition, until you have only a couple of ladlefuls left, this should take about 16-18 minutes. Add the mussels and prawn stock.");
		instructionList.add("7. Heat the remaining tablespoon of olive oil in a frying pan until simmering and fry the red mullet strips, squid rings and tentacles and shrimps briskly for 2–3 minutes.");
		instructionList.add("8. Season with salt and pepper. Stir the seafood into the risotto with the remaining fish stock and cook for 1-2 minutes, or until absorbed.");
		instructionList.add("9. Stir in the butter, crab meat and parsley, and serve immediately.");
	
		r6.setInstructions(instructionList);
		
		//Other descriptions
		r6.setDescription("A seafood risotto that has the distinctive mix of spices so particular to Venice, which is also known as the Byzantine spice mix. Serve this risotto alongside a salad for a delicious seafood supper.");
		r6.setSpiceDescription("Nutmeg, Coriander seeds, cinnamon stick, ginger, turmeric, chilli powder");
		r6.setSpicyLevel(3);
		r6.setImage("https://media.istockphoto.com/photos/risotto-with-seafood-squid-shrimps-and-mussels-in-a-pan-closeup-top-picture-id1314304491?k=20&m=1314304491&s=612x612&w=0&h=PiijNUW8Ie2cNdcwRc83AAft8s1_rr24-ht5XJSLLTg=");
		recipeRepository.save(r6);

		//Recipe #7

		SpiceRecipe r7 = new SpiceRecipe();
		r7.setName("Mini sausage rolls");

		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("½ small garlic clove");
		ingredientList.add("handful of parsley, chopped");
		ingredientList.add("400g sausagemeat or sausages");
		ingredientList.add("375g pack ready-rolled puff pastry");
		ingredientList.add("1 beaten egg, to glaze");
		
		r7.setIngredients(ingredientList);

		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. Heat the oven to 200C/180C fan/gas 6. Crush the garlic and a little salt to a paste using a pestle and mortar, or use the flat of a knife on a chopping board. Mix together with the parsley and stir in 50ml cold water.");
		instructionList.add("2. Blend the sausagemeat in a food processor (if using sausages, peel away the skins) on a high speed, pour the garlic water into the mixture, then season with pepper. Blend until combined.");
		instructionList.add("3. Unroll the pastry onto a board and cut in half lengthways.");
		instructionList.add("4. Divide the sausage mixture in two and spread along the length of each pastry strip in a cylinder shape, leaving a 1cm edge.");
		instructionList.add("5. Tightly roll the pastry around the sausagemeat and brush the ends with the beaten egg to secure.");
		instructionList.add("6. Cut each roll into 10 pieces with a sharp knife, each about 2.5cm long, and arrange on a baking sheet. Will keep, covered and frozen, for one month.");
		instructionList.add("7.Brush more beaten egg all over the pastry. Cook for 25-35 mins until the pastry is puffed and crisp and the meat has cooked through. Add an extra 10 mins if cooking from frozen. Eat hot or cold with tomato ketchup, if you like.");

		r7.setInstructions(instructionList);

		//Other descriptions
		r7.setDescription("Can anyone resist a sausage roll? No, not those cold, greasy supermarket sausage rolls... a real homemade sausage roll that's warm and buttery and has a quality filling.");
		r7.setSpiceDescription("Thyme, black pepper, salt");
		r7.setSpicyLevel(0);
		r7.setImage("https://media.istockphoto.com/photos/plate-full-of-sausage-baked-rolls-picture-id469982076?k=20&m=469982076&s=612x612&w=0&h=4oEEhLQKHebjKt_VWDc0OfVH5O0RFraQuXFUUXi8sJM=");
		recipeRepository.save(r7);

		//Recipe #8

		SpiceRecipe r8 = new SpiceRecipe();
		r8.setName("Fajita chicken fried rice");

		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("170g/6oz brown basmati rice");
		ingredientList.add("3 chicken thighs, skinless and boneless, cut into bite-sized chunks");
		ingredientList.add("1 large brown onion, roughly chopped");
		ingredientList.add("1 red pepper, deseeded and roughly chopped");
		ingredientList.add("1 tsp sweet smoked paprika");
		ingredientList.add("¾ tsp ground cumin");
		ingredientList.add("½ tsp ground coriander");
		ingredientList.add("½ tsp dried oregano");
		ingredientList.add("sea salt and freshly ground black pepper");

		r8.setIngredients(ingredientList);

		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. Cook the rice in a pan of boiling water until just tender. Drain well and set aside to cool.");
		instructionList.add("2. Meanwhile, season the chicken well with salt and pepper.");
		instructionList.add("3. Heat the olive oil in a large wok or high-sided frying pan over a medium–high heat. Fry the chicken until it is browned and cooked through. Using a slotted spoon, transfer the chicken to a plate lined with kitchen paper and set aside.");
		instructionList.add("4. Add the onion and peppers to the pan, season with salt and cook until the vegetables are just tender and starting to colour.");
		instructionList.add("5. Mix in the spices and oregano and fry for 1 minute. Add the rice, return the chicken to the pan and stir-fry until heated through.");
		instructionList.add("6. To serve, stir through the lime juice and fresh coriander.");

		r8.setInstructions(instructionList);
        
		//Other descriptions
		r8.setDescription("Everyone loves fajitas: this stir-fry combines gentle spicy fajita flavours with another family favourite – fried rice – to make a comforting treat for kids.");
		r8.setSpiceDescription("Paprika, cumin, coriander, oregano, black pepper, salt");
		r8.setSpicyLevel(1);
		r8.setImage("https://www.sugarandsoul.co/wp-content/uploads/2017/09/Chicken-Fajita-Rice-6-500x500.jpg");
		recipeRepository.save(r8);
		
		//Recipe #9

		SpiceRecipe r9 = new SpiceRecipe();
		r9.setName("Kimchi fried rice");

		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("1½ tbsp cold-pressed rapeseed oil");
		ingredientList.add("1 garlic clove , sliced");
		ingredientList.add("1 thumb-size piece ginger , grated");
		ingredientList.add("200g long stem broccoli , chopped");
		ingredientList.add("4 spring onions , thinly sliced");
		ingredientList.add("50g kimchi");
		ingredientList.add("200g pouch wholegrain rice");
		ingredientList.add("2 carrots , cut into ribbons using a peeler");
		ingredientList.add("2 eggs");
		ingredientList.add("1 lime , ½ juiced, ½ as a wedge, to serve");
		ingredientList.add("handful coriander");
		ingredientList.add("hot sauce , to serve (optional)");

		r9.setIngredients(ingredientList);

		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. Heat 1 tbsp of the oil in a large frying pan, and add the garlic, ginger, broccoli and half the spring onions. Fry for 5-7 mins until softened, then add the kimchi and fry for a couple of mins more. Tip in the rice, breaking it up with the back of your spoon, then stir through the carrot. Cook for a min until all heated through, then push everything to the side of the pan.");
		instructionList.add("2. Pour the remaining oil into the empty part of the pan, crack in the eggs, fry to your liking and season. Squeeze the lime juice over the rice and eggs, then scoop the rice into bowls. Top with the egg, coriander leaves, remaining spring onions and hot sauce, if using. Serve with lime wedges.");
		
		r9.setInstructions(instructionList);
        
		//Other descriptions

		r9.setDescription("Looking for a simple, tasty dinner? Kimchi fried rice makes great use of store cupboard ingredients and is packed with flavour thanks to a spicy kick from kimchi and gochujang.");
		r9.setSpiceDescription("Ginger");
		r9.setSpicyLevel(4);
		r9.setImage("https://media.istockphoto.com/photos/kimchi-fried-rice-picture-id1271637968?k=20&m=1271637968&s=612x612&w=0&h=0EkRYSPy3rakq4N2fHNu72IFMSVtk6h3r_SyEDeyMlE=");
		recipeRepository.save(r9);

		//Recipe #10

		SpiceRecipe r10 = new SpiceRecipe();
		r10.setName("Beef stroganoff");

		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("1 tbsp olive oil");
		ingredientList.add("1 onion, sliced");
		ingredientList.add("1 clove of garlic");
		ingredientList.add("1 tbsp butter");
		ingredientList.add("250g mushrooms, sliced");
		ingredientList.add("1 tbsp plain flour");
		ingredientList.add("500g fillet steak, sliced");
		ingredientList.add("150g crème fraîche");
		ingredientList.add("1 tsp English mustard");
		ingredientList.add("100ml beef stock");
		ingredientList.add("½ small pack of parsley, chopped");

		r10.setIngredients(ingredientList);

		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1.Heat 1 tbsp olive oil in a non-stick frying pan then add 1 sliced onion and cook on a medium heat until completely softened, around 15 mins, adding a little splash of water if it starts to stick.");
		instructionList.add("2. Crush in 1 garlic clove and cook for 2-3 mins more, then add 1 tbsp butter.");
		instructionList.add("3. Once the butter is foaming a little, add 250g sliced mushrooms and cook for around 5 mins until completely softened.");
		instructionList.add("4. Season everything well, then tip onto a plate.");
		instructionList.add("5. Tip 1 tbsp plain flour into a bowl with a big pinch of salt and pepper, then toss 500g sliced fillet steak in the seasoned flour.");
		instructionList.add("6. Add the steak pieces to the pan, splashing in a little oil if the pan looks dry, and fry for 3-4 mins, until well coloured.");
		instructionList.add("7. Tip the onions and mushrooms back into the pan. Whisk 150g crème fraîche, 1 tsp English mustard and 100ml beef stock together, then stir into the pan.");
		instructionList.add("8. Cook over a medium heat for around 5 mins.");
		instructionList.add("9. Scatter with some chopped parsley, and serve with pappardelle or rice.");

		r10.setInstructions(instructionList);
        
		//Other descriptions

		r10.setDescription("This classic creamy beef stroganoff recipe is made with mushrooms, smoked paprika and slices of pan-fried rump steak. It is also still filling without the rice, should you want to reduce the calorie count.");
		r10.setSpiceDescription("Paprika, parsley, black pepper");
		r10.setSpicyLevel(0);
		r10.setImage("https://media.istockphoto.com/photos/preparing-vegan-mushroom-stroganoff-picture-id1241725976?k=20&m=1241725976&s=612x612&w=0&h=4xbl9-66pOaxFZQZQylvFJtNSQ4rMa3C0qnjetZl7Nw=");
		recipeRepository.save(r10);

		//Recipe #11

		SpiceRecipe r11 = new SpiceRecipe();
		r11.setName("Dal paratha");

		//Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("100g/3½oz red lentils, washed and drained");
		ingredientList.add("1 tsp salt");
		ingredientList.add("½ tsp ground turmeric");
		ingredientList.add("50g/1¾oz green apple, peeled and grated");
		ingredientList.add("150g/5½oz natural yogurt");
		ingredientList.add("½ tsp chaat masala");
		ingredientList.add("½ tsp cumin seeds");
		ingredientList.add("½ tsp caster sugar");
		ingredientList.add("20ml/¾fl oz milk");
		ingredientList.add("10 fresh mint leaves, roughly chopped");
		ingredientList.add("200g/7oz chapati flour (or plain flour), plus extra for dusting");
		ingredientList.add("2 tsp finely chopped fresh coriander");
		ingredientList.add("1 tsp ground ginger");
		ingredientList.add("2 tsp ground coriander");
		ingredientList.add("2 tsp sunflower oil, plus extra for frying");
		ingredientList.add("pickle, to serve");
		ingredientList.add("pinch salt");

		r11.setIngredients(ingredientList);

		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. To make the dal, combine the lentils, boiling water, salt and turmeric in a pan and bring to the boil. Cover the pan with a lid and simmer, stirring regularly, until cooked – this should take about 20 minutes. Once the dal is cooked, leave it to cool.");
		instructionList.add("2. Meanwhile, make the raita. Squeeze the excess liquid out of the grated apple, then combine the apple in a mixing bowl with the rest of the ingredients. Mix together and set aside in the fridge until ready to serve.");
		instructionList.add("3. For the dough, mix the flour, fresh coriander, ground ginger, chilli powder (or flakes), ground coriander and salt in a mixing bowl. Add the cooled dal to the mixture and knead until smooth and elastic – this should take 5–6 minutes. Rub with the 2 teaspoons of sunflower oil and leave to rest for 15 minutes at room temperature.");
		instructionList.add("4. Divide the dough into eight equally sized balls. Lightly flour your work surface and roll each ball out into a disc around 2–3mm/⅒in thick and 18cm/7in in diameter. Repeat with each of the dough balls.");
		instructionList.add("5. Heat a frying pan over a medium heat and, once hot, place a paratha in the pan. Dry fry on each side until small blisters form on the surface, then brush each side with oil and fry until cooked evenly and crispy. Serve hot with the raita and a pickle of your choice.");
		
		r11.setInstructions(instructionList);		
	   
		//Other descriptions

		r11.setDescription("A paratha is a deliciously flaky flatbread, made by brushing ghee on the dough and folding it over itself before re-rolling and frying in a dry frying pan. Try our easy paratha recipes and you'll never need buy it again.");
		r11.setSpiceDescription("Turmeric, cumin seeds, chaat masala, ground ginger, red chilli powder");
		r11.setSpicyLevel(3);
		r11.setImage("https://media.istockphoto.com/photos/homemade-roti-chapati-flatbread-on-a-rustic-wooden-board-on-a-white-picture-id1334060745?k=20&m=1334060745&s=612x612&w=0&h=Ls_jejEfgOyh4Af5dfWngsGbcnN5VjDNohqc0vjlQDs=");
		recipeRepository.save(r11);

		//Recipe #12

		SpiceRecipe r12 = new SpiceRecipe();
		r12.setName("Pain patate");

        //Ingredients
		ingredientList = new ArrayList<>();
		ingredientList.add("1 tbsp butter");
		ingredientList.add("900g/2lb white sweet potatoes, peeled and finely grated (use orange if you can’t find white )");
		ingredientList.add("200g/7oz plain flour");
		ingredientList.add("60g/2¼oz freshly grated coconut or desiccated coconut");
		ingredientList.add("100g/3½oz dark muscovado sugar");
		ingredientList.add("2 tsp ground cinnamon");
		ingredientList.add("2 tsp ground nutmeg");
		ingredientList.add("5g/⅛oz fresh ginger, peeled and grated");
		ingredientList.add("1 tsp salt");
		ingredientList.add("1 x 400g/14oz tin coconut milk");
		ingredientList.add("1 x 400g/14oz tin evaporated milk");
		ingredientList.add("2 tsp vanilla extract");
		ingredientList.add("1 overripe banana, mashed");
		ingredientList.add("2–3 tbsp icing sugar, to dust");

		r12.setIngredients(ingredientList);

		//Instructions
		instructionList = new ArrayList<>();
		instructionList.add("1. Preheat the oven to 180C/160C Fan/Gas 4 and grease a medium, deep baking dish with the butter.");
		instructionList.add("2. Tip the grated sweet potato into a bowl and add the flour, coconut, sugar, spices, fresh ginger and salt. Mix until combined.");
		instructionList.add("3. Pour the coconut milk, evaporated milk and vanilla extract into a separate bowl. Whisk until evenly combined, then slowly pour into the sweet potato mixture to avoid any lumps – it will look a little wet, but that’s fine. Add the mashed banana and stir to combine.");
		instructionList.add("4. Place a pan over a low-medium heat and pour in the sweet potato mixture. Cook, stirring gently, for about 15 minutes. The sweet potato will begin to cook and the colour and texture will change slightly.");
		instructionList.add("5. Pour the sweet potato mixture into the prepared baking dish, spreading out evenly. Cover with a layer of baking paper, followed by a layer of foil.");
		instructionList.add("6. Bake for 75–90 minutes or until a dark crust forms on top and a knife inserted into the pudding comes out clean. Allow to cool a little, then dust with the icing sugar. Slice into pieces and serve warm.");

		r12.setInstructions(instructionList);
       
		//Other descriptions

		r12.setDescription("Pain patate is a Haitain sweet potato pudding made from sweet potato, coconut, evaporated milk and spices. It is found throughout the Caribbean, with recipes and methods varying from island to island.");
		r12.setSpiceDescription("Cinnamon, nutmeg, vanilla extract");
		r12.setSpicyLevel(0);
		r12.setImage("https://www.savorythoughts.com/wp-content/uploads/2019/12/Pain-Patate-Recipe-1-500x500.jpg");
		recipeRepository.save(r12);


	}
}
