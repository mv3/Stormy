package com.mattveit.stormy.weather;

/**
 * Created by MV on 10/10/2017.
 */

public class Drink {
    private int mId;
    private String mName;
    private String mCategory;
    private boolean mAlcoholic;
    private String mGlass;
    private String mInstructions;
    private String mThumbnail;
    private String[] mIngredients;
    private String[] mMeasure;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public boolean isAlcoholic() {
        return mAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        mAlcoholic = alcoholic;
    }

    public String getGlass() {
        return mGlass;
    }

    public void setGlass(String glass) {
        mGlass = glass;
    }

    public String getInstructions() {
        return mInstructions;
    }

    public void setInstructions(String instructions) {
        mInstructions = instructions;
    }

    public String getThumbnail() {
        return mThumbnail;
    }

    public void setThumbnail(String thumbnail) {
        mThumbnail = thumbnail;
    }

    public String[] getIngredients() {
        return mIngredients;
    }

    public void setIngredients(String[] ingredients) {
        mIngredients = ingredients;
    }

    public String[] getMeasure() {
        return mMeasure;
    }

    public void setMeasure(String[] measure) {
        mMeasure = measure;
    }
}
