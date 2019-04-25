package com.codecool.shop.config;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.SupplierDao;
import com.codecool.shop.dao.implementation.ProductCategoryDaoMem;
import com.codecool.shop.dao.implementation.ProductDaoMem;
import com.codecool.shop.dao.implementation.SupplierDaoMem;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Initializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductDao productDataStore = ProductDaoMem.getInstance();
        ProductCategoryDao productCategoryDataStore = ProductCategoryDaoMem.getInstance();
        SupplierDao supplierDataStore = SupplierDaoMem.getInstance();

        //setting up a new supplier
        Supplier rome = new Supplier("Rome", "A millenium of Roman virtue");
        Supplier arpino = new Supplier("Arpino", "The blood of Lazio");
        Supplier pella = new Supplier("Pella", "World tour from Pella coming to you soon");
        Supplier sparta = new Supplier("Sparta", "A handful of people against the world");
        Supplier athens = new Supplier("Athens", "First-hand democracy");
        Supplier carthage = new Supplier("Carthage", "Hear the mountains rumble");
        Supplier deluun = new Supplier("Deluun Boldog", "The cradle of the Golden Horde");
        Supplier hazajarat = new Supplier("Hazajarat", "Birth of the Arrow");
        Supplier owari = new Supplier("Owari", "The start of something big");
        Supplier mikagawa = new Supplier("Mikagawa", "Union for all");
        Supplier hiyoshi = new Supplier("Hiyoshi-maru", "Birth place of Toyotomi Hideyoshi");
        supplierDataStore.add(rome);
        supplierDataStore.add(arpino);
        supplierDataStore.add(pella);
        supplierDataStore.add(sparta);
        supplierDataStore.add(athens);
        supplierDataStore.add(carthage);
        supplierDataStore.add(deluun);
        supplierDataStore.add(hazajarat);
        supplierDataStore.add(owari);
        supplierDataStore.add(mikagawa);
        supplierDataStore.add(hiyoshi);

        //setting up a new product category
        ProductCategory roman = new ProductCategory("Roman", "General", "A roman genera always leads from the front.");
        ProductCategory greek = new ProductCategory("Greek", "General", "Philosophy and world domination from the best.");
        ProductCategory carthaginian = new ProductCategory("Carthaginian", "General", "The most surprising technologies from history.");
        ProductCategory mongolian = new ProductCategory("Mongolian", "General", "Horses like the wind, arrows like death.");
        ProductCategory japanese = new ProductCategory("Japanese", "General", "Tenka Fubu.");
        productCategoryDataStore.add(roman);
        productCategoryDataStore.add(greek);
        productCategoryDataStore.add(carthaginian);
        productCategoryDataStore.add(mongolian);
        productCategoryDataStore.add(japanese);

        //setting up products and printing it
        productDataStore.add(new Product("Julius Caesar", 4000, "TAL", "One of the greatest general of the world. Known for his victories over the Gallic tribes and as the main reason for the fall of the Roman Republic", roman, rome));
        productDataStore.add(new Product("Gaius Marius", 750, "TAL", "The seven time consul of Rome known for his military reforms and victories over the Numidians, the Cambri and Teutones.", roman, arpino));
        productDataStore.add(new Product("Alexander The Great", 4500, "TAL", "The greatest general of all time, conqueror of Persia, son of Philip II.", greek, pella));
        productDataStore.add(new Product("Leonidas", 900, "TAL", "The famous Spartan general who held the Thermopulai against the persian masses.", greek, sparta));
        productDataStore.add(new Product("Hannibal Barca", 1700, "TAL", "The greatest Carthaginian general who crossed the Alps with his army to surprise the Roman on their own turf.", carthaginian, carthage));
        productDataStore.add(new Product("Hasdrubal Barca", 1200, "TAL", "Younger brother of the famous Hannibal, held the Roman armies for years at the Iberian peninsula.", carthaginian, carthage));
        productDataStore.add(new Product("Genghis Khan", 3500, "TAL", "Unifier and first Khan of the Mongols. His empire was one of the greatest in world history rivaled only by the British.", mongolian, deluun));
        productDataStore.add(new Product("Jebe", 650, "TAL", "Jebe, the Arrow - one of the most prominent generals of the famous Genghis Khan.", mongolian, hazajarat));
        productDataStore.add(new Product("Oda Nobunaga", 1700, "TAL", "The first of the 3 unifiers of Japan, lord of Owari.", japanese, owari));
        productDataStore.add(new Product("Tokugawa Ieyasu", 1750, "TAL", "The third and final unifier of Japan, his shogunate lasted for centuries.", japanese, mikagawa));

        productDataStore.add(new Product("Pompeius Magnus", 2100, "TAL", "One of the most decorated and celebrated Roman general of his time. Defeated the pirates of the Mediterranean Sea, won the 3rd Mithridatic war and even defeated Julius Caesar on one occasion.", roman, rome));
        productDataStore.add(new Product("Lucius Cornelius Sulla", 800, "TAL", "The first dictator or Rome. Took the city by force 2 times, defeated the revolving Roman allies in the Social War and was victorious over Mithridates not in one, but in two wars", roman, rome));
        productDataStore.add(new Product("Miltiades", 1450, "TAL", "The victorious general of Marathon, also known as a famous chariot racer in his youth.", greek, athens));
        productDataStore.add(new Product("Toyotomi Hideyoshi", 1550, "TAL", "The second great unifier of Japan. Rose from Nobunaga's sandal-bearer to the highest ranks of Japan through his military genius and tactical abilites", japanese, hiyoshi));
        productDataStore.add(new Product("Mago Barca", 500, "TAL", "The youngest of the Carthagian lions - the sons of Hamilkar Barca. A famous general who led many troops to victory in Iberia against the Romans", carthaginian, carthage));
        productDataStore.add(new Product("Ogodei Khan", 3700, "TAL", "The third son of Genghis Khan and second Great Khan of the Mongol Empire, under his rule the Mongol Empire reached its farthest extent west and south", mongolian, deluun));
        productDataStore.add(new Product("Publius Cornelius Scipio Africanus", 1100, "TAL", "A Roman general and later consul who is often regarded as one of the greatest military commanders and strategists of all time", roman, rome));

    }
}
