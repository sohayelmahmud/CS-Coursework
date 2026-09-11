public class SocialNetwork {
    static int noOfUsers = 1;

    static int[][] network = { { 1 } };


    public static void addUser() {
        noOfUsers++;
        int[][] temp = new int[noOfUsers][noOfUsers];

        for (int i = 0; i < network.length; i++) {
            for (int j = 0; j < network[i].length; j++) {
                temp[i][j] = network[i][j];
            }
        }

        temp[noOfUsers - 1][noOfUsers - 1] = 1;

        network = temp;
    }

    public static int[] findMutualFriends(int user1, int user2) {
        int[] tempFriends = new int[noOfUsers];
        int count = 0;
        for (int i = 0; i < noOfUsers; i++) {
            if (i != user1 && i != user2) {
                if (network[user1][i] == 1 && network[user2][i] == 1) {
                    tempFriends[count] = i;
                    count++;
                }
            }
        }
        int[] mutuals = new int[count];
        for (int i = 0; i < count; i++) {
            mutuals[i] = tempFriends[i];
        }
        return mutuals;
    }

    public static int[] findSocialButterfly() {
        int[] friendCounts = new int[noOfUsers];
        int maxFriends = -1;

        for (int i = 0; i < noOfUsers; i++) {
            int currentCount = 0;
            for (int j = 0; j < noOfUsers; j++) {
                if (i != j && network[i][j] == 1) {
                    currentCount++;
                }
            }
            friendCounts[i] = currentCount;
            if (currentCount > maxFriends) {
                maxFriends = currentCount;
            }
        }

        int butterflyCount = 0;
        for (int i = 0; i < noOfUsers; i++) {
            if (friendCounts[i] == maxFriends) {
                butterflyCount++;
            }
        }

        int[] butterflies = new int[butterflyCount];
        int index = 0;
        for (int i = 0; i < noOfUsers; i++) {
            if (friendCounts[i] == maxFriends) {
                butterflies[index] = i;
                index++;
            }
        }
        return butterflies;
    }
}
