package com.sample.orderingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.sample.orderingapp.databinding.FragmentItemListBinding
import com.sample.orderingapp.ui.theme.OrderingAppTheme

class MenuActivity : ComponentActivity() {

    val totalPrice = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_menu)
        val binding = FragmentItemListBinding.inflate(layoutInflater)
        val menu = createMenu()
//        val recyclerView = binding.list
        val recyclerView: RecyclerView = findViewById(R.id.menu_list)
//        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyMenuItemRecyclerViewAdapter(menu)

    }
}

fun createMenu(): Menu {
    val tzatzikiSauce = MenuItem(
        name = "\"Tzatziki\" sauce",
        price = "4.90",
        image = null,
        description = "sauce(yogurt, cucumber, garlic and olive oil)",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val fava = MenuItem(
        name = "\"Fava\" (yellow split peas purée)",
        price = "6.80",
        image = null,
        description = "with capers, rocket, sun dried tomato and virgin olive oil",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val breadedArcadianFeta = MenuItem(
        name = "Breaded Arcadian feta",
        price = "8.00",
        image = null,
        description = "with spicy citrus fruit chutney, sauteed hazelnuts and spearmint oil",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val saganakiKefalotiri = MenuItem(
        name = "\"Saganaki\" Kefalotiri",
        price = "7.00",
        image = null,
        description = "in olive crust with thyme and lime marmalade",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val appetizers = MenuCategory(
        categoryName = "Appetizers",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(tzatzikiSauce, fava, breadedArcadianFeta, saganakiKefalotiri),
                note = null
            ),
        ),
        note = null
    )

    val superFoodSalad = MenuItem(
        name = "Super Food salad",
        price = "11.00",
        image = null,
        description = "with quinoa, cranberries, green apple, walnuts, pumpkin seeds, anthotiro cheese and berries vinaigrette",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val greekSalad = MenuItem(
        name = "Greek salad",
        price = "10.00",
        image = null,
        description = "with tomato, cucumber, onions, green peppers, feta cheese, carob rusks and basil olive oil",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val arcadiaSalad = MenuItem(
        name = "\"Arcadia\" salad",
        price = "11.00", image = null,
        description = "with fresh mix vegetables, manouri cheese, pear, figs, roasted hazelnut, carob syrup vinaigrette",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val greekKaleSalad = MenuItem(
        name = "Greek kale salad",
        price = "10.00",
        image = null,
        description = "with crispy sesame seed brittle, quinoa, chickpea, feta, orange, raisins and citrus fruit vinaigrette",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val lentilSalad = MenuItem(
        name = "Lentil salad",
        price = "12.00",
        image = null,
        description = "lentils, mixed fresh chopped vegetables, sundried tomatoes, wild rocket leaves, fried chick pea balls (Greek type of falafels) and extra virgin olive oil",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val mediterraneanSalad = MenuItem(
        name = "MEDITERRANEAN SALAD",
        price = "14.00",
        image = null,
        description = "WITH ROASTED CHICKEN FILLETS, MIXED SALAD, “GRAVIERA” CHEESE CHERRY TOMATOS, OLIVE OIL AND BASIL VINAIGRETTE",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val mixedSaladWithShrimp = MenuItem(
        name = "MIXED SALAD WITH SHRIMP",
        price = "16.00",
        image = null,
        description = "BROWN RICE WITH VEGETABLES, PICKLED FENNELS, LEMON PEARLS AND CITRUS VINAIGRETTE",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val salads = MenuCategory(
        categoryName = "Salads",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(
                    superFoodSalad,
                    greekSalad,
                    arcadiaSalad,
                    greekKaleSalad,
                    lentilSalad,
                    mediterraneanSalad,
                    mixedSaladWithShrimp
                ),
                note = null
            )
        ),
        note = null
    )

    val gemista = MenuItem(
        name = "\"Gemista\"",
        price = "11.50",
        image = null,
        description = "Tomatoes, peppers stuffed with rice and herbs",
        unit = "€",
        number = 0,
        discount = 1.0
    )
    val cabbageRolls = MenuItem(
        name = "Cabbage rolls in egg and lemon sauce",
        price = "12.00",
        image = null,
        description = "with fresh minced beef and herbs",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val soutzoukakiaSmirneika = MenuItem(
        name = "\"Soutzoukakia Smirneika\"",
        price = "14.00",
        image = null,
        description = "with tomato, cumin and fresh mashed potatoes",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val traditionalMousaka = MenuItem(
        name = "Traditional \"mousaka\"",
        price = "15.00",
        image = null,
        description = "with fresh minced beef and traditional beshamel sauce",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val vegetarianMousaka = MenuItem(
        name = "Vegetarian \"mousaka\"",
        price = "14.00",
        image = null,
        description = "Courgette, potatoes, aubergines, grilled tomato sauce and mushroom beshamel sauce",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val lambKleftiko = MenuItem(
        name = "Lamb \"kleftiko\"",
        price = "19.00",
        image = null,
        description = "in crispy filo with graviera cheese, fresh tomato and baked Santorini potatoes",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val archaicMousaka = MenuItem(
        name = "Archaic \"mousaka\"",
        price = "18.00",
        image = null,
        description = "with slow-baked young lamb in aubergine \"nest\", fresh tomato sauce and yoghurt",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val traditional = MenuCategory(
        categoryName = "Traditional",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(
                    gemista,
                    cabbageRolls,
                    soutzoukakiaSmirneika,
                    traditionalMousaka,
                    vegetarianMousaka,
                    lambKleftiko,
                    archaicMousaka
                ),
                note = null
            )
        ),
        note = null
    )

    val biftekia = MenuItem(
        name = "\"Biftekia\"",
        price = "14.00",
        image = null,
        description = "Greek beef patties served with pita bread, fried potatoes and grilled tomato",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val porkSteak = MenuItem(
        name = "Pork steak +/- 500 gr.",
        price = "16.50",
        image = null,
        description = "served with fried potatoes and cabbage-carrot salad",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val porkGyros = MenuItem(
        name = "Pork \"gyros\"",
        price = "15.00",
        image = null,
        description = "slices of pork meat served with pita bread, tzatziki and fried potatoes",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val grilledChickenSouvlaki = MenuItem(
        name = "Grilled \"chicken souvlaki\"",
        price = "15.00",
        image = null,
        description = "served with quinoa Greek salad (ingredients of Greek salad)",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val lambChops = MenuItem(
        name = "Lamb chops",
        price = "20.00",
        image = null,
        description = "served with fried potatoes and grilled cherry tomatoes",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val porkSouvlaki = MenuItem(
        name = "Pork souvlaki",
        price = "15.00",
        image = null,
        description = "served with fried potatoes, tzatziki",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val lambSouvlaki = MenuItem(
        name = "Lamb \"souvlaki\"",
        price = "19.00",
        image = null,
        description = "marinated in tsipouro, served with spicy lentil salad and thyme sauce",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val blackAngusBurger = MenuItem(
        name = "Black angus burger",
        price = "15.00",
        image = null,
        description = "with spicy sauce, fried onions, tomato and rocket. Served with fresh french fries and coleslaw salad",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val porkShank = MenuItem(
        name = "Pork shank",
        price = "18.00",
        image = null,
        description = "baked in the oven for 4 hours, served with mashed potatoes",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ribEyeBlackAngus = MenuItem(
        name = "Rib eye black angus",
        price = "30.00",
        image = null,
        description = "with fresh herbs butter, onion chutney, fresh french fries and politiki salad",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val mixGrillForTwo = MenuItem(
        name = "Mix grill for two people",
        price = "40.00",
        image = null,
        description = "pork and chicken souvlaki, sausage, burger and with pita bread, fried potatoes and tzatziki",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val meat = MenuCategory(
        categoryName = "Meat",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(
                    biftekia,
                    porkSteak,
                    porkGyros,
                    grilledChickenSouvlaki,
                    lambChops,
                    porkSouvlaki,
                    lambSouvlaki,
                    blackAngusBurger,
                    porkShank,
                    ribEyeBlackAngus,
                    mixGrillForTwo
                ),
                note = null
            )
        ),
        note = null
    )
    val marinatedAnchovy = MenuItem(
        name = "Marinated anchovy",
        price = "7.00",
        image = null,
        description = "with apple vinegar, extra virgin olive oil and fresh herbs",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val steamedMussels = MenuItem(
        name = "Steamed mussels*",
        price = "13.00",
        image = null,
        description = "in white wine, garlic, herbs and lemon",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val friedCalamari = MenuItem(
        name = "Fried calamari",
        price = "13.00",
        image = null,
        description = "served with lemon sauce",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val crispyFriedBreadedPrawns = MenuItem(
        name = "CRISPY FRIED BREADED PRAWNS MARINATED",
        price = "14.00",
        image = null,
        description = "WITH GREEK HERBS AND TARAMA SALAD MOUSSE",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val grilledOctopus = MenuItem(
        name = "Grilled octopus*",
        price = "18.00",
        image = null,
        description = "served with avocado mousse, onions, cherry tomatoes",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val bruschettaWithSmokedMussels = MenuItem(
        name = "BRUSCHETTA WITH SMOKED MUSSELS",
        price = "7.00",
        image = null,
        description = "TARAMOSALATA FISH ROW SPREAD AND ROCKET",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val shrimpsSaganaki = MenuItem(
        name = "Shrimps* \"saganaki\"",
        price = "18.00",
        image = null,
        description = "shrimps cooked with tomato sauce, a splash of ouzo and topped with crumbled feta",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val grilledSeaBeam = MenuItem(
        name = "Grilled sea-beam",
        price = "19.00",
        image = null,
        description = "+/- 500 grams whole fish with oil and lemon sauce, with cauliflower couscous and steamed beans",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val crispySkinSeaBassFillet = MenuItem(
        name = "Crispy skin sea bass fillet",
        price = "19.00",
        image = null,
        description = "with lime, mashed parsnip and green beans",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val seafoodVariety = MenuItem(
        name = "Seafood variety",
        price = "55.00",
        image = null,
        description = "with whole fresh fish, fried calamari, fried cod fish, grilled shrimps, steamed mussels and ‘fava’",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val fish = MenuCategory(
        categoryName = "Fish",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(
                    marinatedAnchovy,
                    steamedMussels,
                    friedCalamari,
                    crispyFriedBreadedPrawns,
                    grilledOctopus,
                    bruschettaWithSmokedMussels,
                    shrimpsSaganaki,
                    grilledSeaBeam,
                    crispySkinSeaBassFillet,
                    seafoodVariety
                ),
                note = null
            )
        ),
        note = "Ask for fresh fish of the day\n* frozen"
    )

    val spaghettiBolognese = MenuItem(
        name = "Spaghetti Bolognese",
        price = "12.50",
        image = null,
        description = "minced beef sauce with kefalotiri cheese",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val greekCarbonara = MenuItem(
        name = "Greek carbonara",
        price = "14.00",
        image = null,
        description = "pasta with marinated pork meat, fresh cream and kefalotiri cheese",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val arcadiaSpaghetti = MenuItem(
        name = "Arcadia spaghetti",
        price = "15.00",
        image = null,
        description = "with chicken, fresh and sundried tomatoes, white wine and fresh herbs",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val seaFoodSpaghetti = MenuItem(
        name = "Sea food spaghetti",
        price = "20.00",
        image = null,
        description = "with shrimps*, octopus*, mussels*, calamari, fennel, ouzo, fresh tomato, and crayfish sauce",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val penneWithWildMushroomRagu = MenuItem(
        name = "Penne",
        price = "15.00",
        image = null,
        description = "WITH WILD MUSHROOM RAGU, “KEFALOGRAVIERA” CHEESE AND FRESH THYME",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val pasta = MenuCategory(
        categoryName = "Pasta",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(
                    spaghettiBolognese,
                    greekCarbonara,
                    arcadiaSpaghetti,
                    seaFoodSpaghetti,
                    penneWithWildMushroomRagu
                ),
                note = null
            )
        ),
        note = null
    )

    val greenColaPepsiCola250ml = MenuItem(
        name = "Green Cola / Pepsi Cola 250ml",
        price = "3.50",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val greenColaPepsiColaLight250ml = MenuItem(
        name = "Green Cola / Pepsi Cola Light 250ml",
        price = "3.50",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val orangadeLemonadeSoda = MenuItem(
        name = "Orangade, lemonade, lemon soda, soda",
        price = "3.00",
        image = null,
        description = "orangade, lemonade, lemon soda, soda",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val iceTeaPeachOrLemon = MenuItem(
        name = "Ice tea peach or lemon",
        price = "4.00",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val tuvunuGreekHerbalIceTea = MenuItem(
        name = "\"TUVUNU\" Greek herbal ice tea 330ml",
        price = "3.50",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val sparklingWater250ml = MenuItem(
        name = "Sparkling water 250ml",
        price = "3.00",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val sparklingWater750ml = MenuItem(
        name = "Sparkling water 750ml",
        price = "6.00",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val mineralWater1lt = MenuItem(
        name = "Mineral water 1lt",
        price = "2.50",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val freshOrangeJuice250ml = MenuItem(
        name = "Fresh orange juice 250ml",
        price = "5.50",
        image = null,
        description = null,
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val juiceGiaGiamas = MenuItem(
        name = "Juice \"gia giamas\"",
        price = "5.50",
        image = null,
        description = "from 100% Greek fruits (lemon, peach, green apple-pomegranate)",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val softDrinks = MenuCategory(
        categoryName = "Soft drinks",
        items = listOf(
            SubCategory(
                name = null,
                items = listOf(
                    greenColaPepsiCola250ml,
                    greenColaPepsiColaLight250ml,
                    orangadeLemonadeSoda,
                    iceTeaPeachOrLemon,
                    tuvunuGreekHerbalIceTea,
                    sparklingWater250ml,
                    sparklingWater750ml,
                    mineralWater1lt,
                    freshOrangeJuice250ml,
                    juiceGiaGiamas
                ),
                note = null
            )
        ),
        note = null
    )


    val cooperativeNemea = MenuItem(
        name = "COOPERATIVE NEMEA",
        price = "18.00",
        image = null,
        description = "Moschofilero P.D.O of Peloponnese",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val toplouMonasteryBio = MenuItem(
        name = "Toplou Monastery BIO",
        price = "40.00",
        image = null,
        description = "Assyrtiko P.G.I of Crete",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ktimaDimopoulosSauvignonBlanc = MenuItem(
        name = "Ktima Dimopoulos",
        price = "40.00",
        image = null,
        description = "Sauvignon Blanc P.G.I of Florina",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val arcadia = MenuItem(
        name = "Arcadia",
        price = "20.00",
        image = null,
        description = "Moschofilero-Mosxato",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ktimaTzivaniBio = MenuItem(
        name = "Ktima Tzivani BIO",
        price = "30.00",
        image = null,
        description = "Malagouzia P.G.I of Central Greece",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val semiSweetWine = MenuItem(
        name = "Semi-sweet wine",
        price = "18.00",
        image = null,
        description = "",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val whiteWine = SubCategory(
        name = "White wines 750ml",
        items = listOf(
            cooperativeNemea, toplouMonasteryBio, ktimaDimopoulosSauvignonBlanc,
            arcadia, ktimaTzivaniBio, semiSweetWine
        ),
        note = null
    )

    val apla = MenuItem(
        name = "APLA",
        price = "30.00",
        image = null,
        description = "Vlahiko-Agiorgitiko",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val tzivaniKtimaBio = MenuItem(
        name = "TZIVANI KTIMA BIO",
        price = "30.00",
        image = null,
        description = "Temptation Agiorgitiko-Cab.Sauvignon P.G.I of central Greece",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val rose750ml = SubCategory(
        name = "Rose 750ml",
        items = listOf(apla, tzivaniKtimaBio),
        note = null
    )

    val ouzoMini = MenuItem(
        name = "Ouzo “MINI”",
        price = "12.00",
        image = null,
        description = "200ml",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ouzoPlomari = MenuItem(
        name = "Ouzo “Plomari”",
        price = "12.00",
        image = null,
        description = "200ml",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ouzoVarvagianni = MenuItem(
        name = "Ouzo “Varvagianni”",
        price = "12.00",
        image = null,
        description = "Red or White, 200ml",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val tsipouroTsilili = MenuItem(
        name = "Tsipouro Tsilili",
        price = "12.00",
        image = null,
        description = "200ml",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val metaxa5 = MenuItem(
        name = "Metaxa 5*/ Mastiha",
        price = "10.00",
        image = null,
        description = "old traditional white wine",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val whiskyGinVodkaTequila = MenuItem(
        name = "Whisky, Gin, Vodka, Tequila",
        price = "10.00",
        image = null,
        description = "old traditional white wine",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val cocktails = MenuItem(
        name = "Cocktails",
        price = "11.00",
        image = null,
        description = "old traditional white wine",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val alcoholBeverage = SubCategory(
        name = "Alcohol Beverage",
        items = listOf(
            ouzoMini, ouzoPlomari, ouzoVarvagianni,
            tsipouroTsilili, metaxa5, whiskyGinVodkaTequila,
            cocktails
        ),
        note = null
    )

    val ktimaDimopoulosToumba = MenuItem(
        name = "Ktima Dimopoulos ''Toumba''",
        price = "20.00",
        image = null,
        description = "Xinomavro, Syrah, Merlot P.G.I of Florina",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ktimaDimopoulosXinomavroReserve = MenuItem(
        name = "Ktima Dimopoulos",
        price = "30.00",
        image = null,
        description = "Xinomavro Reserve, P.D.O of Florina",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ktimaDimopoulosMerlot = MenuItem(
        name = "Ktima Dimopoulos",
        price = "32.00",
        image = null,
        description = "Merlot, P.G.I of Florina",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ktimaTzivani1000Nihtes = MenuItem(
        name = "Ktima Tzivani BIO",
        price = "30.00",
        image = null,
        description = "'1000 Nihtes'' Agiorgitiko",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val ktimaDimopoulosKontiKaridia = MenuItem(
        name = "Ktima Dimopoulos ''Konti Karidia''",
        price = "34.00",
        image = null,
        description = "Xinomavro-Cabernet Sauvignon Montepulciano P.G.I. of Florina",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val toplouMonasteryBioSyrahMerlot = MenuItem(
        name = "Toplou Monastery BIO",
        price = "38.00",
        image = null,
        description = "Syrah, Merlot, P.G.I of Crete",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val arcadiaAgiorgitiko = MenuItem(
        name = "Arcadia",
        price = "20.00",
        image = null,
        description = "Agiorgitiko",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val theopetraEstate24 = MenuItem(
        name = "THEOPETRA ESTATE 24",
        price = "70.00",
        image = null,
        description = "Varietes: Cabernet Sauvignon-Syrah 24 months aged in oak barrique and 24 months in bottle, P.G.I. Meteora",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val redWines = SubCategory(
        name = "Red wines 750ml",
        items = listOf(
            ktimaDimopoulosToumba,
            ktimaDimopoulosXinomavroReserve,
            ktimaDimopoulosMerlot,
            ktimaTzivani1000Nihtes,
            ktimaDimopoulosKontiKaridia,
            toplouMonasteryBioSyrahMerlot,
            arcadiaAgiorgitiko,
            theopetraEstate24
        ),
        note = null
    )

    val theopetraEstateEdeniaWhite = MenuItem(
        name = "THEOPETRA ESTATE EDENIA WHITE",
        price = "40.00",
        image = null,
        description = "",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val moetChandonBrut = MenuItem(
        name = "Moet & Chandon",
        price = "90.00",
        image = null,
        description = "Brut",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val zitsaSemiSparkling = MenuItem(
        name = "ZITSA Semi-sparkling",
        price = "40.00",
        image = null,
        description = "P.D.O Zitsa Debina",
        unit = "€",
        number = 0,
        discount = 1.0
    )

    val sparklingWines = SubCategory(
        name = "Sparkling Wines",
        items = listOf(
            theopetraEstateEdeniaWhite, moetChandonBrut, zitsaSemiSparkling
        ),
        note = null
    )

    val wines = MenuCategory(
        categoryName = "Wines",
        items = listOf(
            whiteWine, rose750ml, alcoholBeverage, redWines, sparklingWines
        ),
        note = null
    )

    return Menu(
        categories = listOf(
            appetizers, salads, traditional, meat, fish, pasta, softDrinks, wines
        )
    );


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OrderingAppTheme {
        Greeting("Android")
    }
}