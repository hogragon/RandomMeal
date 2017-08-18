package com.example.sonvu.randommeal;

import java.util.Random;

/**
 * Created by Son Vu on 8/18/2017.
 */

public class MealManager {

    private String[] foodList = new String[]{"bread","onion","mexican food","apple","soya","tofu"};

    static private MealManager sharedInstance;

    static public MealManager getSharedInstance() {
        if(sharedInstance == null){
            sharedInstance = new MealManager();
        }
        return sharedInstance;
    }


    public void loadFoods(){

    }

    public void addFoods(){

    }

    public String getRandomFood(){
        Random rd = new Random();
        int selectedIndex = rd.nextInt(foodList.length);
        return foodList[selectedIndex];
    }

}
