package com.book.simplerecipebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecyclerView;
    RecyclerViewAdapter myAdapter;
    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recipes1=new ArrayList<>();
        recipes1.add(new Recipes("gulabjamun"," FOR JAMUN: \n" +
                "¾ cup (100 grams) milk powder, unsweetened\n" +
                "½ cup (60 grams) maida / plain flour\n" +
                "½ tsp baking powder\n" +
                "2 tbsp ghee / clarified butter\n" +
                "milk, for kneading\n" +
                "ghee or oil, for frying\n" +
                "FOR SUGAR SYRUP:\n" +
                "2 cup sugar\n" +
                "2 cup water\n" +
                "2 cardamom\n" +
                "¼ tsp saffron / kesar\n" +
                "1 tsp lemon juice\n" +
                "1 tsp rose water","Method",

                "1.firstly, in a large bowl take ¾ cup milk powder, ½ cup maida and ½ tsp baking powder.\n" +
                        "2.mix well, homemade gulab jamun mix is ready.\n" +
                        "3.now add 2 tbsp ghee and mix well making the flour moist.\n" +
                        "4.further, add milk as required start to combine.\n" +
                        "5.combine well forming a soft dough. do not knead the dough.\n" +
                        "cover and rest for 10 minutes.\n" +
                        "6.meanwhile, prepare the sugar syrup by taking 2 cup sugar, 2 cup water, 2 cardamom and ¼ tsp saffron.\n" +
                        "7.mix well and boil for 5 minutes or until the sugar syrup turns sticky. do not attain any string consistency.\n" +
                        "8.turn off the flame and add 1 tsp lemon juice and 1 tsp rose water. lemon juice is added to prevent sugar syrup from crystallizing.\n" +
                        "9.cover and keep the sugar syrup aside.\n" +
                        "10.after 10 minutes or resting the dough, start to prepare small ball sized jamuns.\n" +
                        "make sure there are no cracks in the jamun. if there are cracks then there are high chances for jamuns to break while frying.\n" +
                        "10.deep fry in medium hot oil or ghee. frying in ghee gives good flavour to jamuns.\n" +
                        "11.stir continuously and fry on low flame.\n" +
                        "fry until the jamuns turn golden brown.\n" +
                        "12.drain off and transfer the jamun into a hot sugar syrup.\n" +
                        "cover and rest for 2 hours or until jamuns absorb the sugar syrup and doubles in size.\n" +
                        "finally, enjoy gulab jamun with ice cream or as it is.",R.drawable.gulabjamun));
        recipes1.add(new Recipes("kaju katli","2 cup cashew / kaju\n" +
                "1 cup sugar\n" +
                "½ cup water\n" +
                "1 tsp ghee / clarified butter\n" +
                "¼ tsp cardamom powder","Method","1.firstly, in a mixi take 2 cup cashew and blend to a fine powder. make sure to pulse and blend else, the cashew will release oil and turns into a paste.\n" +
                "2.sieve the cashew powder making sure there are no lumps. keep aside.\n" +
                "3.in a large kadai take 1 cup sugar and ½ cup water.\n" +
                "4.stir well and dissolve sugar. boil for 5 minutes or until 1 string consistency is attained.\n" +
                "5.add in powdered cashew and mix well.\n" +
                "6.stir continuously until the mixture is well combined and smooth paste is formed.\n" +
                "7.now add 1 tsp ghee and ¼ tsp cardamom powder. mix well.\n" +
                "continue to cook until the mixture turns smooth paste and starts to separate pan slightly. do not overcook, as the burfi will turn hard.\n" +
                "8.transfer the mixture on to the butter paper. make sure to grease the butter paper with ghee.\n" +
                "now fold using a spatula until the mixture thickens forming a dough.\n" +
                "9.once the dough is formed, knead slightly, to form a soft dough.\n" +
                "10.place the cashew dough between butter paper and roll using a rolling pin.\n" +
                "roll slightly thick making sure it's uniform.\n" +
                "11now grease with ghee and apply silver leaf or silver vark. applying vark is optional.\n" +
                "12.now cut into diamond shape or shape of your choice.\n" +
                "finally, enjoy kaju katli for a month when stored in an airtight container.",R.drawable.kajukatli));
        recipes1.add(new Recipes("Rasagulla","2 litre milk, full cream\n" +
                "2 tbsp lemon juice\n" +
                "1 cup sugar\n" +
                "5 cup water\n" +
                "3 pod cardamom","Method","1.firstly, in a large vessel get 2 litre milk of milk to a boil stirring occasionally.\n" +
                "2.once the milk comes to a boil, pour 2 tbsp lemon juice and stir well. you can alternatively use curd or vinegar.\n" +
                "3.stir until the milk curdles keeping the flame on low to medium.\n" +
                "4.do not boil further once water separates completely.\n" +
                "5.drain the curdled milk over a cloth-lined over a colander. you can use the leftover water to make soup or knead the dough as they are very nutritious.\n" +
                "6.squeeze off the water completely. be careful as the curdled milk will be very hot.\n" +
                "7.rinse off the curdled milk with fresh water to remove sourness from lemon juice.\n" +
                "squeeze off the water completely. do not over squeeze as the moisture in paneer will be lost.\n" +
                "8.hang for 1 hour making sure the water is drained completely, yet remain the moisture.\n" +
                "9.after 1 hour, start to mash the paneer for 5 minutes.\n" +
                "10.mash the paneer till it turns out smooth texture without any grains of paneer.\n" +
                "11.now prepare small ball sized paneer and keep aside. cover and keep to prevent from drying.\n" +
                "in a large vessel take 1 cup sugar, 5 cup water and 3 pod cardamom.\n" +
                "stir and dissolve the sugar completely.\n" +
                "12.now boil the water for 5 minutes.\n" +
                "13.drop in rolled paneer balls one by one into boiling sugar water.\n" +
                "14.cover and boil for 10 minutes or until rasgulla doubles in size.\n" +
                "15.now drop into ice-cold water immediately, to prevent from shrinking in size.\n" +
                "once cooled completely, take into a serving bowl and pour in leftover sugar water.\n" +
                "finally, enjoy rasgulla chilled or as it is."
              ,R.drawable.rasagulla));
        recipes1.add(new Recipes("Moti Chor Laddu","FOR BOONDI:\n" +
                "2 cup besan / gram flour\n" +
                "2 tbsp rava / semolina / suji, fine\n" +
                "¼ tsp saffron food colour\n" +
                "1½ cup water\n" +
                "oil for frying\n" +
                "FOR SUGAR SYRUP:\n" +
                "1 cup sugar\n" +
                "½ tsp saffron food colour\n" +
                "½ cup water\n" +
                "¼ tsp cardamom powder\n" +
                "½ tsp lemon juice\n" +
                "2 tbsp cashew / kaju, chopped\n" +
                "2 tbsp pistachios, chopped","Method","1.firstly, to the hot sugar syrup, add prepared boondi.\n" +
                "2.mix well and make sure to coat all the boondi with sugar syrup.\n" +
                "3.continue to cook for 2 -3 minutes or until sugar syrup thickens.\n" +
                "4.cover and keep aside for 10 minutes.\n" +
                "5.after 10 minutes, sugar syrup is absorbed completely by boondi.\n" +
                "6.add 2 tbsp cashew and 2 tbsp pistachios. mix well.\n" +
                "7.you can see the the mixture is dried and all the sugar syrup has absorbed.\n" +
                "8.prepare the ladoo taking a small amount of boondi. add milk if required, to make moist laddu.\n" +
                "9.finally, motichoor laddo is ready to be served or refrigerate for a week.",R.drawable.motichoorladoo));
       recipes1.add(new Recipes("Soan papadi","FOR SUGAR SYRUP:\n" +
                "1 cup sugar\n" +
                "¾ cup water\n" +
                "¼ tsp saffron threads\n" +
                "¼ tsp cardamom powder / elachi powder\n" +
                "OTHER INGREDIENTS:\n" +
                "2 cups besan / gram flour\n" +
                "3 tbsp ghee / clarified butter\n" +
                "3 tbsp milk\n" +
                "1 cup ghee / clarified butter","Method","1.firstly, in a large bowl take besan and crumble with ghee and milk.\n" +
                "2.sieve the crumbled besan with the help of sieve. keep aside.\n" +
                "3.now in a large thick bottomed kadai, heat a cup of ghee.\n" +
                "4.add in crumbled and sieved besan.\n" +
                "5.combine well keeping the flame on low.\n" +
                "6.keeping the flame on low-medium till the mixture turns golden brown.\n" +
                "7.transfer the sugar syrup over besan mixture.\n" +
                "8.stir continuously, till the sugar syrups combines well with besan mixture.\n" +
                "9.continue to stir for 5 minutes or til the mixture cools and slightly thickens.\n" +
                "further the ghee absorbs.\n" +
                "and the mixture turns sticky.\n" +
                "10.transfer the mixture to the ghee greased plate.\n" +
                "11.level it up and set to a block making an inch thick.\n" +
                "12.add finely chopped pistachios and cashews.\n" +
                "cool completely for 2-3 hours.\n" +
                "13.cut the mohanthal into square pieces.\n" +
                "finally, serve or store soan popadi for a week by refrigerating.",R.drawable.soanpopadi));
        myRecyclerView=(RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter=new RecyclerViewAdapter(this,recipes1);
        myRecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myRecyclerView.setAdapter(myAdapter);
    }
}