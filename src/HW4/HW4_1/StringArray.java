package HW4.HW4_1;

public class StringArray {
    public static void main(String[] args) {
        String[] planet = {"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"};
        int count = 0;
        for (int i=0;i<planet.length;i++) {
            String x = planet[i];
            for(int j =0;j<x.length();j++) {
                char y = x.charAt(j);
                switch(y) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                        break;
                }
            }
        }

        System.out.println("Total vowel in the planets are "+ count);

    }
}


//for (int i=0; i<planet.length;i++ ) {
//            String s = planet[i];
//            for(int j=0;j< s.length();j++){
//                if (vowel.indexOf(s.charAt(j)) != -1) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("Total vowel in planet is " + count);