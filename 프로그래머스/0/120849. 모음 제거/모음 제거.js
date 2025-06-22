function solution(my_string) {
    //모음제거: str.match(/정규표현식/플래그)
    return (my_string.match(/[^aeiou]/g) || []).join("");

}