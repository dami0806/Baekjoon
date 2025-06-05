function solution(order) {
    return String(order).split("")
        .filter(a=> /[369]/.test(a))
        .length;
   
}