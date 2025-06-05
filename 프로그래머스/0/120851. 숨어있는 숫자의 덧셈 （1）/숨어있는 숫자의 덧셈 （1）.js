function solution(my_string) {
   
    return my_string.replace(/[^0-9]/g,"").split("")
                    .reduce((sum, cur) => sum+ Number(cur), 0);
}