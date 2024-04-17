package me.se0k;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    static LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
    static {
        map1.put("조약돌", 0);
        map1.put("석탄", 0);
        map1.put("철", 0);
        map1.put("금", 0);
        map1.put("에메랄드", 0);
        map1.put("다이아몬드", 0);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int break_count = 0;

        while(true) {
            System.out.print("숫자를 입력하세요: ");
            int num = in.nextInt();

            switch (num) {
                case 1 -> {
                    random();
                    break_count += 1;
                }
                case 2 -> {
                    if(break_count == 0) System.out.println("블럭을 부수지 않았습니다");
                    else System.out.println("지금까지 블럭을 " + break_count + "번 파괴 했습니다");
                }
                case 3 -> {
                    if(break_count == 0) System.out.println("블럭을 부수지 않았습니다");
                    else {
                        System.out.println("획득한 블럭");
                        map1.forEach((key, value) -> {
                            if (value != 0) System.out.println(key + ": " + value + "개");
                        });
                    }
                }
                case 4 -> {
                    System.out.println("게임 종료");
                    return;
                }
                default -> {
                    System.out.println("잘못 입력했습니다");
                }
            }
        }
    }

    public static void random() {
        double check = Math.floor(Math.random() * 100);
        String name;

        if (check <= 50) name = "조약돌";
        else if (check <= 70) name = "석탄";
        else if (check <= 85) name = "철";
        else if (check <= 95) name = "금";
        else if (check <= 99) name = "에메랄드";
        else name = "다이아몬드";

        Integer element = map1.computeIfPresent(name, (key, value) -> {
            return value + 1;
        });
        System.out.println(name + " 획득");
    }
}


/*
package me.se0k;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> map1 = new LinkedHashMap<>(){};

    public static void main(String[] args) {

        map1.put("조약돌", 0);
        map1.put("석탄", 0);
        map1.put("철", 0);
        map1.put("금", 0);
        map1.put("에메랄드", 0);
        map1.put("다이아몬드", 0);

        Scanner in = new Scanner(System.in);
        int break_count = 0;

        while(true) {
            System.out.print("숫자를 입력하세요: ");
            int num = in.nextInt();

            switch (num) {
                case 1 -> {
                    random();
                    break_count += 1;
                }
                case 2 -> {
                    if(break_count == 0) System.out.println("블럭을 부수지 않았습니다");
                    else System.out.println("지금까지 블럭을 " + break_count + "번 파괴 했습니다");
                }
                case 3 -> {
                    if(break_count == 0) System.out.println("블럭을 부수지 않았습니다");
                    else {
                        System.out.println("획득한 블럭");
                        map1.forEach((key, value) -> {
                            if (value != 0) System.out.println(key + ": " + value + "개");
                        });
//                        if(map1.get("조약돌") != 0) System.out.println("조약돌 : " + map1.get("조약돌") + " 개");
//                        if(map1.get("석탄") != 0) System.out.println("석탄 : " + map1.get("석탄") + " 개");
//                        if(map1.get("철") != 0) System.out.println("철 : " + map1.get("철") + " 개");
//                        if(map1.get("금") != 0) System.out.println("금 : " + map1.get("금") + " 개");
//                        if(map1.get("에메랄드") != 0) System.out.println("에메랄드 : " + map1.get("에메랄드") + " 개");
//                        if(map1.get("다이아몬드") != 0) System.out.println("다이아몬드 : " + map1.get("다이아몬드") + " 개");
                    }
                }
                case 4 -> {
                    System.out.println("게임 종료");
                    return;
                }
                default -> {
                    System.out.println("잘못 입력했습니다");
                }
            }
        }
    }

    public static void random() {
        double check = Math.floor(Math.random() * 100);
        String name;

        if (check <= 50) name = "조약돌";
        else if (check <= 70) name = "석탄";
        else if (check <= 85) name = "철";
        else if (check <= 95) name = "금";
        else if (check <= 99) name = "에메랄드";
        else name = "다이아몬드";

//        map1.put(name, map1.getOrDefault(name, 0) + 1);

        Integer element = map1.computeIfPresent(name, (key, value) -> {
            return value + 1;
        });
        System.out.println(name + " 획득");
    }
}
 */

