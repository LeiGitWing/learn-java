public class FindThePerpetrators {
    public static void main(String[] args) {
        String[] persons = { "A", "B", "C", "D", "E", "F" };  
        // 时间复杂度是O(n^2), 空间复杂度是O(n)
        // i < 2^6  手算发现最后的犯人是ABCF
        for (int i = 0; i < 64; i++) {    
            // t是什么? 为什么要用到t?
            int t = i;    
            int num[] = new int[6];  
            // 把是否有罪的状态换成二进制   
            for (int j = 5; j >= 0; j--) { 
            //  
                if (t / 2 > 0) {    
                    num[j] = t % 2;    
                    t = t / 2;    
                } else {    
                    num[j] = t;    
                    break;    
                }    
            }      
            // A B至少有一个人作案    
            if (num[0] + num[1] >= 1) {    
                // A D 不可能是同案犯 
                if (num[0] + num[3] <= 1) {    
                    // A E F 三人中至少有两人参与作案   
                    if (num[0] + num[4] + num[5] >= 2) {    
                        // B C 或同时作案，或与本案无关    
                        if ((num[1] + num[2] == 0 || num[1] + num[2] == 2)) {    
                            // C D 中有且仅有一人作案了    
                            if (num[2] + num[3] == 1) {    
                                // 如果 D 没有参与作案，则 E 也不可能参与作案    
                                if (num[3] == 0 && num[4] == 0 || num[3] == 1) {  
                                    for (int index = 0; index < num.length; index++) {    
                                        if (num[index] == 1) {    
                                            System.out.println(persons[index]);    
                                        }    
                                    } 
                                }   
                            }    
                        }    
                    }    
                }    
            }    
        }
    }
}