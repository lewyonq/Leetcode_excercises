import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PermutationInString567 {
    public static void main(String[] args) {
        System.out.println(checkInclusion("adc", "dcda"));
    }

    static boolean checkInclusion(String s1, String s2) {
        return true;
    }

}

//first touch time limit exceeded
//static boolean checkInclusion(String s1, String s2) {
//    for(int i = 0; i < s2.length(); i++) {
//        List<Character> listOfCharactersS1 = s1
//                .chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.toList());
//
//        for(int j = i; j < s2.length(); j++) {
//            char temp = s2.charAt(j);
//
//            if(listOfCharactersS1.contains(temp)) {
//                listOfCharactersS1.remove(listOfCharactersS1.indexOf(temp));
//            } else {
//                break;
//            }
//
//            if(listOfCharactersS1.isEmpty()) {
//                return true;
//            }
//        }
//
//    }
//
//    return false;
//}

