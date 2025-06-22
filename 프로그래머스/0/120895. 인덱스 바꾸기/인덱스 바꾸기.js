function solution(my_string, num1, num2) {
    my_string= [...my_string]
    var answer = my_string[num1];
     my_string[num1] = my_string[num2];
     my_string[num2] = answer;
    return my_string.join("");
}