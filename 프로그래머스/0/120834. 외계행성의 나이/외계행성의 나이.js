function solution(age) {
    var answer = '';// 2-> 63+2 -> fromCharCode()
    return String(age).split("")
        .map(a=> String.fromCharCode((Number(a)+97))).join("")
}