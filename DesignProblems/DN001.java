package DesignProblems;

import java.util.*;

public class DN001 {
    // Inner class FoodRatings
    static class FoodRatings {
        private Map<String, String> foodToCuisine;
        private Map<String, Integer> foodToRating;
        private Map<String, PriorityQueue<Food>> cuisineToHeap;

        private static class Food {
            String name;
            int rating;

            Food(String name, int rating) {
                this.name = name;
                this.rating = rating;
            }
        }

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            foodToCuisine = new HashMap<>();
            foodToRating = new HashMap<>();
            cuisineToHeap = new HashMap<>();

            for (int i = 0; i < foods.length; i++) {
                String food = foods[i];
                String cuisine = cuisines[i];
                int rating = ratings[i];

                foodToCuisine.put(food, cuisine);
                foodToRating.put(food, rating);

                cuisineToHeap
                        .computeIfAbsent(cuisine, k -> new PriorityQueue<>(
                                (a, b) -> (b.rating != a.rating) ? b.rating - a.rating : a.name.compareTo(b.name)
                        ))
                        .add(new Food(food, rating));
            }
        }

        public void changeRating(String food, int newRating) {
            String cuisine = foodToCuisine.get(food);
            foodToRating.put(food, newRating);
            // Push the new rating into the heap (lazy deletion)
            cuisineToHeap.get(cuisine).add(new Food(food, newRating));
        }

        public String highestRated(String cuisine) {
            PriorityQueue<Food> heap = cuisineToHeap.get(cuisine);

            while (!heap.isEmpty()) {
                Food top = heap.peek();
                if (foodToRating.get(top.name) == top.rating) {
                    return top.name;
                }
                heap.poll();
            }

            return "";
        }
    }

    // Test in main
    public static void main(String[] args) {
        String[] foods = {"kimchi","miso","sushi","moussaka","ramen","bulgogi"};
        String[] cuisines = {"korean","japanese","japanese","greek","japanese","korean"};
        int[] ratings = {9, 12, 8, 15, 14, 7};

        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);

        System.out.println(foodRatings.highestRated("korean"));   // "kimchi"
        System.out.println(foodRatings.highestRated("japanese")); // "ramen"
        foodRatings.changeRating("sushi", 16);
        System.out.println(foodRatings.highestRated("japanese")); // "sushi"
        foodRatings.changeRating("ramen", 16);
        System.out.println(foodRatings.highestRated("japanese")); // "ramen"
    }
}
