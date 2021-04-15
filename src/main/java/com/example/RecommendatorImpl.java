package com.example;

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("whiskey")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("for good protection from COVID-19, drink " + alcohol);
    }
}
