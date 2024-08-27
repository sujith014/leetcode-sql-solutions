class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List res = new ArrayList<>();
        int maxCandies = candies[0];
        for (int num : candies) {
            if (maxCandies < num) maxCandies = num;
        }
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= maxCandies);
        }
        return res;
    }
}
