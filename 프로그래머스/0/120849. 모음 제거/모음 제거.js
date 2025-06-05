function solution(my_string) {
    
    return [...my_string].filter(c =>
                                 !['a','e','i','o','u'].includes(c)).join("")
}
