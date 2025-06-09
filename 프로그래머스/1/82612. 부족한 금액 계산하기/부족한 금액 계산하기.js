function solution(price, money, count) {
   
    return price*((1+count)*count/2) - money > 0? price*((1+count)*count/2) - money: 0;
}