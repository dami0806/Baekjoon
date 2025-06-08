function solution(phone_number) {
    let arr = "*".repeat(phone_number.length - 4);
    arr += phone_number.slice(phone_number.length - 4,phone_number.length);
    return arr;
}