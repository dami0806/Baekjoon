class Solution {
    public int[] solution(long n) {
        // String으로 바꾸기 -> 뒤집기 -> int[] 반환 -> Array로 출력
    return new StringBuilder().append(n).reverse().chars().map(Character :: getNumericValue).toArray();
    }
}