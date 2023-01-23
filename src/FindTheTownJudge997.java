/*
In a town, there are n people labeled from 1 to n.
There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given an array trust where trust[i] = [ai, bi] representing
that the person labeled ai trusts the person labeled bi.

Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheTownJudge997 {
    public static void main(String[] args) {
        int[][] trust = {{1,2}, {2,3}};
        System.out.println(findJudge(3, trust));
    }

    static int findJudge(int n, int[][] trust) {
        if(n == 1 && trust.length == 0) {
            return 1;
        }

        int[] numberOfPeopleWhoTrust = new int[n + 1];

        for(int i = 0; i < trust.length; i++) {
            numberOfPeopleWhoTrust[trust[i][0]]--;
            numberOfPeopleWhoTrust[trust[i][1]]++;
        }

        for(int i = 0; i < numberOfPeopleWhoTrust.length; i++) {
            if(numberOfPeopleWhoTrust[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}

// first touch via sets
//static int findJudge(int n, int[][] trust) {
//    if(n == 0 && trust.length == 0) {
//        return 1;
//    }
//
//    Set<Integer> peopleA = new HashSet<>();
//    Set<Integer> peopleB = new HashSet<>();
//    int numberOfPeopleWhoTrust = 0;
//    int possibleResult = 0;
//
//    for (int i = 0; i < trust.length; i++) {
//        peopleA.add(trust[i][0]);
//        peopleB.add(trust[i][1]);
//    }
//
//    peopleB.removeAll(peopleA);
//
//    if(peopleB.isEmpty()) {
//        return -1;
//    } else {
//        possibleResult = peopleB.stream().findFirst().orElse(-1);
//    }
//
//    System.out.println(possibleResult);
//
//    for(int i = 0; i < trust.length; i++) {
//        if(trust[i][1] == possibleResult) {
//            numberOfPeopleWhoTrust++;
//        }
//    }
//
//    if(numberOfPeopleWhoTrust == n - 1) {
//        return possibleResult;
//    } else {
//        return -1;
//    }
//}
