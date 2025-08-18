import java.util.*;

public class PotionBrewing {
    
    static Map<String, Integer> potionCosts = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < N; i++) {
            String recipe = sc.nextLine();
            String[] parts = recipe.split("=");
            String potionName = parts[0].trim();
            String ingredients = parts[1].trim();
            int cost = getPotionCost(ingredients);
            potionCosts.put(potionName, cost);
        }
        String targetPotion = sc.nextLine();

       
        System.out.println(potionCosts.get(targetPotion));
        
        sc.close();
    }
    private static int getPotionCost(String ingredients) {
        String[] ingredientsList = ingredients.split("\\+");
        int cost = 0;
        
        for (String ingredient : ingredientsList) {
            ingredient = ingredient.trim();
            if (potionCosts.containsKey(ingredient)) {
                cost += potionCosts.get(ingredient);
            } else {
                cost += 1;
            }
        }
        
        return cost;
    }
}