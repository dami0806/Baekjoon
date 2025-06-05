function solution(box, n) {
   let [가로,세로,높이] = box.map(a=>Math.floor(a/n))
   
    return 가로*세로*높이;
}