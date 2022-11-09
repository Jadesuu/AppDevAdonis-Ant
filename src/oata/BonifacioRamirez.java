// public class BreakCamelCase {
//     public static String camelCase(String input) {
//     return input.replaceAll("([A-Z])", " $1");
// }
// }
//
// public class FindOdd {
//
//     public static int findIt(int[] array) {
//     for(int i = 0; i < array.length; i++){
//     int num = array[i];
//     int occurences = 0;
//
//     for (int j = 0; j < array.length; j++){
//     if (array[j] == num){
//     occurences++;
// }
// }
//
// if (occurences % 2 != 0){
//     return num;
// }
//
// }
//
// return 0;
// }
//
// }
//
// public class HowManyPages {
//     public int amountOfPages(int summary) {
//     int num = 0;
//     String n = "";
//
//     // loop till length = summary
//     while(n.length()<summary){
//     num++;
//     n += num;
// }
// return num;
// }
// }
//
// import java.util.LinkedList;
//
// public class Kata
// {
//     public static String expandedForm(int num) {
//     LinkedList<String> expandedList = new LinkedList<>();
//     int digit;
//     int multiplier = 1;
//     while (num > 0) {
//     digit = (num % 10) * multiplier;
//     if (digit != 0) expandedList.push(Integer.toString(digit));
//     num /= 10;
//     multiplier *= 10;
// }
// return String.join(" + ", expandedList);
// }
// }
//
// public class Multiply {
//     public static Double multiply(Double a, Double b) {
//     return a * b;
// }
// }
//
// public class RomanNumeralsEncoder {
//
//     public String solution(int n) {
//     String result = "";
//     do {
//
//     if(n/1000 >= 1){
//     result += converted("M", n/1000);
//     n = n%1000;
//
// }else if(n/900 >= 1){
//     result += converted("CM", n/900);
//     n = n%900;
//
// }else if(n/500 >= 1){
//     result += converted("D", n/500);
//     n = n%500;
//
// }else if(n/400 >= 1){
//     result += converted("CD", n/400);
//     n = n%400;
//
// }else if(n/100 >= 1){
//     result += converted("C", n/100);
//     n = n%100;
//
// }else if(n/90 >= 1){
//     result += converted("XC", n/90);
//     n = n%90;
//
// }else if(n/50 >= 1){
//     result += converted("L", n/50);
//     n = n%50;
//
// }else if(n/40 >= 1){
//     result += converted("XL", n/40);
//     n = n%40;
//
// }else if(n/10 >= 1){
//     result += converted("X", n/10);
//     n = n%10;
//
// }else if(n/9 >= 1){
//     result += converted("IX", n/9);
//     n = n%9;
//
// }else if(n/5 >= 1) {
//     result += converted("V", n/5);
//     n = n % 5;
//
// }else if(n/4 >= 1){
//     result += converted("IV", n/4);
//     n = n%4;
//
// }else if(n/1 >= 1){
//     result += converted("I", n/1);
//     n = n%1;
//
// }
// }while(n != 0);
// return result;
// }
//
// private String converted(String s, int i){
//     String result="";
//     for(int j = 0; j < i; j++){
//         result+=s;
//     }
//     return result;
// }
// }
//
// import java.lang.StringBuilder;
// import java.util.stream.Collectors;
// import java.util.Arrays;
// public class StringToCamelCase {
//     class Solution{
//
//     static String toCamelCase(String s){
//     String [] strings = s.split("[-_]");
//
//     return strings[0] + Arrays.stream(strings, 1, strings.length)
// .map(Solution::firstLetterToUpperCase)
// .collect(Collectors.joining());
// }
// static String firstLetterToUpperCase(String s){
//     return s.substring(0,1).toUpperCase() + s.substring(1);
// }
// }
// }
//
// import java.util.*;
//
// public class nextSmaller {
//     public static long nextSmaller(long n) {
//     char[] chars = Long.toString(n).toCharArray();
//
//     int[] ints = new int[chars.length];
//     for (int i = 0; i < chars.length; i++) {
//     ints[i] =   Character.digit(chars[i], 10);
// }
//
// int startingIndex = ints.length - 1;
// for (int i = ints.length - 2; i >= 0; i--) {
//     int max = i == 0 ? 0 : Integer.MIN_VALUE;
//     int maxIndex = -1;
//     for (int j = i + 1; j < ints.length; j++) {
//         if (ints[j] > max && ints[j] < ints[i]) {
//             max = ints[j];
//             maxIndex = j;
//         }
//     }
//     if (maxIndex >= 0) {
//         int temp = ints[maxIndex];
//         ints[maxIndex] = ints[i];
//         ints[i] = temp;
//         startingIndex = i;
//         break;
//     }
// }
// for (int i = startingIndex + 1; i < ints.length - 1; i++) {
//     int max = ints[i];
//     int sortIndex = i;
//     for (int j = i; j < ints.length; j++) {
//         if (ints[j] > max) {
//             max = ints[j];
//             sortIndex = j;
//         }
//     }
//
//     int temp = ints[i];
//     ints[i] = max;
//     ints[sortIndex] = temp;
// }
// String newNum = "";
// for (int i = 0; i < ints.length; i++) {
//     newNum += ints[i];
// }
// long newValue = Long.valueOf(newNum);
// return newValue == n ? -1 : newValue;
//
// }
// }
