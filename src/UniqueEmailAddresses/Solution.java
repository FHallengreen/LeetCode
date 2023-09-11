package UniqueEmailAddresses;

import java.util.HashSet;

public class Solution {

    public int numUniqueEmails(String[] emails) {

        HashSet<String> uniqueList = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {

            int index = emails[i].indexOf("@");
            String email = emails[i].substring(0, index);
            String domain = emails[i].substring(index);

            if (email.contains("+")) {
                email = email.substring(0, email.indexOf("+"));
            }
            if (email.contains(".")) {
                while (email.contains(".")) {
                    int dotIndex = email.indexOf(".");
                    String partOne = email.substring(0, dotIndex);
                    String partTwo = email.substring(dotIndex + 1);
                    email = partOne + partTwo;
                }
            }
            email += domain;
            if (!uniqueList.contains(email)) {
                uniqueList.add(email);
            }
        }
        return uniqueList.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        Solution solution = new Solution();

        System.out.println(solution.numUniqueEmails(emails));
    }
}
